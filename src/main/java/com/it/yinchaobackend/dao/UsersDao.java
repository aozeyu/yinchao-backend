package com.it.yinchaobackend.dao;

import com.it.yinchaobackend.entity.User;
import com.it.yinchaobackend.utils.ResultUtil;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Users)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-28 20:59:56
 */
@Mapper
public interface UsersDao {


    User finById(Long id);


    User login(User user);
}

