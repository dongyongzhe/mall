package com.luckincoffee.controller;

import com.luckincoffee.pojo.*;
import com.luckincoffee.service.*;
import com.luckincoffee.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private ProductService productService;
    @Autowired
    private PictureService pictureService;
    @Autowired
    private ReviewService reviewService;

    /**
     * 首页
     */
    @GetMapping("/forehome")
    public Result home(){
        //获取到所有的类别
        List<Category> c=categoryService.list();
        for (Category category : c) {
            //给每一个类别附上商品集合属性
            category.setProducts(categoryService.findByCategory(category));
        }
        return Result.success(c);
    }

    /**
     * 注册
     * @param user 前台传入的用户对象
     * @return 结果信息
     */
    @PostMapping("/foreregister")
    public Result register(@RequestBody User user){
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

    /**
     * 登录
     * @param user 登录的用户
     * @param session 作用域
     * @return 结果信息
     */
    @PostMapping("/forelogin")
    public Result login(@RequestBody User user, HttpSession session){
        String username=user.getUsername();
        username=HtmlUtils.htmlEscape(username);
        User user1=userService.findByUsernameAndPassword(username,user.getPassword());
        if(null==user1){
            String message="账户密码错误";
            return Result.fail(message);
        }else{
            //将用户信息存入session作用域中
            session.setAttribute("user",user1);
            return Result.success();
        }
    }
    @GetMapping("foreproduct/{pid}")
    public Result getProduct(@PathVariable("pid") int id){
        Product product= productService.getById(id);
        //获取到该商品的所有展示图片
        List<Picture> showPictures=pictureService.getByProductAndType(product,"show");
        //获取到该商品的所有详情图片
        List<Picture> detailPictures=pictureService.getByProductAndType(product,"detail");
        //为商品设置详情图片属性
        product.setDetailPictures(detailPictures);
        //为商品设置展示图片属性
        product.setShowPictures(showPictures);
        List<Review>  reviews= reviewService.getReviewList(product);

        Map<String, Object> map = new HashMap<>(16);
        //将商品对象传入map
        map.put("product",product);
        //将商品评论加入map
        map.put("reviews",reviews);
        return Result.success(map);
    }

}
