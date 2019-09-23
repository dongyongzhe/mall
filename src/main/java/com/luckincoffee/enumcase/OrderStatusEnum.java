package com.luckincoffee.enumcase;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/23 22:30
 * @Description: 订单状态枚举
 */
public enum OrderStatusEnum {
    WAITPAY( "waitPay"),
    WAITDELIVERY("waitDelivery"),
    WAITCONFIRM ( "waitConfirm"),
    WAITREVIEW ("waitReview"),
    FINISH ("finish"),
    DELETE ("delete");
    private final String status;
    //构造器
    private OrderStatusEnum(String status){
        this.status=status;
    }
    public String getStatus(){
        return this.status;
    }
}


