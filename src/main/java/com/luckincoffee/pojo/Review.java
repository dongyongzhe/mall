package com.luckincoffee.pojo;

import java.util.Date;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 10:15
 * @Description: 商品评价实体类
 */
public class Review {
    /**
     * 评论ID
     */
    private int id;
    /**
     * 评论对应的会员
     */
    private User user;
    /**
     * 评论对应的商品
     */
    private Product product;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论创建日期
     */
    private Date createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
