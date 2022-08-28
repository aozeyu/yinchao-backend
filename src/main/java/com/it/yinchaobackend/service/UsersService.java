package com.it.yinchaobackend.service;

import com.it.yinchaobackend.entity.User;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2022-08-28 20:59:59
 */
public interface UsersService {



    User findById(Long id);
}
