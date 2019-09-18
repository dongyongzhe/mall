package com.luckincoffee.service;

import com.luckincoffee.pojo.Product;
import com.luckincoffee.pojo.Review;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 15:20
 * @Description: 商品评论业务逻辑层
 */
public interface ReviewService {
    void addReview(Review review);
    List<Review> getReviewList(Product product);
    int getReviewCount(Product product);
}
