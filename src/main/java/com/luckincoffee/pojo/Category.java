package com.luckincoffee.pojo;

import java.util.List;

/**
 * @Author: dyz
 * @Description: 商品种类实体类
 * @Date: 2019/8/19 17:30
 */
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
     * 每一类对应的所有产品
     */
    private List<Product> products;

    /**
     * 每一种类别推荐的产品列表，前台会显示这些商品的小标题
     */
    List<List<Product>> recommendProduct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<List<Product>> getRecommendProduct() {
        return recommendProduct;
    }

    public void setRecommendProduct(List<List<Product>> recommendProduct) {
        this.recommendProduct = recommendProduct;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
