package com.github.nwhack2024.domain;

import com.github.nwhack2024.domain.entity.PlantCareTask;
import com.github.nwhack2024.domain.entity.UserPlant;
import com.github.nwhack2024.domain.entity.UserTasks;
import com.github.nwhack2024.util.Util;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlantTask {
    String plantName;
    String taskName;
    Boolean completed;
    Date date;
    Integer stageId;
    Integer plantId;
    String instructions;
    Integer offset;

    Date endDate;

    public PlantTask (UserPlant up, UserTasks ut, PlantCareTask pt){
        plantName = up.getUserPlantName();
        taskName = pt.getPlantCareTaskName();
        instructions  = pt.getInstructions();
        completed = ut.getCompleted() == 1;
        date = ut.getCreationDate();
        plantId = up.getPlantId();
        stageId = up.getStageId();
        instructions = pt.getInstructions();
        offset = pt.getDayOffset();
        endDate = Util.addDaysToDate(ut.getCreationDate(),pt.getDayOffset());
    }

}
