package com.liwei.web.goods.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
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
}