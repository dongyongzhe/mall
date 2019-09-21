package com.luckincoffee.service;

import com.luckincoffee.pojo.Product;
import com.luckincoffee.vo.ProductVo;

/**
 * @Author: dyz
 * @Date: 2019/9/18 10:36
 * @Description: 商品业务逻辑接口
 */
public interface ProductService {

    /**
     * @param id 商品Id
     * @return 根据商品Id获得的商品对象
     */
    Product getById(int id);

    /**
     * 根据商品对象获取前台要展示商品ProductVo
     * @param product 商品对象
     * @return 前台要展示商品ProductVo
     */
    ProductVo getProductVo(Product product);
}
