package com.luckincoffee.pojo;

/**
 * @Author: dyz
 * @Date: 2019/8/28 15:48
 * @Description: 商品类
 */
public class Product {
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private Category category;
}
