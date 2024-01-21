package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.UserPlant;
import com.github.nwhack2024.service.UserPlantService;
import com.github.nwhack2024.mapper.UserPlantMapper;
import org.springframework.stereotype.Service;

@Service
public class UserPlantServiceImpl extends ServiceImpl<UserPlantMapper, UserPlant>
    implements UserPlantService{

}




