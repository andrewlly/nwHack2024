package com.github.nwhack2024.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName plant_care_task
 */
@TableName(value ="plant_care_task")
@Data
public class PlantCareTask implements Serializable {
    private Long plantCareTaskID;

    private String plantCareTaskName;

    private Integer plantID;

    private Integer stageID;

    private Integer dayOffset;

    private Integer instructionType;

    private String instructions;

    private Integer is_deleted;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PlantCareTask other = (PlantCareTask) that;
        return (this.getPlantCareTaskID() == null ? other.getPlantCareTaskID() == null : this.getPlantCareTaskID().equals(other.getPlantCareTaskID()))
            && (this.getPlantCareTaskName() == null ? other.getPlantCareTaskName() == null : this.getPlantCareTaskName().equals(other.getPlantCareTaskName()))
            && (this.getPlantID() == null ? other.getPlantID() == null : this.getPlantID().equals(other.getPlantID()))
            && (this.getStageID() == null ? other.getStageID() == null : this.getStageID().equals(other.getStageID()))
            && (this.getDayOffset() == null ? other.getDayOffset() == null : this.getDayOffset().equals(other.getDayOffset()))
            && (this.getInstructionType() == null ? other.getInstructionType() == null : this.getInstructionType().equals(other.getInstructionType()))
            && (this.getInstructions() == null ? other.getInstructions() == null : this.getInstructions().equals(other.getInstructions()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlantCareTaskID() == null) ? 0 : getPlantCareTaskID().hashCode());
        result = prime * result + ((getPlantCareTaskName() == null) ? 0 : getPlantCareTaskName().hashCode());
        result = prime * result + ((getPlantID() == null) ? 0 : getPlantID().hashCode());
        result = prime * result + ((getStageID() == null) ? 0 : getStageID().hashCode());
        result = prime * result + ((getDayOffset() == null) ? 0 : getDayOffset().hashCode());
        result = prime * result + ((getInstructionType() == null) ? 0 : getInstructionType().hashCode());
        result = prime * result + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plantCareTaskID=").append(plantCareTaskID);
        sb.append(", plantCareTaskName=").append(plantCareTaskName);
        sb.append(", plantID=").append(plantID);
        sb.append(", stageID=").append(stageID);
        sb.append(", dayOffset=").append(dayOffset);
        sb.append(", instructionType=").append(instructionType);
        sb.append(", instructions=").append(instructions);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}