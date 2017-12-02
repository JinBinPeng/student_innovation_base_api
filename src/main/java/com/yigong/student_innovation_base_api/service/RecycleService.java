package com.yigong.student_innovation_base_api.service;

import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.RecycleVo;

import java.util.List;

/**
 * 回收站service接口
 * @author jinbin
 * @date 2017-08-13 23:48
 */
public interface RecycleService {
    /**
     * @description 添加回收站信息
     **/
    RecycleVo saveRecycle(RecycleVo recycleVo);
    /**
     * @description 查询多个回收站信息
     **/
    List<RecycleVo> listRecycle();
    /**
     * @description 分页查询回收站信息
     **/
    PageInfo listRecycleByPage(int pageNum, int pageSize);
    /**
     * @description 根据搜索条件查询多个回收站信息
     **/
    List<RecycleVo> listRecycleByCondition(String condition);
    /**
     * @description 根据搜索条件分页查询回收站信息
     **/
    PageInfo listRecycleByCondition(String condition,int pageNum, int pageSize);
}
