package com.luckincoffee.service;

import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.Product;


/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 16:38
 * @Description: 订单项业务逻辑类
 */
public interface OrderItemService {
    /**
     * 根据订单Id设置订单属性
     * @param order 订单Id
     */
    void setOrderProperty(Order order);

    /**
     * 获取某商品的销量
     * @param product 商品对象
     * @return 商品销量
     */
    int getSaleCount(Product product);

}
