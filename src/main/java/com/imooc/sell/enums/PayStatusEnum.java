package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created by gmm on 2018/5/13
 */
@Getter
public enum  PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付完成")
    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
