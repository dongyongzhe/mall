package com.luckincoffee.comparator;

import com.luckincoffee.pojo.Product;

import java.util.Comparator;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 13:55
 * @Description: 销量比较强，销量高的在前面
 */
public class SalecountComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getSaleCount()-o1.getSaleCount();
    }
}
