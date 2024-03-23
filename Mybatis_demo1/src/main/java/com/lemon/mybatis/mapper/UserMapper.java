package com.lemon.mybatis.mapper;

import com.lemon.mybatis.pojo.User;

import java.util.List;

/**
 * Created by lemoon on 2024/3/17 11:05
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 查询用户信息
     * @return
     */
    User geUserById();


    /**
     * 查询所有的用户信息
     */
    List<User> getAllUser();
}
