package com.luckincoffee.enumcase;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/23 22:30
 * @Description: 订单状态枚举
 */
public enum OrderStatusEnum {
    /**
     * 未支付
     */
    WAITPAY( "waitPay"),
    /**
     * 未发货
     */
    WAITDELIVERY("waitDelivery"),
    /**
     * 未确认收货
     */
    WAITCONFIRM ( "waitConfirm"),
    /**
     * 未评价
     */
    WAITREVIEW ("waitReview"),
    /**
     * 完成
     */
    FINISH ("finish"),
    /**
     * 被删除
     */
    DELETE ("delete");
    /**
     * 属性
     */
    private final String status;

    /**
     * 构造器
     * @param status 属性
     */
    private OrderStatusEnum(String status){
        this.status=status;
    }
    public String getStatus(){
        return this.status;
    }
}


