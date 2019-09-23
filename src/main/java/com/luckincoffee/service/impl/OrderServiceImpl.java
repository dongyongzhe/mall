package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.OrderMapper;
import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.OrderItem;
import com.luckincoffee.service.OrderItemService;
import com.luckincoffee.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/23 13:44
 * @Description: 订单业务逻辑
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderItemService orderItemService;
    /**
     * 添加订单
     * @param order 订单对象
     * @param ois 订单项集合
     */
    @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
    @Override
    public void add(Order order, List<OrderItem> ois) {
        orderMapper.add(order);
        if(false) {
            throw new RuntimeException();
        }else {
            for (OrderItem oi : ois) {
                oi.setOrderId(order.getId());
                //添加订单项
                orderItemService.add(oi);
            }
        }
    }

    /**
     * 根据订单Id查找订单
     * @param oid 订单Id
     * @return 查询到的订单
     */
    @Override
    public Order getByOrderId(int oid) {
        return orderMapper.getByOrderId(oid);
    }

    /**
     * 更新订单
     * @param order 订单对象
     */
    @Override
    public void update(Order order) {
        orderMapper.update(order);
    }
}
