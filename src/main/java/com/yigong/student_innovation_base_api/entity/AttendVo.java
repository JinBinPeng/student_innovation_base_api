package com.yigong.student_innovation_base_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 值班安排实体类
 * @author jinbin
 * @date 2017-08-12 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendVo {
    String attendId;
    String checkTime;
    String attendTime;
    Long createTime;
    Long updateTime;
    String creatorId;
    UserVo announcer;//值班创建者
    String attendMemberId;
    UserVo userVo;
    String editorId;
    UserVo editor;
}
