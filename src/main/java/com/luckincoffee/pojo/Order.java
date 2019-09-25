package com.luckincoffee.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

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
    private int addressId;
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
    private String status;
    /**
     * 用户Id
     */
    private int userId;

    /**
     * 订单创建时间
     */
    private Date createTime;


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

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int adressId) {
        this.addressId = adressId;
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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", addressId=" + addressId +
                ", userMessage='" + userMessage + '\'' +
                ", total=" + total +
                ", totalNumber=" + totalNumber +
                ", payDate=" + payDate +
                ", payMode=" + payMode +
                ", deliveryDate=" + deliveryDate +
                ", confirmDate=" + confirmDate +
                ", status='" + status + '\'' +
                ", userId=" + userId +
                ", createDate=" + createTime +
                '}';
    }
}
