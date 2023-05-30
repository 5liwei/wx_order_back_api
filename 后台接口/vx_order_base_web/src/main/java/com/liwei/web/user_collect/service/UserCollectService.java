package com.liwei.web.user_collect.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.web.user_collect.entity.UserCollect;

import java.util.List;

public interface UserCollectService extends IService<UserCollect> {
    List<UserCollect> getList(String openid);
}
