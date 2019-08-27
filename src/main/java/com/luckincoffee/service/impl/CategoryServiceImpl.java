package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.CategoryMapper;
import com.luckincoffee.pojo.Category;
import com.luckincoffee.service.CategoryService;
import com.luckincoffee.util.Page;
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
    /**
     * 根据 id 进行降序排序
     * @return 分类对象的集合
     */
    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);

    }
    @Override
    public int total() {
        return categoryMapper.total();
    }

}
