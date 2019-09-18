package com.luckincoffee.pojo;

import java.sql.Date;
import java.util.List;

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
    private Float originalPrice;
    private Float promotePrice;
    private int stock;

    /**
     * 销量
     */
    private int saleCount;
    /**
     * 评论数量
     */
    private int reviewCount;
    private int categoryId;
    private Byte status;
    /**
     * 是否为推荐图书   0：不是,1：是
     */
    private Byte recommend;

    /**
     * 展示图片集合
     */
    private List<Picture> showPictures;
    /**
     * 详情图片集合
     */
    private List<Picture> detailPictures;


    public List<Picture> getShowPictures() {
        return showPictures;
    }

    public void setShowPictures(List<Picture> showPictures) {
        this.showPictures = showPictures;
    }

    public List<Picture> getDetailPictures() {
        return detailPictures;
    }

    public void setDetailPictures(List<Picture> detailPictures) {
        this.detailPictures = detailPictures;
    }

    public Byte getRecommend() {
        return recommend;
    }

    public void setRecommend(Byte recommend) {
        this.recommend = recommend;
    }

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

    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        originalPrice = originalPrice;
    }

    public Float getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(Float promotePrice) {
        promotePrice = promotePrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
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
