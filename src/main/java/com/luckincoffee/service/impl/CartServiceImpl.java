package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.CartMapper;
import com.luckincoffee.mapper.ProductMapper;
import com.luckincoffee.pojo.Cart;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.pojo.User;
import com.luckincoffee.service.CartService;
import com.luckincoffee.service.ProductService;
import com.luckincoffee.vo.CartVo;
import com.luckincoffee.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/19 10:25
 * @Description: 购物车业务逻辑具体实现
 */
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductService productService;

    /**
     * 添加购物车
     * @param pid  商品Id
     * @param num  加入的商品数量
     * @param user 用户
     */
    @Override
    public void addCart(int pid, int num, User user) {
        Product product = productMapper.getById(pid);
        List<Product> products = new ArrayList<>();
        int uid=user.getId();
        Cart cart = new Cart();
        cart.setUserId(uid);
        cart.setNumber(num);
        cart.setProductId(pid);
        Cart cartbyProductId = cartMapper.getByProductId(uid, pid);
        if (null!=cartbyProductId){
            cartMapper.updateCart(cart);
        }else{
            cartMapper.addCart(cart);
        }
    }

    /**
     * @param user 用户对象
     * @return 获取到的购物车集合
     */
    @Override
    public List<CartVo> getCart(User user) {
        List<CartVo> cartVos = new ArrayList<>();
        List<Cart> carts = cartMapper.getByUserId(user.getId());
        for (Cart cart : carts) {
            int number = cart.getNumber();
            CartVo cartVo = new CartVo();
            cartVo.setNumber(number);
            int productId = cart.getProductId();
            Product product = productService.getById(productId);
            ProductVo productVo = productService.getProductVo(product);
            cartVo.setProductVo(productVo);
            cartVos.add(cartVo);
        }
        return cartVos;

    }
}
