package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 10:26
 * @Description: 评论CRUD
 */
@Mapper
public interface ReviewMapper {
    /**
     * 获取某一商品的所有评论集合
     * @param productId 某商品ID
     * @return 该商品的所有评论集合
     */
    @Select("SELECT * FROM t_review WHERE product_id=#{productId}")
    List<Review> findByProductId(int productId);

    @Select("SELECT count(*) FROM t_review WHERE product_id=#{pid}")
    int getReviewCount(int pid);
}
