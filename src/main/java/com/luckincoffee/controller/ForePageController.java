package com.luckincoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: dyz
 * @Date: 2019/8/28 15:31
 * @Description: 前台页面跳转控制器,仅仅用作客户端前端的页面跳转
 */
@Controller
public class ForePageController {

    @GetMapping(value = "/")
    public String index(){
        return "redirect:home";
    }

    @GetMapping(value = "home")
    public String home(){
        return "fore/home";
    }

    /**
     * 跳转到注册页面
     */
    @GetMapping(value = "/register")
    public String register(){
        return "fore/register";
    }

    /**
     * 跳转到注册成功页面
     */
    @GetMapping(value = "/registerSuccess")
    public String registerSuccess(){
        return "fore/registerSuccess";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "fore/login";
    }

    /**
     * 将user对象从session作用域中删除
     * @param session 保存在session作用域中的user对象
     * @return 重定向到首页
     */
    @GetMapping(value = "/forelogout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:home";
    }

    @GetMapping(value="/product")
    public String product(){
        return "fore/product";
    }

    @GetMapping(value="/category")
    public String category(){
        return "fore/category";
    }


}
