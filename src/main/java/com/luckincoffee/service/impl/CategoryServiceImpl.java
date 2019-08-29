package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.CategoryMapper;
import com.luckincoffee.pojo.Category;
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
}

