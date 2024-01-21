package com.github.nwhack2024;


import com.github.nwhack2024.mapper.PlantsMapper;
import com.github.nwhack2024.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;


@SpringBootTest
public class CrudTest {

    @Autowired (required = false)
    UserMapper userMapper;


    @Test
    void testMapper(){

        System.out.println(userMapper.selectByMap(Map.of("email","john.doe@example.com")));
    }



}
