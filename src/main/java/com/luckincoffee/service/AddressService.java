package com.luckincoffee.service;

import com.luckincoffee.pojo.Address;
import com.luckincoffee.pojo.Order;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/23 15:18
 * @Description: 收货地址业务逻辑接口
 */
public interface AddressService {
    /**
     * 添加用户收货地址
     * @param address 地址对象
     */
    void add(Address address);

    /**
     * 根据订单获取地址
     * @param order 订单对象
     * @return 查询到的地址
     */
    Address getAddressByOrder(Order order);
}
