package com.github.nwhack2024.domain;

import com.github.nwhack2024.util.Util;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class DisplayPlant {

    String name;
    String plantType;
    Integer progress;
    String condition;
    Date date;
    Integer life;
    Integer stageNumber;
    String stageMessage;

    public DisplayPlant(String name, Date date, String condition){
        this.name = name;
        this.date = date;
        this.condition = condition;
    }

    public void setAttr(String s, Integer i){
        plantType = s;
        life = Util.getLife(i,date);
        this.progress = Util.getProgress(i,date);
    }


    public void setStage(String stageName) {
        stageNumber = Util.getStage(stageName);
        stageMessage = "Stage:" + stageName;
    }
}
