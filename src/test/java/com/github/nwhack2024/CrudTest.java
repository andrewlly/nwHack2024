package com.github.nwhack2024;


import com.github.nwhack2024.mapper.PlantsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CrudTest {

    @Autowired (required = false)
    PlantsMapper plantsMapper;


    @Test
    void testMapper(){

        System.out.println(plantsMapper.selectById(1));
    }



}
