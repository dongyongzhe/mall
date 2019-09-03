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
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.findAll();
    }

    @Override
    public void add(Category category){
        categoryMapper.save(category);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.findOne(id);
    }

    /**
     * 遍历所有类别，执行removeCategoryFromProduct方法
     */
    @Override
    public void removeCategoryFromProduct(List<Category> c) {
        for (Category category : c) {
            removeCategoryFromProduct(category);
        }
    }

    /**
     * 移除各类所有产品的 类别字段
     */
    @Override
    public void removeCategoryFromProduct(Category category) {
        List<Product> products = category.getProducts();
        if (null!=products){
            for (Product product : products) {
                product.setCategory(null);
            }
        }
        List<List<Product>> productsByRow = category.getProductsByRow();
        if (null!=productsByRow){
            for (List<Product> productList : productsByRow) {
                for (Product product : productList) {
                    product.setCategory(null);
                }
            }
        }
    }
}

