package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.DisplayPlant;
import com.github.nwhack2024.domain.PlantTask;
import com.github.nwhack2024.domain.entity.*;
import com.github.nwhack2024.mapper.*;
import com.github.nwhack2024.service.PlantCareTaskService;
import com.github.nwhack2024.service.UserPlantService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import static net.sf.jsqlparser.parser.feature.Feature.select;


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

    @Resource
    PlantCareTaskMapper plantCareTaskMapper;
    @Resource
    UserTasksMapper userTasksMapper;


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

    public List<PlantTask> getPlantTask(String userName){
        List<PlantTask> ans = new ArrayList<>();
        List<User> users = userMapper.selectByMap(Map.of("email", userName));
        Long uid = users.get(0).getUid();
        List<UserPlant> userPlants = userPlantMapper.selectByMap(Map.of("user_id", uid));
        for (UserPlant up : userPlants) {
            List<UserTasks> userTasks = userTasksMapper.selectByMap(Map.of("user_plant_id", up.getUserPlantId()));
            for (UserTasks ut: userTasks){
                PlantCareTask plantCareTask = plantCareTaskMapper.selectById(ut.getPlantCareTaskId());
                ans.add(new PlantTask(up,ut,plantCareTask));
            }
        }
        return ans;
    }
}




