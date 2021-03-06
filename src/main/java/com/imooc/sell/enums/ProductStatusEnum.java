package com.imooc.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by gmm on 2018/5/13
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
