package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 11:11
 * @Description: 操作分类表接口
 */
@Mapper
public interface CategoryMapper {
    /**
     * 查询所有分类
     * @return 所有分类集合
     */
    @Select("SELECT * FROM category ORDER BY id DESC")
    List<Category> findAll();
}
