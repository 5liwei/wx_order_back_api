package com.liwei.web.user_order_detail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.web.user_order_detail.entity.UserOrderDetail;
import com.liwei.web.user_order_detail.mapper.UserOrderDetailMapper;
import com.liwei.web.user_order_detail.service.UserOrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class UserOrderDetailServiceImpl extends ServiceImpl<UserOrderDetailMapper, UserOrderDetail> implements UserOrderDetailService {
}
