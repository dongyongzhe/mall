package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.AddressMapper;
import com.luckincoffee.pojo.Address;
import com.luckincoffee.pojo.Order;
import com.luckincoffee.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/23 15:19
 * @Description: 收货地址业务逻辑具体实现
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public void add(Address address) {
        addressMapper.add(address);
    }

    /**
     * 根据订单查询订单对应的收货地址
     * @param order 订单对象
     * @return 查询到的地址
     */
    @Override
    public Address getAddressByOrder(Order order) {
        return addressMapper.getAdderById(order.getAddressId());
    }
}
