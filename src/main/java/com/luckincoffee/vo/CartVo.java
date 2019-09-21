package com.luckincoffee.vo;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/19 11:21
 * @Description: 购物车展示
 */
public class CartVo{

    /**
     * 购物车中该商品的数量
     */
    private int number;

    /**
     * 购物车中商品
     */
    private ProductVo productVo;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ProductVo getProductVo() {
        return productVo;
    }

    public void setProductVo(ProductVo productVo) {
        this.productVo = productVo;
    }


}
