package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
    @Insert("INSERT INTO t_address(id,user_id,detail,post,receiver,mobile) VALUES(null,#{userId},#{detail},#{post},#{receiver},#{mobile})")
    void add(Address address);

    /**
     * 根据订单id查询收货地址
     * @param id 地址Id
     * @return 查询到的地址
     */
    @Select("SELECT * FORM t_address WHERE id=#{id}")
    Address getAdderById(int id);
}
