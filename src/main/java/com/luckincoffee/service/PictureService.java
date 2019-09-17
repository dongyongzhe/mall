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
     * @param product 商品类
     * @param type 图片类型
     * @return 图片集合
     */
    List<Picture> getByProductAndType(Product product, String type);
}
