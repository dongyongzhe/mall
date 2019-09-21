package com.luckincoffee.vo;

import com.luckincoffee.pojo.Picture;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.pojo.Review;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/20 11:04
 * @Description: 商品详情
 */
public class ProductVo  {
    /**
     * 商品
     */
    private Product product;

    /**
     * 展示图片
     */
    private Picture showPicture;
    /**
     * 详情图片集合
     */
    private List<Picture> detailPictures;

    /**
     * 商品对应的评论
     */
    private List<Review> reviews;

    /**
     * 销量
     */
    private int saleCount;
    /**
     * 评论数量
     */
    private int reviewCount;


    public Picture getShowPicture() {
        return showPicture;
    }

    public void setShowPicture(Picture showPicture) {
        this.showPicture = showPicture;
    }

    public List<Picture> getDetailPictures() {
        return detailPictures;
    }

    public void setDetailPictures(List<Picture> detailPictures) {
        this.detailPictures = detailPictures;
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
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }


}
