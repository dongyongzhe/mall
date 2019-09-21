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
     * @return 商品图片集合
     */
    @Select("SELECT * FROM t_product_image WHERE product_id=#{pid} AND utype='show'")
    Picture getShowPicture(@Param("pid") int pid);

    @Select("SELECT * FROM t_product_image WHERE product_id=#{pid} AND utype='detail'")
    List<Picture> getDetailsPictures(@Param("pid") int pid);
}
