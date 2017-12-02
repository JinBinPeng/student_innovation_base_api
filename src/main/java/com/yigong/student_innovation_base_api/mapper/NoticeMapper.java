package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.NoticeVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 消息通知的mapper
 * @author jinbin
 * @date 2017-08-13 20:05
 */
@Component
public interface NoticeMapper {
    void saveNotice(NoticeVo noticeVo);
    void deleteNoticeByNoticeId(@Param("noticeId") String noticeId);
    void updateNoticeByNoticeId(@Param("noticeId") String noticeId);
    NoticeVo findNoticeByNoticeId(@Param("noticeId") String noticeId);
    List<NoticeVo> listNotice();
    List<NoticeVo> listNoticeByCondition(@Param("condition") String condition);
}
