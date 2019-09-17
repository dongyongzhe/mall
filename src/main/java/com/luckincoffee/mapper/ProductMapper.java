package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:24
 * @Description: 商品数据访问层
 */
@Mapper
public interface ProductMapper {
    /**
     *根据商品Id获取到商品对象
     */
    @Select("SELECT * FORM t_product WHERE id=#{pid}")
    Product getById(int pid);
}
