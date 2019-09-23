package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Order;
import org.apache.ibatis.annotations.*;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 9:25
 * @Description: 订单数据访问层
 */
@Mapper
public interface OrderMapper {
    /**
     * 添加订单
     * @param order 订单对象
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO t_order(id,orderNumber,addressId,total,totalNumber,payDate,pay_mode,deliveryDate,confirmDate,status,user_id) VALUES(NULL,#{orderNumber},#{addressId},#{total},#{totalNumber},#{payDate},#{payMode},#{deliveryDate},#{confirmDate},#{status},#{userId})")
    void add(Order order);

    /**
     * 根据订单Id查询订单
     * @param oid 订单Id
     * @return 查询到的订单
     */
    @Select("SELECT * FROM t_order WHERE id=#{oid}")
    Order getByOrderId(int oid);

    /**
     * 更新订单
     * @param order 订单
     */
    @Update("UPDATE t_order SET payDate=#{payDate},status=#{status}")
    void update(Order order);
}
