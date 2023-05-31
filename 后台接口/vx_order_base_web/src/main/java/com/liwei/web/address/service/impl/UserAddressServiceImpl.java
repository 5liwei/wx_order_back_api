package com.liwei.web.address.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.web.address.entity.UserAddress;
import com.liwei.web.address.mapper.UserAddressMapper;
import com.liwei.web.address.service.UserAddressService;
import org.springframework.stereotype.Service;


@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {
}
