package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:24
 * @Description: 商品数据访问层
 */
@Mapper
public interface ProductMapper {

    /**
     * 根据商品Id获取到商品对象
     * @param pid 商品Id
     * @return 查询到的商品
     */
    @Select("SELECT * FROM t_product WHERE id=#{pid}")
    Product getById(int pid);

    /**
     * 关键字模糊匹配
     * @param keywords 关键字
     * @param start 开始页
     * @param size 每页个数
     * @return 查询到的商品集合
     */
    @Select("SELECT * FROM t_product WHERE name like concat(concat('%',#{keywords}),'%') LIMIT #{start},#{size}")
    List<Product> findByKeywords(@Param("keywords") String keywords, @Param("start") int start, @Param("size") int size);
}
