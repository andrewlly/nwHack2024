package com.github.nwhack2024.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName plant_care_task
 */
@TableName(value ="plant_care_task")
@Data
public class PlantCareTask implements Serializable {
    /**
     * 
     */
    @TableId(value = "plant_care_task_id", type = IdType.AUTO)
    private Long plantCareTaskId;

    /**
     * 
     */
    @TableField(value = "plant_care_task_name")
    private String plantCareTaskName;

    /**
     * 
     */
    @TableField(value = "plant_id")
    private Integer plantId;

    /**
     * 
     */
    @TableField(value = "stage_id")
    private Integer stageId;

    /**
     * 
     */
    @TableField(value = "day_offset")
    private Integer dayOffset;

    /**
     * 
     */
    @TableField(value = "instruction_type")
    private Integer instructionType;

    /**
     * 
     */
    @TableField(value = "instructions")
    private String instructions;

    /**
     * 
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    @TableField(exist = false)
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
        return (this.getPlantCareTaskId() == null ? other.getPlantCareTaskId() == null : this.getPlantCareTaskId().equals(other.getPlantCareTaskId()))
            && (this.getPlantCareTaskName() == null ? other.getPlantCareTaskName() == null : this.getPlantCareTaskName().equals(other.getPlantCareTaskName()))
            && (this.getPlantId() == null ? other.getPlantId() == null : this.getPlantId().equals(other.getPlantId()))
            && (this.getStageId() == null ? other.getStageId() == null : this.getStageId().equals(other.getStageId()))
            && (this.getDayOffset() == null ? other.getDayOffset() == null : this.getDayOffset().equals(other.getDayOffset()))
            && (this.getInstructionType() == null ? other.getInstructionType() == null : this.getInstructionType().equals(other.getInstructionType()))
            && (this.getInstructions() == null ? other.getInstructions() == null : this.getInstructions().equals(other.getInstructions()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlantCareTaskId() == null) ? 0 : getPlantCareTaskId().hashCode());
        result = prime * result + ((getPlantCareTaskName() == null) ? 0 : getPlantCareTaskName().hashCode());
        result = prime * result + ((getPlantId() == null) ? 0 : getPlantId().hashCode());
        result = prime * result + ((getStageId() == null) ? 0 : getStageId().hashCode());
        result = prime * result + ((getDayOffset() == null) ? 0 : getDayOffset().hashCode());
        result = prime * result + ((getInstructionType() == null) ? 0 : getInstructionType().hashCode());
        result = prime * result + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plantCareTaskId=").append(plantCareTaskId);
        sb.append(", plantCareTaskName=").append(plantCareTaskName);
        sb.append(", plantId=").append(plantId);
        sb.append(", stageId=").append(stageId);
        sb.append(", dayOffset=").append(dayOffset);
        sb.append(", instructionType=").append(instructionType);
        sb.append(", instructions=").append(instructions);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}