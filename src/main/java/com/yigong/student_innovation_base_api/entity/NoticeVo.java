package com.yigong.student_innovation_base_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 消息通知实体类
 * @author jinbin
 * @date 2017-08-13 19:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoticeVo {
    String noticeId;
    String senderId;
    UserVo sender;
    String receiverId;
    UserVo receiver;
    String title;
    String summary;
    Boolean read;
    Long createTime;
    Long updateTime;
}
