package com.it.yinchaobackend.service.impl;

import com.it.yinchaobackend.entity.User;
import com.it.yinchaobackend.dao.UsersDao;
import com.it.yinchaobackend.service.UsersService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2022-08-28 21:00:00
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;




    @Override
    public User findById(Long id) {
        return usersDao.finById(id);
    }
}
