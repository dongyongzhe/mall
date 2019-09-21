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

    /**
     * 添加购物车
     * @param cart 购物车对象
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO t_cart(id,user_id,product_id,number) VALUES(null,#{userId},#{productId},#{number})")
    void addCart(Cart cart);

    /**
     * @param uid 用户Id
     * @return 购物车集合
     */
    @Select("SELECT * FROM t_cart WHERE user_id=#{uid}")
    List<Cart> getByUserId(int uid);

    @Update("UPDATE t_cart SET user_id=#{userId},product_id=#{productId},number=number+#{number} WHERE id=#{id}")
    int updateCart(Cart cart);

    @Select("SELECT * FROM t_cart WHERE user_id=#{uid} AND product_id=#{pid}")
    Cart getByProductId(@Param("pid") int pid,@Param("uid") int uid);
}
