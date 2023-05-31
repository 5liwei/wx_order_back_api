package com.liwei.web.user_collect.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwei.web.user_collect.entity.UserCollect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCollectMapper extends BaseMapper<UserCollect> {
    List<UserCollect> getList(@Param("openid") String openid);
}