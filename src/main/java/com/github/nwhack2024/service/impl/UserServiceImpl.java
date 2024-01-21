package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.entity.User;
import com.github.nwhack2024.service.UserService;
import com.github.nwhack2024.mapper.UserMapper;
import com.github.nwhack2024.util.InputParser;
import jakarta.annotation.Resource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    UserMapper userMapper;
    @Resource
    PasswordEncoder encoder;

    @Override
    public boolean save(User user) {
        //todo: check input;
        User validUser = InputParser.parseInput(user);
        validUser.setPassword(encoder.encode(user.getPassword()));
        return super.save(validUser);
    }


    public boolean updateUserById(Long uid, User user) {
        User validUser = InputParser.parseInput(user);
        user.setUid(uid);
        int i = userMapper.updateById(validUser);
        return i != 0;
    }

}




