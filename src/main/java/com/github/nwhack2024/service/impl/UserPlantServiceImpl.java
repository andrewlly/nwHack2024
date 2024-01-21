package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.entity.PlantStages;
import com.github.nwhack2024.domain.entity.Plants;
import com.github.nwhack2024.domain.entity.User;
import com.github.nwhack2024.domain.entity.UserPlant;
import com.github.nwhack2024.mapper.PlantStagesMapper;
import com.github.nwhack2024.mapper.PlantsMapper;
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
    @Resource
    PlantsMapper plantsMapper;
    @Resource
    UserPlantMapper userPlantMapper;
    @Resource
    PlantStagesMapper plantStagesMapper;

    @Override
    public List<Plants> getPlantsByUserName(String userName) {
        List<User> users = userMapper.selectByMap(Map.of("email", userName));
        Long uid = users.get(0).getUid();
        List<UserPlant> userPlants = userPlantMapper.selectByMap(Map.of("user_id", uid));

        return null;
    }
}




