package com.chenxy.common.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 时间工具类
 * @author chenxy
 */
public class DateUtils {

    /**
     * 根据format类型返回时间字符串
     * @param format 例如：yyyy-MM-dd HH:mm:ss yyyyMMddHHmmss
     * @return
     */
    public static String getDateByFormat(String format){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("format");
        String date = dateTimeFormatter.format(localDateTime).toString();
        return date;
    }
}
