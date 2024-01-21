package com.github.nwhack2024.mapper;

import com.github.nwhack2024.domain.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Set;

public interface SysMenuMapper extends BaseMapper<SysMenu> {
    Set<SysMenu> selectAllByRoleId(Set<Long> roleSet);

}




