package com.github.nwhack2024.web;


import com.github.nwhack2024.domain.ResponseResult;
import com.github.nwhack2024.domain.entity.User;
import com.github.nwhack2024.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/auth/login")
    public ResponseResult login(@RequestBody User user){
        return loginService.login(user);
    }
}
