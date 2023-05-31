package com.liwei.web.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.liwei.web.goods_specs.entity.SysGoodsSpecs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_goods")
public class SysGoods {
    @TableId(type = IdType.AUTO)
    private Long goodsId;
    private Long categoryId;
    private String goodsName;
    private String goodsImage;

    private String goodsDesc;
    private String status;
    private String goodsUnit;
    private String orderNum;
    @TableField(exist = false)
    List<SysGoodsSpecs> specs = new ArrayList<>();
}