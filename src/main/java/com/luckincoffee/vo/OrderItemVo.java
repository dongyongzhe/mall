package com.luckincoffee.vo;

import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.OrderItem;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/24 1:33
 * @Description: 查询到的订单页
 */
public class OrderItemVo {
    private OrderItem orderItem;
    private Order order;

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
