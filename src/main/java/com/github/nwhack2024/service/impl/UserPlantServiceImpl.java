package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.DisplayPlant;
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

import java.util.ArrayList;
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
    public List<DisplayPlant> getPlantsByUserName(String userName) {
        List<DisplayPlant> ans = new ArrayList<>();
        List<User> users = userMapper.selectByMap(Map.of("email", userName));
        Long uid = users.get(0).getUid();
        List<UserPlant> userPlants = userPlantMapper.selectByMap(Map.of("user_id", uid));
        for (UserPlant up : userPlants) {
            Plants plants = plantsMapper.selectById(up.getPlantId());
            DisplayPlant displayPlant = new DisplayPlant(up.getUserPlantName(), up.getDatePlanted(), up.getCurrentCondition());
            displayPlant.setAttr(plants.getPlantName(),plants.getHarvestTime());
            PlantStages plantStages = plantStagesMapper.selectById(up.getStageId());
            displayPlant.setStage(plantStages.getStageName());
            ans.add(displayPlant);
        }

        return ans;
    }
}




