package com.yigong.student_innovation_base_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 动态实体类
 * @author jinbin
 * @date 2017-08-09 17:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DynamicVo {
    String dynamicId;
    String title;
    String content;
    String imageUrl;
    String announcerId;
    Long createTime;
    Long updateTime;
    UserVo announcer;//动态发布者
    Boolean delete;
}
