package com.github.nwhack2024.web;

import com.github.nwhack2024.domain.DisplayPlant;
import com.github.nwhack2024.domain.PlantTask;
import com.github.nwhack2024.domain.ResponseResult;
import com.github.nwhack2024.domain.entity.*;
import com.github.nwhack2024.mapper.PlantStagesMapper;
import com.github.nwhack2024.mapper.PlantsMapper;
import com.github.nwhack2024.mapper.UserMapper;
import com.github.nwhack2024.service.PlantStagesService;
import com.github.nwhack2024.service.UserPlantService;
import com.github.nwhack2024.service.UserTasksService;
import com.github.nwhack2024.util.response.ResponseHandler;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

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

    @Resource
    PlantStagesMapper plantStagesMapper;

    @Resource
    UserMapper userMapper;

    @Resource
    PlantsMapper plantsMapper;


    @GetMapping("/dashboard")
    public ResponseResult getDashBoardInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        User user = userMapper.selectByMap(Map.of("email", username)).get(0);
        List<DisplayPlant> plantsByUserName;
        List<PlantTask> plantTasks;
        try{
            plantsByUserName = userPlantService.getPlantsByUserName(userDetails.getUsername());
            plantTasks = userPlantService.getPlantTask(userDetails.getUsername());
        } catch (Exception e){
            return new ResponseResult<>(402, "Info Not exist");
        }
        Map<String, Object> data = new HashMap<>();
        data.put("full_name", user.getUserName());
        String[] s = user.getUserName().split(" ");
        data.put("first_name",s[0]);
        data.put("task",plantTasks);
        data.put("plants",plantsByUserName);
        return new ResponseResult<>(200, "data fetched for login", data);
    }

    @PostMapping("/dashboard/task")
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

    @PostMapping("/dashboard/state")
    public ResponseResult checkState(@RequestBody UserPlant userPlant) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        Integer stageId = userPlant.getStageId();
        PlantStages plantStages = plantStagesMapper.selectById(stageId);
        if(plantStages == null){
            plantStagesMapper.deleteById(stageId);
            return new ResponseResult<>(201, "We have reach the last stage");
        }
        Integer stageEndDay = plantStages.getStageEndDay();
        userPlant.setStageId(stageEndDay);
        try{
            userPlantService.saveOrUpdate(userPlant);
        } catch (Exception e){
            return new ResponseResult<>(402, "Info Not exist");
        }
        return new ResponseResult<>(200, "checkSuccess");
    }

    @PostMapping("/dashboard/create")
    @ResponseBody
    private ResponseEntity<Map<String, Object>> savePlant(@RequestBody UserPlant userPlant) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        User user = userMapper.selectByMap(Map.of("email", username)).get(0);
        userPlant.setUserId(user.getUid());
        try {
            userPlantService.save(userPlant);
        } catch (Exception e) {
            return ResponseHandler.handleErrResponse(e);
        }
        return ResponseEntity.noContent().build();
    }
}
