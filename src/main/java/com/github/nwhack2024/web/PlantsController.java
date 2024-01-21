package com.github.nwhack2024.web;


import com.github.nwhack2024.domain.entity.User;
import com.github.nwhack2024.domain.entity.UserPlant;
import com.github.nwhack2024.service.UserPlantService;
import com.github.nwhack2024.util.response.ResponseHandler;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PlantsController {
    @Resource
    UserPlantService userPlantService;
    @PostMapping("/plant/create")
    @ResponseBody
    private ResponseEntity<Map<String, Object>> saveUser(@RequestBody UserPlant userPlant) {
        try {
            userPlantService.save(userPlant);
        } catch (Exception e) {
            return ResponseHandler.handleErrResponse(e);
        }
        return ResponseEntity.noContent().build();
    }
}
