package com.luckincoffee.mapper;

import com.luckincoffee.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/18 9:17
 * @Description: 订单项数据访问层
 */
@Mapper
public interface OrderItemMapper {
    /**
     * 根据订单Id获取到订单项
     * @param orderId 订单Id
     * @return 订单项对象
     */
    @Select("SELECT * FROM t_orderItem WHERE order_id=#{orderId}")
    List<OrderItem> findByOrderId(int orderId);
    /**
     * 根据商品Id获取到订单项
     * @param pid 商品Id
     * @return 订单项对象
     */
    @Select("SELECT * FROM t_orderItem WHERE product_id=#{pid}")
    List<OrderItem> findByProductId(int pid);


}
