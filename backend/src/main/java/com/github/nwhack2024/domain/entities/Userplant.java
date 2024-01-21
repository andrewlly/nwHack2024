package com.github.nwhack2024.domain.entities;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName UserPlant
 */
@Data
public class Userplant implements Serializable {
    /**
     * 
     */
    private Long userPlantID;

    /**
     * 
     */
    private String userPlantName;

    /**
     * 
     */
    private Integer userID;

    /**
     * 
     */
    private Integer plantID;

    /**
     * 
     */
    private Integer stageID;

    /**
     * 
     */
    private Integer quantity;

    /**
     * 
     */
    private Date datePlanted;

    /**
     * 
     */
    private Integer dateLeft;

    /**
     * 
     */
    private String currentCondition;

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
        Userplant other = (Userplant) that;
        return (this.getUserPlantID() == null ? other.getUserPlantID() == null : this.getUserPlantID().equals(other.getUserPlantID()))
            && (this.getUserPlantName() == null ? other.getUserPlantName() == null : this.getUserPlantName().equals(other.getUserPlantName()))
            && (this.getUserID() == null ? other.getUserID() == null : this.getUserID().equals(other.getUserID()))
            && (this.getPlantID() == null ? other.getPlantID() == null : this.getPlantID().equals(other.getPlantID()))
            && (this.getStageID() == null ? other.getStageID() == null : this.getStageID().equals(other.getStageID()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getDatePlanted() == null ? other.getDatePlanted() == null : this.getDatePlanted().equals(other.getDatePlanted()))
            && (this.getDateLeft() == null ? other.getDateLeft() == null : this.getDateLeft().equals(other.getDateLeft()))
            && (this.getCurrentCondition() == null ? other.getCurrentCondition() == null : this.getCurrentCondition().equals(other.getCurrentCondition()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserPlantID() == null) ? 0 : getUserPlantID().hashCode());
        result = prime * result + ((getUserPlantName() == null) ? 0 : getUserPlantName().hashCode());
        result = prime * result + ((getUserID() == null) ? 0 : getUserID().hashCode());
        result = prime * result + ((getPlantID() == null) ? 0 : getPlantID().hashCode());
        result = prime * result + ((getStageID() == null) ? 0 : getStageID().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getDatePlanted() == null) ? 0 : getDatePlanted().hashCode());
        result = prime * result + ((getDateLeft() == null) ? 0 : getDateLeft().hashCode());
        result = prime * result + ((getCurrentCondition() == null) ? 0 : getCurrentCondition().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userPlantID=").append(userPlantID);
        sb.append(", userPlantName=").append(userPlantName);
        sb.append(", userID=").append(userID);
        sb.append(", plantID=").append(plantID);
        sb.append(", stageID=").append(stageID);
        sb.append(", quantity=").append(quantity);
        sb.append(", datePlanted=").append(datePlanted);
        sb.append(", dateLeft=").append(dateLeft);
        sb.append(", currentCondition=").append(currentCondition);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}