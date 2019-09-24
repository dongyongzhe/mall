package com.luckincoffee.service;

import com.luckincoffee.pojo.User;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 13:47
 * @Description: 对用户进行操作
 */
public interface UserService {
    /**
     * 添加用户
     * @param c 用户对象
     */
    void addUser(User c);

    /**
     * 修改用户
     * @param c 用户对象
     */
    void updateUser(User c);

    /**
     * 根据用户Id查询到用户对象
     * @param id 用户Id
     * @return 用户对象
     */
    User getUser(int id);

    /**
     * 获取所有用户对象
     * @return 所有用户对象
     */
    List<User> list();

    /**
     * 根据用户名判断是否存在该用户
     * @param name 用户名
     * @return 是否存在该用户
     */
    boolean isExist(String name);

    /**
     * 根据用户名和密码查询用户对象
     * @param username 用户名
     * @param password 密码
     * @return 查询到的用户对象
     */
    User findByUsernameAndPassword(String username,String password);
}
