package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/23 15:35
 * @Description: 收货地址CRUD
 */
@Mapper
public interface AddressMapper {
    /**
     * 添加地址对象
     * @param address 地址对象
     */
    @Insert("INSERT INTO t_address(id,user_id,order_id,detail,post,receiver,mobile) VALUES(null,#{userId},#{orderId},#{detail},#{post},#{receiver},#{mobile})")
    void add(Address address);
}
