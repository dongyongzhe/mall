package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.OrderItemMapper;
import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.OrderItem;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 9:30
 * @Description: 订单项业务逻辑具体实现
 */
@Service
public class OrderItemImpl implements OrderItemService {
    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public void setOrderProperty(Order order) {
        List<OrderItem> orderItems=orderItemMapper.findByOrderId(order.getId());
        order.setOrderItem(orderItems);
        float total=0;
        int totalNumber=0;
        for (OrderItem orderItem : orderItems) {
            total+=orderItem.getNumber()*orderItem.getProduct().getPromotePrice();
            totalNumber+=orderItem.getNumber();
        }
        order.setTotal(total);
        order.setTotalNumber(totalNumber);
    }

    @Override
    public int getSaleCount(Product product) {
        List<OrderItem> orderItems=orderItemMapper.findByProductId(product.getId());
        int saleCount=0;
        for (OrderItem orderItem : orderItems) {
            if(null!=orderItem.getOrder()&&null!=orderItem.getOrder().getPayDate()){
                //每次循环将已支付的订单的订单项的商品数量加上
                saleCount+=orderItem.getNumber();
            }
        }
        return 0;
    }
}
