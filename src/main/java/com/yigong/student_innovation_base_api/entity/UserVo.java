package com.yigong.student_innovation_base_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 * @author jinbin
 * @date 2017-08-04 17:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    String userId;
    String memberName;
    String password;
    String phoneNumber;
    String department;
    String grade;
    String imageUrl;
    Long createTime;
    Long updateTime;
    Boolean delete;
    Integer userLevel;
}
