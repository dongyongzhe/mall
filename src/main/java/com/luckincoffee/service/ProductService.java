package com.luckincoffee.service;


import com.luckincoffee.pojo.Product;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/31 10:36
 * @Description: 商品业务逻辑接口
 */
public interface ProductService {
    Product getById(int pid);

    void setSaleAndReviewCount(Product product);

    void setSaleAndReviewCount(List<Product> products);

}
