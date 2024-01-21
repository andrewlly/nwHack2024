package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.entity.Plants;
import com.github.nwhack2024.service.PlantsService;
import com.github.nwhack2024.mapper.PlantsMapper;
import org.springframework.stereotype.Service;


@Service
public class PlantsServiceImpl extends ServiceImpl<PlantsMapper, Plants>
    implements PlantsService{

}




