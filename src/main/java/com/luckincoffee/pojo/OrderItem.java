package com.luckincoffee.pojo;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 8:45
 * @Description: 订单项实体类
 */
public class OrderItem {
    private int id;
    private Product product;
    private User user;
    private Order order;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
