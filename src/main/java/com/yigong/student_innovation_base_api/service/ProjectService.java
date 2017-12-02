package com.yigong.student_innovation_base_api.service;


import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.ProjectVo;

import java.util.List;

/**
 * 项目service接口
 * @author jinbin
 * @date 2017-08-11 16:43
 */
@SuppressWarnings("ALL")
public interface ProjectService {
    /**
    * @description 创建项目
    **/
    void addProject(ProjectVo projectVo);
    /**
    * @description 根据项目ID查询项目
    **/
    ProjectVo findByProjectId(String projectId);
    /**
    * @description 单个或批量删除项目信息
    **/
    boolean deleteProjectBatch(List<String> projectIds);
    /**
    * @description 查询多个项目信息
    **/
    List<ProjectVo> listProject();
    /**
    * @description 分页查询项目信息
    **/
    PageInfo listProjectByPage(int pageNum, int pageSize);
    /**
     * @description 根据搜索条件查询多个项目信息
     **/
    List<ProjectVo> listProjectByCondition(String condition);
    /**
     * @description 根据搜索条件分页查询项目信息
     **/
    PageInfo listProjectByCondition(String condition,int pageNum, int pageSize);

}
