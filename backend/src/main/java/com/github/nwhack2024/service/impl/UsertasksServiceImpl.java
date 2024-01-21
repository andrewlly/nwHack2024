package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.entities.Usertasks;
import com.github.nwhack2024.service.UsertasksService;
import com.github.nwhack2024.mapper.UsertasksMapper;
import org.springframework.stereotype.Service;

/**
* @author liuyu
* @description 针对表【UserTasks】的数据库操作Service实现
* @createDate 2024-01-20 16:37:38
*/
@Service
public class UsertasksServiceImpl extends ServiceImpl<UsertasksMapper, Usertasks>
    implements UsertasksService{

}




