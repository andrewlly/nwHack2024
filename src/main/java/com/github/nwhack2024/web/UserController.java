package com.github.nwhack2024.web;


import com.github.nwhack2024.domain.entity.User;
import com.github.nwhack2024.service.UserService;
import com.github.nwhack2024.util.response.ResponseHandler;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class UserController {


    @Resource
    UserService userService;



    @PostMapping ("/auth/create")
    @ResponseBody
    private ResponseEntity<Map<String, Object>> saveUser(@RequestBody User user) {
        try {
            userService.save(user);
        } catch (Exception e) {
            return ResponseHandler.handleErrResponse(e);
        }
        //todo:add auth
        return ResponseEntity.noContent().build();
    }


    @PostMapping ("/user/{uid}")
    @ResponseBody
    private ResponseEntity<Map<String, Object>> updateUserByID(@PathVariable Long uid, @RequestBody User user) {
        try {
            userService.updateUserById(uid,user);
        } catch (Exception e) {
            return ResponseHandler.handleErrResponse(e);
        }

        return ResponseEntity.noContent().build();
    }





}
