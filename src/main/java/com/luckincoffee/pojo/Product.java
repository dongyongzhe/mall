package com.luckincoffee.pojo;

import java.sql.Date;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/11 15:31
 * @Description: 商品实体类
 */
public class Product {
    /**
     * 商品Id
     */
    private int id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品详情
     */
    private String productDesc;
    /**
     * 商品作者
     */
    private String author;
    /**
     * 商品出版社
     */
    private String publisher;
    /**
     * 出版年限
     */
    private Date years;
    /**
     * 原件
     */
    private float originalPrice;
    /**
     * 折扣价
     */
    private float promotePrice;
    /**
     * 库存
     */
    private int stock;
    /**
     * 商品对应的分类Id
     */
    private int categoryId;
    /**
     * 是否为推荐图书   0：不是,1：是
     */
    private Byte recommend;
    /**
     * 商品状态（是否下架）
     */
    private Byte status;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getYears() {
        return years;
    }

    public void setYears(Date years) {
        this.years = years;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {

        this.originalPrice = originalPrice;
    }

    public float getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(float promotePrice) {
        this.promotePrice = promotePrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
    public Byte getRecommend() {
        return recommend;
    }

    public void setRecommend(Byte recommend) {
        this.recommend = recommend;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", years=" + years +
                ", originalPrice=" + originalPrice +
                ", promatePrice=" + promotePrice +
                ", stock=" + stock +
                ", categoryId=" + categoryId +
                ", status=" + status +
                ", recommend=" + recommend +
                '}';
    }
}
