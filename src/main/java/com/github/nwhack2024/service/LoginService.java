package com.github.nwhack2024.service;

import com.github.nwhack2024.domain.ResponseResult;
import com.github.nwhack2024.domain.entity.User;

public interface LoginService {

    ResponseResult login(User user);
}
