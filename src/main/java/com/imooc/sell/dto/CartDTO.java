package com.imooc.sell.dto;

import lombok.Getter;

/**
 * 购物车
 * Created by gmm on 2018/5/13
 */
@Getter
//@JsonInclude(JsonInclude.Include.NON_NULL) 放到了全局配置中
public class CartDTO {
    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
