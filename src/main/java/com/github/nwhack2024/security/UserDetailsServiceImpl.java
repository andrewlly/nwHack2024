package com.github.nwhack2024.security;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.nwhack2024.domain.SysMenu;
import com.github.nwhack2024.domain.SysRole;
import com.github.nwhack2024.domain.User;
import com.github.nwhack2024.mapper.SysMenuMapper;
import com.github.nwhack2024.mapper.SysRoleMapper;
import com.github.nwhack2024.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private SysMenuMapper menuMapper;

    @Resource
    private SysRoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String email) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getEmail, email);
        User user = userMapper.selectOne(lambdaQueryWrapper);
        if(Objects.isNull(user)){
            throw new RuntimeException("invalid account");
        }
        Set<SysRole> roles = roleMapper.selectRoleByUserID(user.getUid());
        Set<String> roleLabels = new HashSet<>();
        Set<Long> roleIds = new HashSet<>();
        for(SysRole role: roles){
            roleLabels.add(role.getRole_label());
            roleIds.add(role.getId());
        }
        Set<SysMenu> menus = menuMapper.selectAllByRoleId(roleIds);
        List<String> perms= new ArrayList<>();
        for (SysMenu m: menus) {
            perms.add(m.getPerms());
        }

        return new LoginUser(user,perms,roleLabels);
    }


}
