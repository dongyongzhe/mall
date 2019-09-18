package com.luckincoffee.pojo;

import java.util.Date;
import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 8:47
 * @Description: 订单类
 */
public class Order {
    /**
     * 订单Id
     */
    private int id;
    private String orderNumber;
    /**
     * 地址Id
     */
    private byte adressId;
    /**
     * 用户备注信息
     */
    private String userMessage;
    /**
     * 订单总价
     */
    private float total;

    /**
     * 商品总数
     */
    private int totalNumber;
    /**
     * 支付时间
     */
    private Date payDate;
    /**
     * 支付方式
     */
    private int payMode;
    /**
     * 发货时间
     */
    private Date deliveryDate;
    /**
     * 确认收货时间
     */
    private Date confirmDate;
    /**
     * 订单状态
     */
    private Byte status;
    /**
     * 用户Id
     */
    private int userId;

    /**
     * 订单创建时间
     */
    private Date createDate;

    /**
     * 订单项对应的订单项集合
     */
    private List<OrderItem> orderItem;

    /**
     * 订单对应的收货地址
     */
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Byte getAdressId() {
        return adressId;
    }

    public void setAdressId(byte adressId) {
        this.adressId = adressId;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public int getPayMode() {
        return payMode;
    }

    public void setPayMode(int payMode) {
        this.payMode = payMode;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
