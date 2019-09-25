package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.OrderItemMapper;
import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.OrderItem;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.OrderItemService;
import com.luckincoffee.service.OrderService;
import com.luckincoffee.service.ProductService;
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
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;

    @Override
    public int getSaleCount(Product product) {
        List<OrderItem> orderItems=orderItemMapper.findByProductId(product.getId());

        int saleCount=0;
        for (OrderItem orderItem : orderItems) {
            if(0<orderItems.size()&& null!=orderService.getByOrderId(orderItem.getOrderId()).getPayDate()){
                //每次循环将已支付的订单的订单项的商品数量加上
                saleCount+=orderItem.getNumber();
            }
        }
        return saleCount;
    }

    /**
     * 添加订单项
     * @param orderItem 订单项对象
     */
    @Override
    public void add(OrderItem orderItem) {
        orderItemMapper.add(orderItem);
    }

    /**
     * 根据商品查询订单项集合
     * @param product 商品
     * @return 订单项集合
     */
    @Override
    public List<OrderItem> listByProduct(Product product) {
        return orderItemMapper.findByProductId(product.getId());
    }

    /**
     * 根据订单查询订单项集合
     * @param order 订单
     * @return 订单项集合
     */
    @Override
    public List<OrderItem> listByOrder(Order order) {
        return orderItemMapper.findByOrderId(order.getId());
    }

    @Override
    public Product getProductByOrderItem(OrderItem orderItem) {
        int productId = orderItem.getProductId();
        Product product = productService.getById(productId);
        return product;
    }
}
