package com.liwei.web.goods_specs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.web.goods_specs.entity.SysGoodsSpecs;
import com.liwei.web.goods_specs.mapper.SysGoodsSpecsMapper;
import com.liwei.web.goods_specs.service.SysGoodsSpecsService;
import org.springframework.stereotype.Service;

@Service
public class SysGoodsSpecsImpl extends ServiceImpl<SysGoodsSpecsMapper, SysGoodsSpecs> implements SysGoodsSpecsService {
}