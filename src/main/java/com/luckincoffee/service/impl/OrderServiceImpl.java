package com.luckincoffee.service.impl;

import com.luckincoffee.enumcase.OrderStatusEnum;
import com.luckincoffee.mapper.OrderMapper;
import com.luckincoffee.pojo.*;
import com.luckincoffee.service.AddressService;
import com.luckincoffee.service.OrderItemService;
import com.luckincoffee.service.OrderService;
import com.luckincoffee.service.ProductService;
import com.luckincoffee.vo.OrderVo;
import com.luckincoffee.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    @Autowired
    private AddressService addressService;
    @Autowired
    private ProductService productService;
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

    /**
     * @param user 用户
     * @return 未被删除的订单集合
     */
    @Override
    public List<OrderVo> listOrderNotDelete(User user) {
        List<Order> orderbyUserIdAndInsteadStatus = orderMapper.findByUserIdAndInsteadStatus(user.getId(), OrderStatusEnum.DELETE.getStatus());
        for (Order order : orderbyUserIdAndInsteadStatus) {
            OrderVo orderVo = new OrderVo();
            orderVo.setOrder(order);
            List<OrderItem> orderItems = orderItemService.listByOrder(order);
            for (OrderItem orderItem : orderItems) {
                Product product = orderItemService.getProductByOrderItem(orderItem);
                ProductVo productVo = productService.getProductVo(product);
                List<ProductVo> productVos = new ArrayList<>();
                productVos.add(productVo);
                orderVo.setProductVos(productVos);
            }
            orderVo.setOrderItems(orderItems);
            Address address = addressService.getAddressByOrder(order);
            orderVo.setAddress(address);
        }
        return null;
    }

}
