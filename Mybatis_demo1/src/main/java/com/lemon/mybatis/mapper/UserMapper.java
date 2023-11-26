package com.lemon.mybatis.mapper;

/**
 * Created by lemoon on 2023/11/18 11:20
 */
public interface UserMapper {

    /**
     * Mybatis 面向接口编程的两个一致：
     * 1、映射文件的namespace要和mapper接口的全类名保持一致
     * 2、映射文件中SQL语句的id要和mapper接口中的方法名一致
     *
     * 表 —— 实体类 —— mapper接口 —— 映射文件
     */

    /**
     * 添加用户信息
     */
    int insertUser();

}
