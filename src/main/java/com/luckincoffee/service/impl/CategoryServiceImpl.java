package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.CategoryMapper;
import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.service.CategoryService;
import com.luckincoffee.service.ProductService;
import com.luckincoffee.vo.CategoryVo;
import com.luckincoffee.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: dyz
 * @Description: 分类的业务逻辑
 * @Date: 2019/8/23 8:56
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductService productService;

    /**
     * @param cid 分类Id
     * @return 类别对象
     */
    @Override
    public Category getById(int cid) {
        Category category = categoryMapper.findOne(cid);
        return category;
    }

    /**
     * @param category 某一类
     * @return 某一类下所有展示的商品
     */
    @Override
    public List<ProductVo> listProductVo(Category category) {
        List<ProductVo> productVos = new ArrayList<>();
        int cid = category.getId();
        List<Product> products = categoryMapper.findByCategoryId(cid);
        for (Product product : products) {
            ProductVo productVo = productService.getProductVo(product);
                productVos.add(productVo);
        }
        return productVos;
    }

    /**
     * @return 所有分类下的所有展示商品信息
     */
    @Override
    public List<CategoryVo> listAllCategoryVo() {
        List<CategoryVo> categoryVos = new ArrayList<>();
        List<Category> categories = categoryMapper.findAll();
        for (Category category : categories) {
            List<ProductVo> productVos = listProductVo(category);
            CategoryVo categoryVo = new CategoryVo();
            categoryVo.setProductVos(productVos);
            categoryVo.setCategory(category);
            categoryVos.add(categoryVo);
        }

        return categoryVos;
    }


}


