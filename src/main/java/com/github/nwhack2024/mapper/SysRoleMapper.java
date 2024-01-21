package com.github.nwhack2024.mapper;

import com.github.nwhack2024.domain.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Set;

public interface SysRoleMapper extends BaseMapper<SysRole> {
    Set<SysRole> selectRoleByUserID(long id);
    Set<String> selectRoleLabelByUserID(long id);

}




