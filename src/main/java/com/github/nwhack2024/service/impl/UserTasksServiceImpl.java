package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.UserTasks;
import com.github.nwhack2024.service.UserTasksService;
import com.github.nwhack2024.mapper.UserTasksMapper;
import org.springframework.stereotype.Service;

/**
* @author liuyu
* @description 针对表【user_tasks】的数据库操作Service实现
* @createDate 2024-01-20 16:53:09
*/
@Service
public class UserTasksServiceImpl extends ServiceImpl<UserTasksMapper, UserTasks>
    implements UserTasksService{

}




