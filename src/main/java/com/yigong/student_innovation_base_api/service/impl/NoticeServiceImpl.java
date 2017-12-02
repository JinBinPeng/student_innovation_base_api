package com.yigong.student_innovation_base_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.NoticeVo;
import com.yigong.student_innovation_base_api.mapper.NoticeMapper;
import com.yigong.student_innovation_base_api.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 消息通知service实现类
 * @author jinbin
 * @date 2017-08-13 22:17
 */
@SuppressWarnings("ALL")
@Service("NoticeService")
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    NoticeMapper noticeMapper;
    @Override
    public NoticeVo addNotice(NoticeVo noticeVo) {
        noticeMapper.saveNotice(noticeVo);
        return findNoticeByNoticeId(noticeVo.getNoticeId());
    }

    @Override
    public boolean deleteNoticeByNoticeId(String noticeId) {
        NoticeVo noticeVo=noticeMapper.findNoticeByNoticeId(noticeId);
        if(noticeVo==null) {
            return false;
        }else {
            noticeMapper.deleteNoticeByNoticeId(noticeId);
            return true;
        }
    }

    @Override
    public NoticeVo updateNoticeByNoticeId(String noticeId) {
        noticeMapper.updateNoticeByNoticeId(noticeId);
        return findNoticeByNoticeId(noticeId);
    }

    @Override
    public NoticeVo findNoticeByNoticeId(String noticeId) {
        return noticeMapper.findNoticeByNoticeId(noticeId);
    }

    @Override
    public List<NoticeVo> listNotice() {
        return noticeMapper.listNotice();
    }

    @Override
    public PageInfo listNoticeByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<NoticeVo> noticeVoList=noticeMapper.listNotice();
        PageInfo pageInfo=new PageInfo(noticeVoList);
        return pageInfo;
    }

    @Override
    public List<NoticeVo> listNoticeByCondition(String condition) {
        return noticeMapper.listNoticeByCondition(condition);
    }

    @Override
    public PageInfo listNoticeByCondition(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<NoticeVo> noticeVoList=noticeMapper.listNoticeByCondition(condition);
        PageInfo pageInfo=new PageInfo(noticeVoList);
        return pageInfo;
    }
}
