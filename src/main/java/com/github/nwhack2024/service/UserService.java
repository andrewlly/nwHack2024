package com.github.nwhack2024.service;

import com.github.nwhack2024.domain.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {

    boolean updateUserById(Long uid, User user);
}
