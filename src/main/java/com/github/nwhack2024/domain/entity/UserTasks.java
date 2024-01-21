package com.github.nwhack2024.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user_tasks
 */
@TableName(value ="user_tasks")
@Data
public class UserTasks implements Serializable {
    /**
     * 
     */
    @TableId(value = "user_tasks_id", type = IdType.AUTO)
    private Long userTasksId;

    /**
     * 
     */
    @TableField(value = "plant_care_task_id")
    private Integer plantCareTaskId;

    /**
     * 
     */
    @TableField(value = "user_plant_id")
    private Integer userPlantId;

    /**
     * 
     */
    @TableField(value = "completed")
    private Integer completed;

    /**
     * 
     */
    @TableField(value = "creation_date")
    private Date creationDate;

    /**
     * 
     */
    @TableField(value = "completed_date")
    private Date completedDate;

    /**
     * 
     */
    @TableField(value = "task_completed_notes")
    private String taskCompletedNotes;

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
        UserTasks other = (UserTasks) that;
        return (this.getUserTasksId() == null ? other.getUserTasksId() == null : this.getUserTasksId().equals(other.getUserTasksId()))
            && (this.getPlantCareTaskId() == null ? other.getPlantCareTaskId() == null : this.getPlantCareTaskId().equals(other.getPlantCareTaskId()))
            && (this.getUserPlantId() == null ? other.getUserPlantId() == null : this.getUserPlantId().equals(other.getUserPlantId()))
            && (this.getCompleted() == null ? other.getCompleted() == null : this.getCompleted().equals(other.getCompleted()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getCompletedDate() == null ? other.getCompletedDate() == null : this.getCompletedDate().equals(other.getCompletedDate()))
            && (this.getTaskCompletedNotes() == null ? other.getTaskCompletedNotes() == null : this.getTaskCompletedNotes().equals(other.getTaskCompletedNotes()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserTasksId() == null) ? 0 : getUserTasksId().hashCode());
        result = prime * result + ((getPlantCareTaskId() == null) ? 0 : getPlantCareTaskId().hashCode());
        result = prime * result + ((getUserPlantId() == null) ? 0 : getUserPlantId().hashCode());
        result = prime * result + ((getCompleted() == null) ? 0 : getCompleted().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getCompletedDate() == null) ? 0 : getCompletedDate().hashCode());
        result = prime * result + ((getTaskCompletedNotes() == null) ? 0 : getTaskCompletedNotes().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userTasksId=").append(userTasksId);
        sb.append(", plantCareTaskId=").append(plantCareTaskId);
        sb.append(", userPlantId=").append(userPlantId);
        sb.append(", completed=").append(completed);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", completedDate=").append(completedDate);
        sb.append(", taskCompletedNotes=").append(taskCompletedNotes);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}