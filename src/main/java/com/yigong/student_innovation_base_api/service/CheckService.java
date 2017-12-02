package com.yigong.student_innovation_base_api.service;

import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.CheckVo;

import java.util.List;

/**
 * 签到service接口
 * @author jinbin
 * @date 2017-11-03 22:57
 */
@SuppressWarnings("ALL")
public interface CheckService {
    /**
     * @description 添加签到信息
     **/
    CheckVo addCheck(CheckVo checkVo);
    /**
     * @description 根据签到ID查询签到信息
     **/
    CheckVo findCheckById(String id);
    /**
     * @description 根据签到人等查询签到信息
     **/
    List<CheckVo> findCheckByCondition(CheckVo checkVo);
    /**
     * @description 查询所有签到信息
     **/
    List<CheckVo> listCheck();
    /**
     * @description 分页查询所有签到信息
     **/
    PageInfo listCheckByPage(int pageNum, int pageSize);
    /**
     * @description 根据搜索条件查询所有签到信息
     **/
    List<CheckVo> listCheckByCondition(String condition);
    /**
     * @description 根据搜索条件分页查询所有签到信息
     **/
    PageInfo listCheckByCondition(String condition,int pageNum, int pageSize);
}
