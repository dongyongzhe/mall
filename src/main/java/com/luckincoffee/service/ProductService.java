package com.luckincoffee.service;

import com.luckincoffee.pojo.Product;
import com.luckincoffee.vo.ProductVo;

import java.util.List;

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

    /**
     * 根据关键字进行分页查询
     * @param keyword 关键字
     * @param start 开始页数
     * @param size 每页长度
     * @return 查询到的商品结果
     */
    List<Product> search(String keyword, int start, int size);
}
