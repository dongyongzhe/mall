package com.luckincoffee.pojo;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 8:45
 * @Description: 订单项实体类
 */
public class OrderItem {
    /**
     * 订单项Id
     */
    private int id;
    /**
     * 商品Id
     */
    private int productId;
    /**
     * 订单Id
     */
    private int orderId;
    /**
     * 用户Id
     */
    private int userId;

    /**
     * 商品数量
     */
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
