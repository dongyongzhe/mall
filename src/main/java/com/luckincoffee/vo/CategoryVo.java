package com.luckincoffee.vo;

import com.luckincoffee.pojo.Category;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/20 13:28
 * @Description: 展示分类
 */
public class CategoryVo {
    /**
     * 分类
     */
    private Category category;

    /**
     * @return 该分类下的所有要展示的商品
     */
    private List<ProductVo> productVos;

    public List<ProductVo> getProductVos() {
        return productVos;
    }
    public void setProductVos(List<ProductVo> productVos) {
        this.productVos = productVos;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }


}
