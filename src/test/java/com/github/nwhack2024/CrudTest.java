package com.github.nwhack2024;


import com.github.nwhack2024.domain.entity.User;
import com.github.nwhack2024.mapper.PlantsMapper;
import com.github.nwhack2024.mapper.UserMapper;
import com.github.nwhack2024.service.UserPlantService;
import com.github.nwhack2024.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;


@SpringBootTest
public class CrudTest {

    @Autowired (required = false)
    UserService test;


    @Test
    void testMapper(){
        System.out.println("+=======================");
        System.out.println();
        User user = new User();
        user.setEmail("213123123123");
        user.setPhoneNumber("#123123123");
        user.setUserName("aaa");
        user.setPassword("1234");
        System.out.println(test.save(user));

    }



}
