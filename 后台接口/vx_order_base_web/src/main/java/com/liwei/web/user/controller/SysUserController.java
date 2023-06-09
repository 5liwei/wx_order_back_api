package com.liwei.web.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liwei.utils.ResultUtils;
import com.liwei.utils.ResultVo;
import com.liwei.web.user.entity.SysUser;
import com.liwei.web.user.entity.UserPageParm;
import com.liwei.web.user.service.SysUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/user")

public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    //新增
    @PostMapping
    public ResultVo add(@RequestBody SysUser user) {
        if (sysUserService.save(user)) {
            return ResultUtils.success("新增成功!");
        }
        return ResultUtils.error("新增失败!");
    }

    //编辑
    @PutMapping
    public ResultVo edit(@RequestBody SysUser user) {
        if (sysUserService.save(user)) {
            return ResultUtils.success("编辑成功!");
        }
        return ResultUtils.error("编辑失败!");
    }

    //删除
    @DeleteMapping("/{userId}")
    public ResultVo delete(@PathVariable("userId") Long userId) {
        if (sysUserService.removeById(userId)) {
            return ResultUtils.success("删除成功!");
        }
        return ResultUtils.error("删除失败!");
    }

    //列表
    @GetMapping("/list")
    public ResultVo list(UserPageParm parm) {
        //构造分页
        IPage<SysUser> page = new Page<>(parm.getCurrentPage(),
                parm.getPageSize());
        //构造查询条件
        QueryWrapper<SysUser> query = new QueryWrapper<>();
        query.lambda().like(StringUtils.isNotEmpty(parm.getName()),
                        SysUser::getName, parm.getName())
                .like(StringUtils.isNotEmpty(parm.getPhone()),
                        SysUser::getPhone, parm.getPhone())
                .orderByAsc(SysUser::getName);
        IPage<SysUser> list = sysUserService.page(page, query);
        return ResultUtils.success("查询成功", list);
    }

    @PostMapping("/login")
    public ResultVo login(@RequestBody Map<String,String> user) {
        String account = user.get("account");
        String password = user.get("password");
        String type = user.get("type");
        String msg= "用户或密码错误";
        SysUser loginUser = sysUserService.login(account,password);
        if(loginUser != null) {
            return ResultUtils.success("登陆成功");
        }else {
            return ResultUtils.error(msg);
        }

    }
}