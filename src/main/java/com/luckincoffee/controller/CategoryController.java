package com.luckincoffee.controller;

import com.luckincoffee.pojo.Category;
import com.luckincoffee.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/23 10:19
 * @Description: 分类管理的服务器控制器
 */
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * @return 分类集合，数据格式为 Json
     * @throws Exception
     */
    @GetMapping(value = "/categories")
    public List<Category> list() throws Exception{
        return categoryService.list();
    }

}
