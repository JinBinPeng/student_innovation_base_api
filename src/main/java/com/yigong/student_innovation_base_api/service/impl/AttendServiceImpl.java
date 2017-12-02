package com.yigong.student_innovation_base_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.AttendVo;
import com.yigong.student_innovation_base_api.mapper.AttendMapper;
import com.yigong.student_innovation_base_api.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 值班service实现类
 * @author jinbin
 * @date 2017-08-12 15:03
 */
@Service("AttendService")
public class AttendServiceImpl implements AttendService{
    @Autowired
    AttendMapper attendMapper;
    @Override
    public AttendVo addAttend(AttendVo attendVo) {
        attendMapper.saveAttend(attendVo);
        return attendMapper.findAttendByAttendId(attendVo.getAttendId());
    }

    @Override
    public AttendVo updateAttend(AttendVo attendVo) {
        attendMapper.updateAttend(attendVo);
        return attendMapper.findAttendByAttendId(attendVo.getAttendId());
    }

    @Override
    public boolean deleteAttendByAttendId(String attendId) {
        AttendVo attendVo=attendMapper.findAttendByAttendId(attendId);
        if(attendVo==null) {
            return false;
        }else {
            attendMapper.deleteAttendByAttendId(attendId);
            return true;
        }
    }

    @Override
    public AttendVo findAttendByAttendId(String attendId) {
        return attendMapper.findAttendByAttendId(attendId);
    }

    @Override
    public List<AttendVo> listAttend() {
        return attendMapper.listAttend();
    }

    @Override
    public PageInfo listAttendByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AttendVo> attendVoList=attendMapper.listAttend();
        PageInfo pageInfo=new PageInfo(attendVoList);
        return pageInfo;
    }

    @Override
    public List<AttendVo> listAttendByCondition(String condition) {
        return attendMapper.listAttendByCondition(condition);
    }

    @Override
    public PageInfo listAttendByCondition(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AttendVo> attendVoList=attendMapper.listAttendByCondition(condition);
        PageInfo pageInfo=new PageInfo(attendVoList);
        return pageInfo;
    }
}
