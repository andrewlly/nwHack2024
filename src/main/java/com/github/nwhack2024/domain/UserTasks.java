package com.github.nwhack2024.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName user_tasks
 */
@TableName(value ="user_tasks")
@Data
public class UserTasks implements Serializable {
    private Long userTasksID;

    private Integer plantCareTaskID;

    private Integer userPlantID;

    private Integer completed;

    private String taskCompletedNotes;

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
        UserTasks other = (UserTasks) that;
        return (this.getUserTasksID() == null ? other.getUserTasksID() == null : this.getUserTasksID().equals(other.getUserTasksID()))
            && (this.getPlantCareTaskID() == null ? other.getPlantCareTaskID() == null : this.getPlantCareTaskID().equals(other.getPlantCareTaskID()))
            && (this.getUserPlantID() == null ? other.getUserPlantID() == null : this.getUserPlantID().equals(other.getUserPlantID()))
            && (this.getCompleted() == null ? other.getCompleted() == null : this.getCompleted().equals(other.getCompleted()))
            && (this.getTaskCompletedNotes() == null ? other.getTaskCompletedNotes() == null : this.getTaskCompletedNotes().equals(other.getTaskCompletedNotes()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserTasksID() == null) ? 0 : getUserTasksID().hashCode());
        result = prime * result + ((getPlantCareTaskID() == null) ? 0 : getPlantCareTaskID().hashCode());
        result = prime * result + ((getUserPlantID() == null) ? 0 : getUserPlantID().hashCode());
        result = prime * result + ((getCompleted() == null) ? 0 : getCompleted().hashCode());
        result = prime * result + ((getTaskCompletedNotes() == null) ? 0 : getTaskCompletedNotes().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userTasksID=").append(userTasksID);
        sb.append(", plantCareTaskID=").append(plantCareTaskID);
        sb.append(", userPlantID=").append(userPlantID);
        sb.append(", completed=").append(completed);
        sb.append(", taskCompletedNotes=").append(taskCompletedNotes);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}