package com.luckincoffee.service;

import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;
import com.luckincoffee.vo.CategoryVo;
import com.luckincoffee.vo.ProductVo;

import java.util.List;

/**
 * @Author: dyz
 * @Description: 分类业务逻辑接口
 * @Date: 2019/8/22 17:31
 */
public interface CategoryService {
    Category getById(int cid);
    List<CategoryVo> listAllCategoryVo();
    List<ProductVo> listProductVo(Category category);

}
