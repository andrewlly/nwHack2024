package com.github.nwhack2024;


import com.github.nwhack2024.domain.PlantTask;
import com.github.nwhack2024.service.UserPlantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class CrudTest {

    @Autowired (required = false)
    UserPlantService test;


    @Test
    void testMapper(){
        List<PlantTask> plantsByUserName = test.getPlantTask("john.doe@example.com");
        plantsByUserName.forEach(System.out::println);
    }



}
