package com.luckincoffee.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luckincoffee.pojo.Category;
import com.luckincoffee.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/categories")
    public PageInfo<Category> getPageInfo(@RequestParam(value = "start",defaultValue = "1") int start, @RequestParam(value = "size",defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size);
        //得到分页的结果
        List<Category> list = categoryService.list();
        //得到分页中的category条目对象
        PageInfo<Category> pageInfo = new PageInfo<>(list,5);
        return pageInfo;
    }

}
