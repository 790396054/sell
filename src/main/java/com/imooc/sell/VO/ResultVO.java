package com.imooc.sell.VO;

import lombok.Data;

/**
 * http返回给前端的最外层对象
 * Created by gmm on 2018/5/13
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
