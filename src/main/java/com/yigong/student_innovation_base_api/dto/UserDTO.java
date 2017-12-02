package com.yigong.student_innovation_base_api.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by jinbin on 2017-09-17 20:38.
 */
@SuppressWarnings("ALL")
@Data
public class UserDTO {
    List<String> userIds;
    String userId;
    String password;
    String phoneNumber;
    String smsCode;//MobSms的验证码
}
