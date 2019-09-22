package com.luckincoffee.service;

import com.luckincoffee.pojo.User;
import com.luckincoffee.vo.CartVo;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/19 10:24
 * @Description: 购物车业务逻辑
 */
public interface CartService {
    /**
     * 添加购物车
     * @param pid 商品Id
     * @param num 加入的商品数量
     * @param user 用户
     */
    void addCart(int pid, int num, User user);

    /**
     * 获取购物车
     * @param user 用户对象
     * @return 该用户的购物车
     */
    List<CartVo> getCart(User user);

    /**
     * 获取加入购物车的该商品的数量
     * @param pid 商品Id
     * @param uid 用户Id
     * @return 加入购物车的该商品的数量
     */
    Integer getCountByUidAndPid(int uid,int pid);

    /**
     * 修改购物车中商品的商量
     * @param uid 用户Id
     * @param pid 商品Id
     * @param number 修改的数量
     */
    void updateCart(int uid,int pid,int number);

    /**
     * 删除购物车中某一商品
     * @param uid 用户Id
     * @param pid 商品Id
     */
    void delete(int uid,int pid);
}
