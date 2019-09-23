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

    /**
     * 跳转到首页
     */
    @GetMapping(value = "/")
    public String index(){
        return "redirect:home";
    }

    /**
     * @return 首页
     */
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

    /**
     * @return 登录页面
     */
    @GetMapping(value = "/login")
    public String login(){
        return "fore/login";
    }

    @GetMapping(value = "/self")
    public String self(){
        return "fore/self";
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

    /**
     * @return 商品详情页面
     */
    @GetMapping(value="/product")
    public String product(){
        return "fore/product";
    }

    /**
     * @return 分类页面
     */
    @GetMapping(value="/category")
    public String category(){
        return "fore/category";
    }

    /**
     * @return 购物车页面
     */
    @GetMapping(value="/cart")
    public String cart(){
        return "fore/cart";
    }

    /**
     * @return 结算页面
     */
    @GetMapping(value="/buy")
    public String buy(){
        return "fore/buy";
    }

    /**
     * @return 支付宝支付页面
     */
    @GetMapping(value="/alipay")
    public String alipay(){
        return "fore/alipay";
    }


    /**
     * @return 已支付页面
     */
    @GetMapping(value="/payed")
    public String payed(){
        return "fore/payed";
    }

    /**
     * @return 订单页面
     */
    @GetMapping(value="/bought")
    public String bought(){
        return "fore/bought";
    }

}
