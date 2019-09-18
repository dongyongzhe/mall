package com.luckincoffee.comparator;

import com.luckincoffee.pojo.Product;

import java.util.Comparator;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 13:58
 * @Description: 价格比较器，升序
 */
public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPromotePrice()-o2.getPromotePrice());
    }
}
