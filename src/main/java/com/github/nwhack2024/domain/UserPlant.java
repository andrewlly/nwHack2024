package com.github.nwhack2024.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user_plant
 */
@TableName(value ="user_plant")
@Data
public class UserPlant implements Serializable {
    /**
     * 
     */
    @TableId(value = "user_plant_id", type = IdType.AUTO)
    private Long userPlantId;

    /**
     * 
     */
    @TableField(value = "user_plant_name")
    private String userPlantName;

    /**
     * 
     */
    @TableField(value = "user_id")
    private Integer userId;

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
    @TableField(value = "quantity")
    private Integer quantity;

    /**
     * 
     */
    @TableField(value = "date_planted")
    private Date datePlanted;

    /**
     * 
     */
    @TableField(value = "date_left")
    private Integer dateLeft;

    /**
     * 
     */
    @TableField(value = "current_condition")
    private String currentCondition;

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
        UserPlant other = (UserPlant) that;
        return (this.getUserPlantId() == null ? other.getUserPlantId() == null : this.getUserPlantId().equals(other.getUserPlantId()))
            && (this.getUserPlantName() == null ? other.getUserPlantName() == null : this.getUserPlantName().equals(other.getUserPlantName()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPlantId() == null ? other.getPlantId() == null : this.getPlantId().equals(other.getPlantId()))
            && (this.getStageId() == null ? other.getStageId() == null : this.getStageId().equals(other.getStageId()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getDatePlanted() == null ? other.getDatePlanted() == null : this.getDatePlanted().equals(other.getDatePlanted()))
            && (this.getDateLeft() == null ? other.getDateLeft() == null : this.getDateLeft().equals(other.getDateLeft()))
            && (this.getCurrentCondition() == null ? other.getCurrentCondition() == null : this.getCurrentCondition().equals(other.getCurrentCondition()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserPlantId() == null) ? 0 : getUserPlantId().hashCode());
        result = prime * result + ((getUserPlantName() == null) ? 0 : getUserPlantName().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPlantId() == null) ? 0 : getPlantId().hashCode());
        result = prime * result + ((getStageId() == null) ? 0 : getStageId().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getDatePlanted() == null) ? 0 : getDatePlanted().hashCode());
        result = prime * result + ((getDateLeft() == null) ? 0 : getDateLeft().hashCode());
        result = prime * result + ((getCurrentCondition() == null) ? 0 : getCurrentCondition().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userPlantId=").append(userPlantId);
        sb.append(", userPlantName=").append(userPlantName);
        sb.append(", userId=").append(userId);
        sb.append(", plantId=").append(plantId);
        sb.append(", stageId=").append(stageId);
        sb.append(", quantity=").append(quantity);
        sb.append(", datePlanted=").append(datePlanted);
        sb.append(", dateLeft=").append(dateLeft);
        sb.append(", currentCondition=").append(currentCondition);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}