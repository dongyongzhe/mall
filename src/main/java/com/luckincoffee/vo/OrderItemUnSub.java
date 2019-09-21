package com.luckincoffee.vo;

import com.luckincoffee.pojo.OrderItem;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/21 0:20
 * @Description: 未提交的订单，orderId为空
 */
public class OrderItemUnSub {
    /**
     * 订单项
     */
    private OrderItem orderItem;

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
