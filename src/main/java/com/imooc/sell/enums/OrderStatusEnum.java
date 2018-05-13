package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created by gmm on 2018/5/13
 */
@Getter
public enum  OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完成"),
    CANCEL(2, "取消")
    ;

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
