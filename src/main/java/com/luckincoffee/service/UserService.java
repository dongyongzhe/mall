package com.luckincoffee.service;

import com.luckincoffee.pojo.User;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 13:47
 * @Description: 对用户进行操作
 */
public interface UserService {
    void addUser(User c);
    void deleteUser(int id);
    void updateUser(User c);
    User getUser(int id);
    List<User> list();
    boolean isExist(String name);
}
