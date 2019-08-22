package com.luckincoffee.service;

import com.luckincoffee.pojo.Category;

import java.util.List;

/**
 * @ProjectName: mall
 * @Package: com.luckincoffee.service
 * @ClassName: CategoryService
 * @Author: dyz
 * @Description: 分类管理业务逻辑接口
 * @Date: 2019/8/22 17:31
 * @Version: 1.0
 */
public interface CategoryService {
    List<Category> list();
}
