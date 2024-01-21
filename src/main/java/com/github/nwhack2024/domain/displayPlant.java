package com.github.nwhack2024.domain;

import com.github.nwhack2024.util.Util;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class displayPlant {

    String name;
    String plantType;
    Integer progress;
    String condition;
    Date date;

    String stageName;

    public displayPlant(String name, Integer progress, Date date, String condition){
        this.name = name;
        this.progress = progress;
        this.date = date;
        this.condition = condition;
    }

    public displayPlant(String s, Integer i){
        plantType = s;
        Integer e = Util.getProgress(i,date);
    }



}
