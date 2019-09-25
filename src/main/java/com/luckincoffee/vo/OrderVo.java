package com.luckincoffee.vo;

import com.luckincoffee.pojo.Address;
import com.luckincoffee.pojo.Order;
import com.luckincoffee.pojo.OrderItem;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/24 1:33
 * @Description: 查询到的订单页
 */
public class OrderVo {
    /**
     * 订单
     */
    private Order order;

    /**
     * 订单对应的地址
     */
    private Address address;

    /**
     * 订单中商品
     */
    private List<ProductVo> productVos;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ProductVo> getProductVos() {
        return productVos;
    }

    public void setProductVos(List<ProductVo> productVos) {
        this.productVos = productVos;
    }

}
