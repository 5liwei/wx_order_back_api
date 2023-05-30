package com.liwei.web.user_collect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.web.user_collect.entity.UserCollect;
import com.liwei.web.user_collect.mapper.UserCollectMapper;
import com.liwei.web.user_collect.service.UserCollectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCollectServiceImpl extends ServiceImpl<UserCollectMapper, UserCollect> implements UserCollectService {
    @Override
    public List<UserCollect> getList(String openid) {
        return this.baseMapper.getList(openid);
    }
}
