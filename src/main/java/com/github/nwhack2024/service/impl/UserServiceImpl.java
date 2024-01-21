package com.github.nwhack2024.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.nwhack2024.domain.User;
import com.github.nwhack2024.service.UserService;
import com.github.nwhack2024.mapper.UserMapper;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




