package com.liwei.web.category.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.web.category.entity.SysCategory;
import com.liwei.web.category.mapper.SysCategoryMapper;
import com.liwei.web.category.service.SysCategoryService;
import org.springframework.stereotype.Service;

@Service
public class SysCategoryServiceImpl extends ServiceImpl<SysCategoryMapper,
        SysCategory> implements SysCategoryService {
}
