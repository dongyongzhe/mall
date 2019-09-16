package com.luckincoffee.service;

import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;

import java.util.List;

/**
 * @Author: dyz
 * @Description: 分类业务逻辑接口
 * @Date: 2019/8/22 17:31
 */
public interface CategoryService {
    List<Category> list();
    void add(Category category);
    Category get(int id);
    List<Product> findByCategory(Category category);
}
