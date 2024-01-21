package com.github.nwhack2024.service;

import com.github.nwhack2024.domain.entity.Plants;
import com.github.nwhack2024.domain.entity.UserPlant;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserPlantService extends IService<UserPlant> {
    List<Plants> getPlantsByUserName(String userName);
}
