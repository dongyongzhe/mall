package com.luckincoffee.service;

import com.luckincoffee.pojo.Picture;
import com.luckincoffee.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:59
 * @Description: 图片业务逻辑层
 */
@Service
public interface PictureService {
    /**
     * 获取展示的商品设置详细图片集合
     * @param product 商品类
     * @return 详情图片集合
     */
    List<Picture> getDetailPictures(Product product);

    /**
     * 获取展示的商品设置展示图片
     * @param product 商品类
     * @return 展示图片
     */
    Picture getShowPicture(Product product);
}
