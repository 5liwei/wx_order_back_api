package com.liwei.web.goods.controller;
import com.liwei.utils.ResultUtils;
import com.liwei.utils.ResultVo;
import com.liwei.web.goods.entity.GoodsParm;
import com.liwei.web.goods.service.SysGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/goods")
public class SysGoodsController {
@Autowired
private SysGoodsService sysGoodsService;
//新增菜品
@PostMapping
public ResultVo add(@RequestBody GoodsParm parm){
sysGoodsService.saveGoods(parm);
return ResultUtils.success("新增成功!");
}
}