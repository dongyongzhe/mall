package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:57
 * @Description: 图片数据访问层
 */
@Mapper
public interface PictureMapper {
    /**
     * @param pid 商品Id
     * @param type 图片类型
     * @return 商品图片集合
     */
    @Select("SELECT * FROM t_product_image WHERE product_id=#{pid} AND utype=#{type}")
    List<Picture> getByProductIdAndType(@Param("pid") int pid,@Param("type") String type);
}
