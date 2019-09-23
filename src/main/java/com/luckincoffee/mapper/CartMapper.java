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

    /**
     * 更新购物车
     * @param cart 购物车对象
     * @return 改变的行数
     */
    @Update("UPDATE t_cart SET number=#{number} WHERE id=#{id}")
    int updateCart(Cart cart);

    /**
     * 根据商品Id和用户Id获取购物车
     * @param pid 商品Id
     * @param uid 用户Id
     * @return 购物车对象
     */
    @Select("SELECT * FROM t_cart WHERE user_id=#{uid} AND product_id=#{pid}")
    Cart getByProductId(@Param("uid") int uid,@Param("pid") int pid);

    /**
     * 根据商品Id和用户Id获取购物车
     * @param pid 商品Id
     * @param uid 用户Id
     * @return 购物车中该商品的数量
     */
    @Select("SELECT number FROM t_cart WHERE user_id=#{uid} AND product_id=#{pid}")
    Integer getCountByUidAndPid(@Param("uid") int uid,@Param("pid") int pid);

    /**
     * 删除某一购物车
     * @param cart 购物车对象
     * @return 改变的行数
     */
    @Delete("DELETE FROM t_cart WHERE id=#{id}")
    int deleteOne(Cart cart);

    /**
     * @param pid 商品Id
     * @param uid 用户Id
     * @return 查询到的购物车对象
     */
    @Select("SELECT * FROM t_cart WHERE user_id=#{uid} AND product_id=#{pid}")
    Cart getOne(@Param("uid") int uid,@Param("pid") int pid);

}
