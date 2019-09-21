package com.luckincoffee.pojo;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/19 10:07
 * @Description: 购物车
 */
public class Cart {

    private int id;

    /**
     * 对应的用户id
     */
    private int userId;
    /**
     * 对应的商品id
     */
    private int productId;
    /**
     * 商品数量
     */
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
