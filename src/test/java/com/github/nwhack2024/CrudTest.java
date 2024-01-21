package com.github.nwhack2024;


import com.github.nwhack2024.mapper.PlantsMapper;
import com.github.nwhack2024.mapper.UserMapper;
import com.github.nwhack2024.service.UserPlantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;


@SpringBootTest
public class CrudTest {

    @Autowired (required = false)
    UserPlantService userPlantService;


    @Test
    void testMapper(){
        System.out.println("+=======================");
        System.out.println();
        System.out.println(userPlantService.getPlantsByUserName("john.doe@example.com").get(0));

    }



}
