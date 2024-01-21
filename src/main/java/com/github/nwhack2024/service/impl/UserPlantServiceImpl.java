package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.entity.Plants;
import com.github.nwhack2024.domain.entity.UserPlant;
import com.github.nwhack2024.mapper.UserMapper;
import com.github.nwhack2024.service.UserPlantService;
import com.github.nwhack2024.mapper.UserPlantMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class UserPlantServiceImpl extends ServiceImpl<UserPlantMapper, UserPlant>
    implements UserPlantService{

    @Resource
    UserMapper userMapper;

    @Override
    public List<Plants> getPlantsByUserName(String userName) {
        userMapper.selectByMap(Map.of("email",userName));
        return null;
    }
}




