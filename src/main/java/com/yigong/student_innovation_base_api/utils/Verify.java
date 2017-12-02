package com.yigong.student_innovation_base_api.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证手机号是否合法的工具类
 * @author jinbin
 * @date 2017-08-05 00:51
 */
public class Verify {
    /*
    * 验证是否为合法的手机号
    * */
    public static boolean isMobileNO(String phoneNumber){
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }
}
