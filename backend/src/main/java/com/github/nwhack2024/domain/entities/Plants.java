package com.github.nwhack2024.domain.entities;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName Plants
 */
@Data
public class Plants implements Serializable {
    /**
     * 
     */
    private Long plantID;

    /**
     * 
     */
    private String plantName;

    /**
     * 
     */
    private String plantDescription;

    /**
     * 
     */
    private Integer careLevel;

    /**
     * 
     */
    private String suitableClimate;

    /**
     * 
     */
    private String suitableSeason;

    /**
     * 
     */
    private Integer harvestTime;

    /**
     * 
     */
    private String plantGraphicURL;

    /**
     * 
     */
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
        Plants other = (Plants) that;
        return (this.getPlantID() == null ? other.getPlantID() == null : this.getPlantID().equals(other.getPlantID()))
            && (this.getPlantName() == null ? other.getPlantName() == null : this.getPlantName().equals(other.getPlantName()))
            && (this.getPlantDescription() == null ? other.getPlantDescription() == null : this.getPlantDescription().equals(other.getPlantDescription()))
            && (this.getCareLevel() == null ? other.getCareLevel() == null : this.getCareLevel().equals(other.getCareLevel()))
            && (this.getSuitableClimate() == null ? other.getSuitableClimate() == null : this.getSuitableClimate().equals(other.getSuitableClimate()))
            && (this.getSuitableSeason() == null ? other.getSuitableSeason() == null : this.getSuitableSeason().equals(other.getSuitableSeason()))
            && (this.getHarvestTime() == null ? other.getHarvestTime() == null : this.getHarvestTime().equals(other.getHarvestTime()))
            && (this.getPlantGraphicURL() == null ? other.getPlantGraphicURL() == null : this.getPlantGraphicURL().equals(other.getPlantGraphicURL()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlantID() == null) ? 0 : getPlantID().hashCode());
        result = prime * result + ((getPlantName() == null) ? 0 : getPlantName().hashCode());
        result = prime * result + ((getPlantDescription() == null) ? 0 : getPlantDescription().hashCode());
        result = prime * result + ((getCareLevel() == null) ? 0 : getCareLevel().hashCode());
        result = prime * result + ((getSuitableClimate() == null) ? 0 : getSuitableClimate().hashCode());
        result = prime * result + ((getSuitableSeason() == null) ? 0 : getSuitableSeason().hashCode());
        result = prime * result + ((getHarvestTime() == null) ? 0 : getHarvestTime().hashCode());
        result = prime * result + ((getPlantGraphicURL() == null) ? 0 : getPlantGraphicURL().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plantID=").append(plantID);
        sb.append(", plantName=").append(plantName);
        sb.append(", plantDescription=").append(plantDescription);
        sb.append(", careLevel=").append(careLevel);
        sb.append(", suitableClimate=").append(suitableClimate);
        sb.append(", suitableSeason=").append(suitableSeason);
        sb.append(", harvestTime=").append(harvestTime);
        sb.append(", plantGraphicURL=").append(plantGraphicURL);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}