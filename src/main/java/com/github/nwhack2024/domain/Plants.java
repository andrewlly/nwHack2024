package com.github.nwhack2024.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName plants
 */
@TableName(value ="plants")
@Data
public class Plants implements Serializable {
    /**
     * 
     */
    @TableId(value = "plant_id", type = IdType.AUTO)
    private Long plantId;

    /**
     * 
     */
    @TableField(value = "plant_name")
    private String plantName;

    /**
     * 
     */
    @TableField(value = "plant_description")
    private String plantDescription;

    /**
     * 
     */
    @TableField(value = "care_level")
    private Integer careLevel;

    /**
     * 
     */
    @TableField(value = "suitable_climate")
    private String suitableClimate;

    /**
     * 
     */
    @TableField(value = "suitable_season")
    private String suitableSeason;

    /**
     * 
     */
    @TableField(value = "harvest_time")
    private Integer harvestTime;

    /**
     * 
     */
    @TableField(value = "plant_graphic_url")
    private String plantGraphicUrl;

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
        Plants other = (Plants) that;
        return (this.getPlantId() == null ? other.getPlantId() == null : this.getPlantId().equals(other.getPlantId()))
            && (this.getPlantName() == null ? other.getPlantName() == null : this.getPlantName().equals(other.getPlantName()))
            && (this.getPlantDescription() == null ? other.getPlantDescription() == null : this.getPlantDescription().equals(other.getPlantDescription()))
            && (this.getCareLevel() == null ? other.getCareLevel() == null : this.getCareLevel().equals(other.getCareLevel()))
            && (this.getSuitableClimate() == null ? other.getSuitableClimate() == null : this.getSuitableClimate().equals(other.getSuitableClimate()))
            && (this.getSuitableSeason() == null ? other.getSuitableSeason() == null : this.getSuitableSeason().equals(other.getSuitableSeason()))
            && (this.getHarvestTime() == null ? other.getHarvestTime() == null : this.getHarvestTime().equals(other.getHarvestTime()))
            && (this.getPlantGraphicUrl() == null ? other.getPlantGraphicUrl() == null : this.getPlantGraphicUrl().equals(other.getPlantGraphicUrl()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlantId() == null) ? 0 : getPlantId().hashCode());
        result = prime * result + ((getPlantName() == null) ? 0 : getPlantName().hashCode());
        result = prime * result + ((getPlantDescription() == null) ? 0 : getPlantDescription().hashCode());
        result = prime * result + ((getCareLevel() == null) ? 0 : getCareLevel().hashCode());
        result = prime * result + ((getSuitableClimate() == null) ? 0 : getSuitableClimate().hashCode());
        result = prime * result + ((getSuitableSeason() == null) ? 0 : getSuitableSeason().hashCode());
        result = prime * result + ((getHarvestTime() == null) ? 0 : getHarvestTime().hashCode());
        result = prime * result + ((getPlantGraphicUrl() == null) ? 0 : getPlantGraphicUrl().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plantId=").append(plantId);
        sb.append(", plantName=").append(plantName);
        sb.append(", plantDescription=").append(plantDescription);
        sb.append(", careLevel=").append(careLevel);
        sb.append(", suitableClimate=").append(suitableClimate);
        sb.append(", suitableSeason=").append(suitableSeason);
        sb.append(", harvestTime=").append(harvestTime);
        sb.append(", plantGraphicUrl=").append(plantGraphicUrl);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}