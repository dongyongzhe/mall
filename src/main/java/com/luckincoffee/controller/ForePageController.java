package com.luckincoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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


}
