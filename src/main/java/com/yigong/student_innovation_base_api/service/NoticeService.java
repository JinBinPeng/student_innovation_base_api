package com.yigong.student_innovation_base_api.service;

import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.NoticeVo;

import java.util.List;

/**
 * 消息通知service接口
 * @author jinbin
 * @date 2017-08-13 22:11
 */
@SuppressWarnings("ALL")
public interface NoticeService {
    /**
    * @description 添加消息通知
    **/
    NoticeVo addNotice(NoticeVo noticeVo);
    /**
    * @description 删除消息通知
    **/
    boolean deleteNoticeByNoticeId(String noticeId);
    /**
    * @description 编辑更新消息通知,把未读变已读
    **/
    NoticeVo updateNoticeByNoticeId(String noticeId);
    /**
    * @description 根据消息通知的ID查询消息通知
    **/
    NoticeVo findNoticeByNoticeId(String noticeId);
    /**
    * @description 查询多个消息通知信息
    **/
    List<NoticeVo> listNotice();
    /**
    * @description 分页查询消息通知信息
    **/
    PageInfo listNoticeByPage(int pageNum, int pageSize);
    /**
    * @description 根据搜索条件查询多个消息通知信息
    **/
    List<NoticeVo> listNoticeByCondition(String condition);
    /**
    * @description 根据搜索条件分页查询消息通知信息
    **/
    PageInfo listNoticeByCondition(String condition,int pageNum, int pageSize);
}
