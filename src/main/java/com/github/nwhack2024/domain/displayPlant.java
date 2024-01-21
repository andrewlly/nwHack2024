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
    Integer stageNumber;

    public displayPlant(String name, Date date, String condition){
        this.name = name;
        this.date = date;
        this.condition = condition;
    }

    public displayPlant(String s, Integer i){
        plantType = s;
        this.progress = Util.getProgress(i,date);
    }

    public displayPlant(String stageName){
        stageNumber = Util.getStage(stageName);
    }



}
