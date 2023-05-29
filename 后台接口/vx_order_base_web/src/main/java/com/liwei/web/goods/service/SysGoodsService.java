package com.liwei.web.goods.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.web.goods.entity.GoodsParm;
import com.liwei.web.goods.entity.SysGoods;

public interface SysGoodsService extends IService<SysGoods> {
void saveGoods(GoodsParm parm);
}