package com.bingo.code.example.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by ZhangGe on 2017/9/20.
 */
public class ThreadLocalDateFormat {
    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    // 如果是JDK8的应用，可以使用instant代替Date，
    // Localdatetime代替Calendar，
    // Datetimeformatter代替Simpledateformatter，
    // 官方给出的解释：simple beautiful strong immutable thread-secure。
}
