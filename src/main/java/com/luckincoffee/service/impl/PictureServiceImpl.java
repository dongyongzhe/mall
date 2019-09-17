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

    @Override
    public List<Picture> getByProductAndType(Product product, String type) {
        int pid = product.getId();
        return pictureMapper.getByProductIdAndType(pid,type);
    }
}
