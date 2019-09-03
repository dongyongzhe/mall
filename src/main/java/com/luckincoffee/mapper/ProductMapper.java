package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/31 13:37
 * @Description: ${description}
 */
@Mapper
public interface ProductMapper {
    List<Product> findByCategoryOrderById(Category category);
}
