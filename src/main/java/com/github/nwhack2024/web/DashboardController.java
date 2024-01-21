package com.github.nwhack2024.web;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController("/dashboard")
public class DashboardController {


    @GetMapping()
    public ResponseEntity<Map<String, Object>> getDashBoardInfo() {
        return null;
    }
}
