package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.ProductMapper;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.OrderItemService;
import com.luckincoffee.service.ProductService;
import com.luckincoffee.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:22
 * @Description: 商品业务逻辑层具体实现
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private OrderItemService orderItemService;

    @Override
    public Product getById(int pid) {
        return productMapper.getById(pid);
    }

    @Override
    public void setSaleAndReviewCount(Product product) {
        int saleCount = orderItemService.getSaleCount(product);
        product.setSaleCount(saleCount);

        int reviewCount = reviewService.getReviewCount(product);
        product.setReviewCount(reviewCount);
    }

    @Override
    public void setSaleAndReviewCount(List<Product> products) {
        for (Product product : products) {
            setSaleAndReviewCount(product);
        }
    }
}
