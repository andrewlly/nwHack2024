package com.github.nwhack2024.service.impl;

import com.github.nwhack2024.domain.ResponseResult;
import com.github.nwhack2024.domain.entity.User;
import com.github.nwhack2024.security.LoginUser;
import com.github.nwhack2024.service.LoginService;
import com.github.nwhack2024.util.JwtUtil;
import jakarta.annotation.Resource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private AuthenticationManager authenticationManager;

    @Override
    public ResponseResult login(User user) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
        Authentication authenticate;
        try{
            authenticate = authenticationManager.authenticate(token);
        } catch (AuthenticationException e){
            return new ResponseResult<>(403, "Failed login");
        }
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        String jwt = JwtUtil.createJWT(loginUser);
        Map<String,String> map = new HashMap<>();
        map.put("token",jwt);
        return new ResponseResult<>(200, "loginSuccess", map);
    }
}
