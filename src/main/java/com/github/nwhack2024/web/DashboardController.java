package com.github.nwhack2024.web;

import com.github.nwhack2024.domain.DisplayPlant;
import com.github.nwhack2024.domain.PlantTask;
import com.github.nwhack2024.domain.ResponseResult;
import com.github.nwhack2024.domain.entity.UserTasks;
import com.github.nwhack2024.service.UserPlantService;
import com.github.nwhack2024.service.UserTasksService;
import jakarta.annotation.Resource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class DashboardController {

    @Resource
    UserPlantService userPlantService;

    @Resource
    UserTasksService userTasksS;


    @GetMapping("/dashboard")
    public ResponseResult getDashBoardInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        List<DisplayPlant> plantsByUserName;
        List<PlantTask> plantTasks;
        try{
            plantsByUserName = userPlantService.getPlantsByUserName(userDetails.getUsername());
            plantTasks = userPlantService.getPlantTask(userDetails.getUsername());
        } catch (Exception e){
            return new ResponseResult<>(402, "Info Not exist");
        }
        Map<String, Object> data = new HashMap<>();
        data.put("task",plantTasks);
        data.put("plants",plantsByUserName);
        return new ResponseResult<>(200, "data fetched for login", data);
    }

    @PostMapping("dashboard")
    public ResponseResult checkTask(@RequestBody UserTasks userTasks) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        userTasks.setCompleted(1);
        try{
            userTasksS.updateById(userTasks);
        } catch (Exception e){
            return new ResponseResult<>(402, "Info Not exist");
        }
        Date currentDate = new Date();
        userTasks.setCompleted(0);
        userTasks.setCreationDate(currentDate);
        userTasks.setUserTasksId(null);
        userTasksS.save(userTasks);
        return new ResponseResult<>(200, "checkSuccess");
    }
}
