package com.yigong.student_innovation_base_api.service;

import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.AttendVo;

import java.util.List;

/**
 * 值班service接口
 * @author jinbin
 * @date 2017-08-12 15:00
 */
@SuppressWarnings("ALL")
public interface AttendService {
    /**
    * @description 添加值班安排
    **/
    AttendVo addAttend(AttendVo attendVo);
    /**
    * @description 编辑值班安排
    **/
    AttendVo updateAttend(AttendVo attendVo);
    /**
    * @description 删除值班安排
    **/
    boolean deleteAttendByAttendId(String attendId);
    /**
    * @description 查询值班安排
    **/
    AttendVo findAttendByAttendId(String attendId);
    /**
     * @description 查询多个值班信息
     **/
    List<AttendVo> listAttend();
    /**
     * @description 分页查询值班信息
     **/
    PageInfo listAttendByPage(int pageNum, int pageSize);
    /**
     * @description 根据搜索条件查询多个值班信息
     **/
    List<AttendVo> listAttendByCondition(String condition);
    /**
     * @description 根据搜索条件分页查询值班信息
     **/
    PageInfo listAttendByCondition(String condition,int pageNum, int pageSize);
}
