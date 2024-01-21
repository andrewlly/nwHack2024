package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.Plants;
import com.github.nwhack2024.service.PlantsService;
import com.github.nwhack2024.mapper.PlantsMapper;
import org.springframework.stereotype.Service;

/**
* @author liuyu
* @description 针对表【plants】的数据库操作Service实现
* @createDate 2024-01-20 16:53:09
*/
@Service
public class PlantsServiceImpl extends ServiceImpl<PlantsMapper, Plants>
    implements PlantsService{

}




