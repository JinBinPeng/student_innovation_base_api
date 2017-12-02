package com.yigong.student_innovation_base_api.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 对用户密码进行加密的工具类
 * @author jinbin
 * @date 2017-08-05 00:57
 */
public class PasswordUtils {
    //改用hash值来存储用户的密码
    public static String passwordToHash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(password.getBytes());
            byte[] src = digest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            // 字节数组转16进制字符串
            // https://my.oschina.net/u/347386/blog/182717
            for (byte aSrc : src) {
                String s = Integer.toHexString(aSrc & 0xFF);
                if (s.length() < 2) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException ignore) {
        }
        return null;
    }
}
