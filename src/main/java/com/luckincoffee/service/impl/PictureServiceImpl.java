package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.PictureMapper;
import com.luckincoffee.pojo.Picture;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 14:00
 * @Description: 图片业务逻辑层具体实现
 */
@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureMapper pictureMapper;

    /**
     * 为展示的商品设置详细图片属性
     * @param product 商品类
     */
    @Override
    public List<Picture> getDetailPictures(Product product) {
        int pid=product.getId();
        List<Picture> pictures = pictureMapper.getDetailsPictures(pid);
        return pictures;
    }

    /**
     * 为展示的商品设置展示图片属性
     * @param product 商品类
     */
    @Override
    public Picture getShowPicture(Product product) {
        int pid=product.getId();
        Picture showPicture = pictureMapper.getShowPicture(pid);
        return showPicture;
    }
}
