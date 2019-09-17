package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.ReviewMapper;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.pojo.Review;
import com.luckincoffee.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 15:39
 * @Description: 商品评论业务逻辑类具体实现
 */
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewMapper reviewMapper;
    @Override
    public List<Review> getReviewList(Product product) {
        int pid = product.getId();
        return reviewMapper.findByProductId(pid);
    }

    /**
     * @param product 某商品
     * @return 该商品的评论数
     */

    @Override
    public int getReviewCount(Product product) {
        int pid = product.getId();
        return reviewMapper.getReviewCount(pid);
    }

}
