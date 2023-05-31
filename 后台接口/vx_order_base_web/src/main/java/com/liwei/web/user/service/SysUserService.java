package com.liwei.web.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.web.user.entity.SysUser;

public interface SysUserService extends IService<SysUser> {
     SysUser login(String userName, String password);

}
