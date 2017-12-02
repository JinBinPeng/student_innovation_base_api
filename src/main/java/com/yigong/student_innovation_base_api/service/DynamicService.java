package com.yigong.student_innovation_base_api.service;

import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.DynamicVo;

import java.util.List;

/**
 * 动态的接口service
 * @author jinbin
 * @date 2017-08-09 17:52
 */

public interface DynamicService {
    /**
    * @description 发布动态
    **/
    DynamicVo addDynamic(DynamicVo dynamicVo);
    /**
    * @description 根据动态ID查询动态
    **/
    DynamicVo findByDynamicId(String dynamicId);
    /**
    * @description 单个或批量删除动态信息
    **/
    boolean deleteDynamicBatch(List<String> dynamicIds);
    /**
     * @description 查询多个动态信息
     **/
    List<DynamicVo> listDynamic();
    /**
     * @description 分页查询动态信息
     **/
    PageInfo listDynamicByPage(int pageNum, int pageSize);
    /**
     * @description 根据搜索条件查询多个动态信息
     **/
    List<DynamicVo> listDynamicByCondition(String condition);
    /**
     * @description 根据搜索条件分页查询动态信息
     **/
    PageInfo listDynamicByCondition(String condition,int pageNum, int pageSize);
}
