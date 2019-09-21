package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.CartMapper;
import com.luckincoffee.mapper.ProductMapper;
import com.luckincoffee.pojo.Cart;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.pojo.User;
import com.luckincoffee.service.CartService;
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

    @Override
    public void addCart(int pid, int num, User user) {
        Product product = productMapper.getById(pid);
        List<Product> products = new ArrayList<>();
        Cart cart = new Cart();
        cart.setNumber(num);
        cart.setUserId(user.getId());
        List<CartVo> cartVos = getCart(user);
        if (null!=cartVos){
            for (CartVo cartVo : cartVos) {
                ProductVo productVo = cartVo.getProductVo();
                Product product1 = productVo.getProduct();
                products.add(product1);
            }
            if (products.contains(product)){
                cartMapper.updateCart(cart);
            }else{
                cartMapper.addCart(cart);
            }

        }else{
            cartMapper.addCart(cart);
        }

    }

    @Override
    public List<CartVo> getCart(User user) {
        List<Object> cartVos = new ArrayList<>();
        List<Cart> carts = cartMapper.getByUserId(user.getId());
        for (Cart cart : carts) {
            CartVo cartVo = new CartVo();
        }
        return null;

    }
}
