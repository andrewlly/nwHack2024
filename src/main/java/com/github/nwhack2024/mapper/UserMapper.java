package com.github.nwhack2024.mapper;

import com.github.nwhack2024.domain.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM user WHERE is_deleted = 0 AND email = #{email}")
    User getByEmail(@Param("email") String email);
}




