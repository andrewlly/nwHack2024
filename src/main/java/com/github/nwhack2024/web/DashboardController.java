package com.github.nwhack2024.web;

import com.github.nwhack2024.domain.DisplayPlant;
import com.github.nwhack2024.domain.PlantTask;
import com.github.nwhack2024.domain.ResponseResult;
import com.github.nwhack2024.service.UserPlantService;
import jakarta.annotation.Resource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class DashboardController {

    @Resource
    UserPlantService userPlantService;


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
            return new ResponseResult<>(403, "Failed login");
        }
        Map<String, Object> data = new HashMap<>();
        data.put("task",plantTasks);
        data.put("plants",plantsByUserName);
        return new ResponseResult<>(200, "loginSuccess", data);
    }
}
