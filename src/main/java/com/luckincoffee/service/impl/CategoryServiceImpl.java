package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.CategoryMapper;
import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * @Author: dyz
 * @Description: 分类的业务逻辑
 * @Date: 2019/8/23 8:56
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.findAll();
    }

    @Override
    public void add(Category category) {
        categoryMapper.save(category);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.findOne(id);
    }

    /**
     * 获取到某一分类下的所有产品集合
     */
    @Override
    public List<Product> findByCategory(Category category) {
        int categoryId=category.getId();
        return categoryMapper.findByCategoryId(categoryId);
    }
}


