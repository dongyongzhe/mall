package com.luckincoffee.service;

import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.OrderItem;
import com.luckincoffee.pojo.Product;

import java.util.List;


/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 16:38
 * @Description: 订单项业务逻辑类
 */
public interface OrderItemService {

    /**
     * 获取某商品的销量
     * @param product 商品对象
     * @return 商品销量
     */
    int getSaleCount(Product product);

    /**
     * 添加订单项
     * @param orderItem 订单项对象
     */
    void add(OrderItem orderItem);

    /**
     * 根据商品查询订单项集合
     * @param product 商品
     * @return 查询到的订单项
     */
    List<OrderItem> listByProduct(Product product);

    /**
     * 根据订单查询订单项集合
     * @param order 订单
     * @return 订单项集合
     */
    List<OrderItem> listByOrder(Order order);

    /**
     * 获取某一订单项商品
     * @param orderItem 订单项
     * @return 订单项下的商品
     */
    Product getProductByOrderItem(OrderItem orderItem);

}
