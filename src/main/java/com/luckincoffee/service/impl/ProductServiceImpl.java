package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.OrderItemMapper;
import com.luckincoffee.mapper.PictureMapper;
import com.luckincoffee.mapper.ProductMapper;
import com.luckincoffee.mapper.ReviewMapper;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.ProductService;
import com.luckincoffee.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:22
 * @Description: 商品业务逻辑层具体实现
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private PictureMapper pictureMapper;
    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;


    @Override
    public Product getById(int id) {
        Product product = productMapper.getById(id);
        return product;
    }

    /**
     * 获取要展示的商品信息
     * @param product 商品对象
     * @return
     */
    @Override
    public ProductVo getProductVo(Product product) {
        ProductVo productVo = new ProductVo();
        int pid=product.getId();
        //设置展示图片
        productVo.setShowPicture(pictureMapper.getShowPicture(pid));
        //设置详细图片
        productVo.setDetailPictures(pictureMapper.getDetailsPictures(pid));
        productVo.setReviews(reviewMapper.findByProductId(pid));
        productVo.setReviewCount(reviewMapper.getReviewCount(pid));
        productVo.setSaleCount(orderItemMapper.getSaleCount(pid));
        productVo.setProduct(product);
        return productVo;
    }

    /**
     * 模糊查询
     * @param keywords 关键字
     * @param start   开始页数
     * @param size    每页长度
     * @return 查询到的商品结果集合
     */
    @Override
    public List<Product> search(String keywords, int start, int size) {
        List<Product> products = productMapper.findByKeywords(keywords, start, size);
        return products;
    }
}
