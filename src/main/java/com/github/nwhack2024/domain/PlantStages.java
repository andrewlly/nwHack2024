package com.github.nwhack2024.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName plant_stages
 */
@TableName(value ="plant_stages")
@Data
public class PlantStages implements Serializable {
    private Long stageID;

    private Integer plantID;

    private String stageName;

    private String stageDescription;

    private Integer stageStartDay;

    private Integer stageEndDay;

    private String stageTips;

    private String stageImageURL;

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
        PlantStages other = (PlantStages) that;
        return (this.getStageID() == null ? other.getStageID() == null : this.getStageID().equals(other.getStageID()))
            && (this.getPlantID() == null ? other.getPlantID() == null : this.getPlantID().equals(other.getPlantID()))
            && (this.getStageName() == null ? other.getStageName() == null : this.getStageName().equals(other.getStageName()))
            && (this.getStageDescription() == null ? other.getStageDescription() == null : this.getStageDescription().equals(other.getStageDescription()))
            && (this.getStageStartDay() == null ? other.getStageStartDay() == null : this.getStageStartDay().equals(other.getStageStartDay()))
            && (this.getStageEndDay() == null ? other.getStageEndDay() == null : this.getStageEndDay().equals(other.getStageEndDay()))
            && (this.getStageTips() == null ? other.getStageTips() == null : this.getStageTips().equals(other.getStageTips()))
            && (this.getStageImageURL() == null ? other.getStageImageURL() == null : this.getStageImageURL().equals(other.getStageImageURL()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStageID() == null) ? 0 : getStageID().hashCode());
        result = prime * result + ((getPlantID() == null) ? 0 : getPlantID().hashCode());
        result = prime * result + ((getStageName() == null) ? 0 : getStageName().hashCode());
        result = prime * result + ((getStageDescription() == null) ? 0 : getStageDescription().hashCode());
        result = prime * result + ((getStageStartDay() == null) ? 0 : getStageStartDay().hashCode());
        result = prime * result + ((getStageEndDay() == null) ? 0 : getStageEndDay().hashCode());
        result = prime * result + ((getStageTips() == null) ? 0 : getStageTips().hashCode());
        result = prime * result + ((getStageImageURL() == null) ? 0 : getStageImageURL().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stageID=").append(stageID);
        sb.append(", plantID=").append(plantID);
        sb.append(", stageName=").append(stageName);
        sb.append(", stageDescription=").append(stageDescription);
        sb.append(", stageStartDay=").append(stageStartDay);
        sb.append(", stageEndDay=").append(stageEndDay);
        sb.append(", stageTips=").append(stageTips);
        sb.append(", stageImageURL=").append(stageImageURL);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}