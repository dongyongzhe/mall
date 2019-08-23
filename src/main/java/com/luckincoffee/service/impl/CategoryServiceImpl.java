package com.luckincoffee.service.impl;

import com.luckincoffee.dao.CategoryDao;
import com.luckincoffee.pojo.Category;
import com.luckincoffee.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
    private CategoryDao categoryDao;

    /**
     * 根据 id 进行降序排序
     * @return 分类对象的集合
     */
    @Override
    public List<Category> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDao.findAll(sort);
    }
}
