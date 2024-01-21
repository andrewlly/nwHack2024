package com.github.nwhack2024.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName plant_stages
 */
@TableName(value ="plant_stages")
@Data
public class PlantStages implements Serializable {
    /**
     * 
     */
    @TableId(value = "stage_id", type = IdType.AUTO)
    private Long stageId;

    /**
     * 
     */
    @TableField(value = "plant_id")
    private Integer plantId;

    /**
     * 
     */
    @TableField(value = "stage_name")
    private String stageName;

    /**
     * 
     */
    @TableField(value = "stage_description")
    private String stageDescription;

    /**
     * 
     */
    @TableField(value = "stage_start_day")
    private Integer stageStartDay;

    /**
     * 
     */
    @TableField(value = "stage_end_day")
    private Integer stageEndDay;

    /**
     * 
     */
    @TableField(value = "stage_tips")
    private String stageTips;

    /**
     * 
     */
    @TableField(value = "stage_image_url")
    private String stageImageUrl;

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
        PlantStages other = (PlantStages) that;
        return (this.getStageId() == null ? other.getStageId() == null : this.getStageId().equals(other.getStageId()))
            && (this.getPlantId() == null ? other.getPlantId() == null : this.getPlantId().equals(other.getPlantId()))
            && (this.getStageName() == null ? other.getStageName() == null : this.getStageName().equals(other.getStageName()))
            && (this.getStageDescription() == null ? other.getStageDescription() == null : this.getStageDescription().equals(other.getStageDescription()))
            && (this.getStageStartDay() == null ? other.getStageStartDay() == null : this.getStageStartDay().equals(other.getStageStartDay()))
            && (this.getStageEndDay() == null ? other.getStageEndDay() == null : this.getStageEndDay().equals(other.getStageEndDay()))
            && (this.getStageTips() == null ? other.getStageTips() == null : this.getStageTips().equals(other.getStageTips()))
            && (this.getStageImageUrl() == null ? other.getStageImageUrl() == null : this.getStageImageUrl().equals(other.getStageImageUrl()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStageId() == null) ? 0 : getStageId().hashCode());
        result = prime * result + ((getPlantId() == null) ? 0 : getPlantId().hashCode());
        result = prime * result + ((getStageName() == null) ? 0 : getStageName().hashCode());
        result = prime * result + ((getStageDescription() == null) ? 0 : getStageDescription().hashCode());
        result = prime * result + ((getStageStartDay() == null) ? 0 : getStageStartDay().hashCode());
        result = prime * result + ((getStageEndDay() == null) ? 0 : getStageEndDay().hashCode());
        result = prime * result + ((getStageTips() == null) ? 0 : getStageTips().hashCode());
        result = prime * result + ((getStageImageUrl() == null) ? 0 : getStageImageUrl().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stageId=").append(stageId);
        sb.append(", plantId=").append(plantId);
        sb.append(", stageName=").append(stageName);
        sb.append(", stageDescription=").append(stageDescription);
        sb.append(", stageStartDay=").append(stageStartDay);
        sb.append(", stageEndDay=").append(stageEndDay);
        sb.append(", stageTips=").append(stageTips);
        sb.append(", stageImageUrl=").append(stageImageUrl);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}