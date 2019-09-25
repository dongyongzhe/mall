package com.luckincoffee.ao;

import java.io.Serializable;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/24 18:43
 * @Description: 确认订单时填的信息
 */
public class MessageAo implements Serializable {
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

    /**
     * 留言信息
     */
    private String userMessage;

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

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    @Override
    public String toString() {
        return "MessageAo{" +
                "detail='" + detail + '\'' +
                ", post='" + post + '\'' +
                ", receiver='" + receiver + '\'' +
                ", mobile='" + mobile + '\'' +
                ", userMessage='" + userMessage + '\'' +
                '}';
    }
}
