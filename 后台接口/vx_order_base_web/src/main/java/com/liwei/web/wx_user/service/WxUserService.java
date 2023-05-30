package com.liwei.web.wx_user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.web.wx_user.entity.WxUser;


/**
 * @Author java实战基地
 * @Version 2383404558
 */
public interface WxUserService extends IService<WxUser> {
    int saveOrUpdateInfo(WxUser user);
}
