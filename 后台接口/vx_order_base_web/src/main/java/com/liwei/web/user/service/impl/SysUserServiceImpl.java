package com.liwei.web.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.web.user.entity.SysUser;
import com.liwei.web.user.mapper.SysUserMapper;
import com.liwei.web.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    // @Autowired
    // private SysUserMapper sysUserMapper;
}
