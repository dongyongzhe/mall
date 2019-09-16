package com.luckincoffee.controller;

import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.User;
import com.luckincoffee.service.CategoryService;
import com.luckincoffee.service.UserService;
import com.luckincoffee.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/9/08 15:31
 * @Description: 前台页面控制器
 */
@RestController
public class ForeRestController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UserService userService;

    @GetMapping("/forehome")
    public List<Category> home(){
        //获取到所有的类别
        List<Category> c=categoryService.list();
        for (Category category : c) {
            //给每一个类别附上商品集合属性
            category.setProducts(categoryService.findByCategory(category));
        }
        return c;
    }
    @PostMapping("/foreregister")
    public Object register(@RequestBody User user){
        String username=user.getUsername();
        String password=user.getPassword();
        //对前端传来的用户名进行转义处理
        username = HtmlUtils.htmlEscape(username);
        user.setUsername(username);
        if (userService.isExist(username)) {
            String message="用户名已经存在，请重新输入";
            return Result.fail(message);
        }
        user.setPassword(password);
        userService.addUser(user);
        return Result.success();
    }

    @PostMapping("/foreLogin")
    public Object login(@RequestBody User user, HttpSession session){
        String username=user.getUsername();
        username=HtmlUtils.htmlEscape(username);
        User user1=userService.findByUsernameAndPassword(username,user.getPassword());
        if(null==user1){
            String message="账户密码错误";
            return Result.fail(message);
        }else{
            //将用户信息存入seeion作用域中
            session.setAttribute("user",user1);
            return Result.success();
        }
    }

}
