package com.luckincoffee.service;

import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/31 10:36
 * @Description: 商品业务逻辑接口
 */
public interface ProductService {
    void fill(Category category);
    void fill(List<Category> categories);
    void fillByRow(List<Category> categories);
    List<Product> listByCategory(Category category);
}
