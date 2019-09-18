package com.luckincoffee.comparator;

import com.luckincoffee.pojo.Product;

import java.util.Comparator;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 13:47
 * @Description: 根据评价数比较,降序
 */
public class ReviewComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getReviewCount()-o1.getReviewCount();
    }
}
