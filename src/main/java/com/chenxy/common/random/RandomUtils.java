package com.chenxy.common.random;

/**
 * 随机数工具类
 * @author chenxy
 */
public class RandomUtils {

    /**
     * 获取指定长度随机数
     * @param len 指定长度
     * @return
     */
    public static String getRandomByLen(int len) {
        int rs = (int) ((Math.random() * 9 + 1) * Math.pow(10, len - 1));
        return String.valueOf(rs);
     }
}
