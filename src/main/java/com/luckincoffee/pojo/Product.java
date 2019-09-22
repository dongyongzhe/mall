package com.luckincoffee.pojo;

import java.sql.Date;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/11 15:31
 * @Description: 商品实体类
 */
public class Product {
    private int id;
    private String name;
    private String title;
    private String productDesc;
    private String author;
    private String publisher;
    private Date years;
    private float originalPrice;
    private float promotePrice;
    private int stock;
    private int categoryId;
    /**
     * 是否为推荐图书   0：不是,1：是
     */
    private Byte recommend;
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
