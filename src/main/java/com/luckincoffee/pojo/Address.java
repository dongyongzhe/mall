package com.luckincoffee.pojo;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 10:12
 * @Description: 收货地址类
 */
public class Address {
    /**
     * 地址Id
     */
    private int id;
    /**
     * 用户Id
     */
    private int userId;

    /**
     * 地址详情
     */
    private String detail;
    /**
     * 邮编
     */
    private String post;
    /**
     * 收件人姓名
     */
    private String receiver;

    /**
     * 收货人电话
     */
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
