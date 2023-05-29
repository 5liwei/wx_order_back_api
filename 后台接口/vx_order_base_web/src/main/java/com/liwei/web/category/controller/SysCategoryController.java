package com.liwei.web.category.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liwei.utils.ResultUtils;
import com.liwei.utils.ResultVo;
import com.liwei.web.category.entity.ListParm;
import com.liwei.web.category.entity.SysCategory;
import com.liwei.web.category.service.SysCategoryService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class SysCategoryController {
    @Autowired
    private SysCategoryService sysCategoryService;

    //新增
    @PostMapping
    public ResultVo add(@RequestBody SysCategory sysCategory) {
        if (sysCategoryService.save(sysCategory)) {
            return ResultUtils.success("新增成功!");
        }
        return ResultUtils.error("新增失败!");
    }

    //编辑
    @PutMapping
    public ResultVo edit(@RequestBody SysCategory sysCategory) {
        if (sysCategoryService.updateById(sysCategory)) {
            return ResultUtils.success("编辑成功!");
        }
        return ResultUtils.error("编辑失败!");
    }

    //删除
    @DeleteMapping("/{categoryId}")
    public ResultVo delete(@PathVariable("categoryId") Long categoryId) {
        if (sysCategoryService.removeById(categoryId)) {
            return ResultUtils.success("删除成功!");
        }
        return ResultUtils.error("删除失败!");
    }

    //列表
    @GetMapping("/list")
    public ResultVo list(ListParm listParm) {
//构造分页对象
        IPage<SysCategory> page = new Page<>
                (listParm.getCurrentPage(), listParm.getPageSize());
//构造查询条件
        QueryWrapper<SysCategory> query = new QueryWrapper<>();
        query.lambda().like(StringUtils.isNotEmpty(listParm.getCategoryName()), SysCategory::getCategoryName, listParm.getCategoryName())
                .orderByAsc(SysCategory::getOrderNum);
        IPage<SysCategory> list = sysCategoryService.page(page, query);
        return ResultUtils.success("查询成功!", list);
    }
}