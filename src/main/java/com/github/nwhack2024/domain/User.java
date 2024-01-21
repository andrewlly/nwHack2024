package com.github.nwhack2024.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    private Long uid;

    private String user_name;

    private String phone_number;

    private String password;

    private String email;

    private String avatar_url;

    private Date latest_login;

    private Date creation_date;

    private String bio;

    private Integer user_level;

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
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getPhone_number() == null ? other.getPhone_number() == null : this.getPhone_number().equals(other.getPhone_number()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAvatar_url() == null ? other.getAvatar_url() == null : this.getAvatar_url().equals(other.getAvatar_url()))
            && (this.getLatest_login() == null ? other.getLatest_login() == null : this.getLatest_login().equals(other.getLatest_login()))
            && (this.getCreation_date() == null ? other.getCreation_date() == null : this.getCreation_date().equals(other.getCreation_date()))
            && (this.getBio() == null ? other.getBio() == null : this.getBio().equals(other.getBio()))
            && (this.getUser_level() == null ? other.getUser_level() == null : this.getUser_level().equals(other.getUser_level()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getPhone_number() == null) ? 0 : getPhone_number().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAvatar_url() == null) ? 0 : getAvatar_url().hashCode());
        result = prime * result + ((getLatest_login() == null) ? 0 : getLatest_login().hashCode());
        result = prime * result + ((getCreation_date() == null) ? 0 : getCreation_date().hashCode());
        result = prime * result + ((getBio() == null) ? 0 : getBio().hashCode());
        result = prime * result + ((getUser_level() == null) ? 0 : getUser_level().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", user_name=").append(user_name);
        sb.append(", phone_number=").append(phone_number);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", avatar_url=").append(avatar_url);
        sb.append(", latest_login=").append(latest_login);
        sb.append(", creation_date=").append(creation_date);
        sb.append(", bio=").append(bio);
        sb.append(", user_level=").append(user_level);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}