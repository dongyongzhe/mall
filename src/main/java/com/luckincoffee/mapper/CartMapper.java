package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Cart;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/19 10:14
 * @Description: 购物车数据访问层
 */
@Mapper
public interface CartMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO t_cart(NULL,#{cart.userId},#{cart.productId},#{cart.number)")
    void addCart(Cart cart);

    @Select("SELECT * FROM t_cart WHERE user_id=#{uid}")
    List<Cart> getByUserId(int uid);

    @Update("UPDATE t_cart ")
    int updateCart(Cart cart);
}
