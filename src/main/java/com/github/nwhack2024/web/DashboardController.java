package com.github.nwhack2024.web;

import com.github.nwhack2024.service.UserPlantService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController("/dashboard")
public class DashboardController {

    @Resource
    UserPlantService userPlantService;


    @GetMapping()
    public ResponseEntity<Map<String, Object>> getDashBoardInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
//        userPlantService.getMap();

        return null;
    }
}
