package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.CategoryMapper;
import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/31 10:37
 * @Description: 商品业务逻辑接口的实现类
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 为多个分类填充商品集合
     */
    @Override
    public void fill(List<Category> categories) {
        for (Category category : categories) {
            fill(category);
        }
    }
    @Override
    public void fill(Category category) {

    }
    @Override
    public void fillByRow(List<Category> categories) {

    }

    @Override
    public List<Product> listByCategory(Category category) {
        return categoryMapper.findByCategoryOrderById(category);
    }
}
