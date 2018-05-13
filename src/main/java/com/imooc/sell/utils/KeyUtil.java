package com.imooc.sell.utils;

import java.util.Random;

/**
 * Created by gmm on 2018/5/13
 */
public class KeyUtil {

    /**
     * 生成主键，时间毫秒+6位随机数
     * @return
     */
    public static String genUniqueKey() {
        Random random = new Random();
        long numbers = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(numbers);
    }
}
