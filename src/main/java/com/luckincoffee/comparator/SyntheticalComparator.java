package com.luckincoffee.comparator;

import com.luckincoffee.pojo.Product;

import java.util.Comparator;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 13:44
 * @Description: 综合比较器,降序排列
 */
public class SyntheticalComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getReviewCount()-o1.getReviewCount();
    }
}
