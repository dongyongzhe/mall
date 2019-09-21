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
     * @param pid 商品Id
     * @param num 加入的商品数量
     * @param user 用户
     */
    void addCart(int pid, int num, User user);

    /**
     * @param user 用户对象
     * @return 该用户的购物车
     */
    List<CartVo> getCart(User user);
}
