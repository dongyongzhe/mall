package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:57
 * @Description: 图片数据访问层
 */
@Mapper
public interface PictureMapper {
    @Select("SELECT * FROM t_product_image WHERE product_id=#{pid} AND utype=#{type}")
    List<Picture> getByProductIdAndType(int pid, String type);
}
