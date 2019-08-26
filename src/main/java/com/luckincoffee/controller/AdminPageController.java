package com.luckincoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: dyz
 * @Date: 2019/8/23 9:22
 * @Description: 后台管理页面跳转控制器
 */
@Controller
public class AdminPageController {
    @GetMapping(value = "/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }

    @GetMapping(value = "/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
}
