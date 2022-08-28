package com.it.yinchaobackend.controller;

import com.it.yinchaobackend.entity.User;
import com.it.yinchaobackend.service.UsersService;
import com.it.yinchaobackend.utils.Result;
import com.it.yinchaobackend.utils.ResultUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2022-08-28 20:59:54
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;


    @GetMapping(value = "/findById")
    public Result findById(@RequestParam Long id) {
        User user = usersService.findById(id);
        return ResultUtil.define(200,"success", user);
    }



}

