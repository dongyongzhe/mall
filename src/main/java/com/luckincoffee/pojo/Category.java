package com.luckincoffee.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: dyz
 * @Description: 商品种类实体类
 * @Date: 2019/8/19 17:30
 */
@Getter
@Setter
public class Category {
    /**
     * 分类ID
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String name;
    /**
     * 产品
     */
    private List<Product> products;
    /**
     * 同一类产品不同的推荐关键词
     */
    List<List<Product>> productsByRow;

}
