package com.liwei.web.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.web.user.entity.SysUser;
import com.liwei.web.user.mapper.SysUserMapper;
import com.liwei.web.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Override
    public SysUser login(String userName, String password) {
        LambdaQueryWrapper<SysUser> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(SysUser::getUsername,userName);
        lambdaQueryWrapper.eq(SysUser::getPassword,password);
        List<SysUser> users = getBaseMapper().selectList(lambdaQueryWrapper);
        if(users != null && users.size()>0){
            return users.get(0);
        }else {
            return null;
        }
    }
}
