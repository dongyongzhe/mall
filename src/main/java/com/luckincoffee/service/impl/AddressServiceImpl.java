package com.luckincoffee.service.impl;

import com.luckincoffee.mapper.AddressMapper;
import com.luckincoffee.pojo.Address;
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

    @Override
    public Address getAddress(int uid) {
        return null;
    }
}
