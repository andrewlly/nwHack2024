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
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Long uid;

    /**
     * 
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    /**
     * 
     */
    @TableField(value = "password")
    private String password;

    /**
     * 
     */
    @TableField(value = "email")
    private String email;

    /**
     * 
     */
    @TableField(value = "avatar_url")
    private String avatarUrl;

    /**
     * 
     */
    @TableField(value = "latest_login")
    private Date latestLogin;

    /**
     * 
     */
    @TableField(value = "creation_date")
    private Date creationDate;

    /**
     * 
     */
    @TableField(value = "bio")
    private String bio;

    /**
     * 
     */
    @TableField(value = "user_level")
    private Integer userLevel;

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
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAvatarUrl() == null ? other.getAvatarUrl() == null : this.getAvatarUrl().equals(other.getAvatarUrl()))
            && (this.getLatestLogin() == null ? other.getLatestLogin() == null : this.getLatestLogin().equals(other.getLatestLogin()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getBio() == null ? other.getBio() == null : this.getBio().equals(other.getBio()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAvatarUrl() == null) ? 0 : getAvatarUrl().hashCode());
        result = prime * result + ((getLatestLogin() == null) ? 0 : getLatestLogin().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getBio() == null) ? 0 : getBio().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", userName=").append(userName);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", latestLogin=").append(latestLogin);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", bio=").append(bio);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}