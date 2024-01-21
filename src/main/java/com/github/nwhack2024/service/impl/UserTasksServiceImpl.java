package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.entity.UserTasks;
import com.github.nwhack2024.service.UserTasksService;
import com.github.nwhack2024.mapper.UserTasksMapper;
import org.springframework.stereotype.Service;


@Service
public class UserTasksServiceImpl extends ServiceImpl<UserTasksMapper, UserTasks>
    implements UserTasksService{

}




