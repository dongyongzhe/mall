package com.luckincoffee.service;

import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.OrderItem;
import com.luckincoffee.pojo.User;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/23 13:53
 * @Description: 订单业务逻辑接口
 */
public interface OrderService {
    /**
     * 添加商品对象
     * @param order 订单对象
     * @param ois 商品Id
     */
    void add(Order order, List<OrderItem> ois);

    /**
     * 根据订单Id查找订单
     * @param oid 订单Id
     * @return 查询到的订单
     */
    Order getByOrderId(int oid);

    /**
     * 修改订单
     * @param order 订单对象
     */
    void update(Order order);

    /**
     * 查询用户未删除的订单
     * @param user 用户
     * @return 用户还未删除的订单
     */
    List<Order> listOrderNotDelete(User user);
}
