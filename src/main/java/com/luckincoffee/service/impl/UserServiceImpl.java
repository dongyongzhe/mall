package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.UserMapper;
import com.luckincoffee.pojo.User;
import com.luckincoffee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 13:49
 * @Description: 用户业务逻辑
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     * @param u 用户对象
     */
    @Override
    public void addUser(User u) {
        userMapper.insert(u);
    }


    /**
     * 修改用户
     * @param c 用户对象
     */
    @Override
    public void updateUser(User c) {
        userMapper.update(c);
    }

    /**
     * 根据用户Id查询到用户对象
     * @param id 用户Id
     * @return 用户对象
     */
    @Override
    public User getUser(int id) {
        return null;
    }

    /**
     * 获取所有用户对象
     * @return 所有用户对象
     */
    @Override
    public List<User> list() {
        return userMapper.list();
    }

    /**
     * 根据用户名判断是否存在该用户
     * @param name 用户名
     * @return 是否存在该用户
     */
    @Override
    public boolean isExist(String name) {
        return (userMapper.findByName(name))==null?false:true;
    }

    /**
     * 根据用户名和密码查询用户对象
     * @param username 用户名
     * @param password 密码
     * @return 查询到的用户对象
     */
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user=userMapper.findByUsernameAndPassword(username,password);
        return user;
    }
}
