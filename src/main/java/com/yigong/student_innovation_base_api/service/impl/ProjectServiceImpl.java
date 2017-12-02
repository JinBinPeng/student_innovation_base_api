package com.yigong.student_innovation_base_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.ProjectVo;
import com.yigong.student_innovation_base_api.mapper.ProjectMapper;
import com.yigong.student_innovation_base_api.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目service实现类
 * @author jinbin
 * @date 2017-08-11 22:51
 */
@SuppressWarnings("ALL")
@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectMapper projectMapper;
    @Override
    public void addProject(ProjectVo projectVo) {
        projectMapper.saveProject(projectVo);
        //return findByProjectId(projectVo.getProjectId());
    }

    @Override
    public ProjectVo findByProjectId(String projectId) {
        return projectMapper.findByProjectId(projectId);
    }

    @Override
    public boolean deleteProjectBatch(List<String> projectIds) {
        List<ProjectVo> projectVoList=projectMapper.findBatchByProjectIds(projectIds);
        if(projectVoList.size()==0){
            return false;
        }else {
            projectMapper.deleteProjectBatch(projectIds);
            return true;
        }
    }

    @Override
    public List<ProjectVo> listProject() {
        return projectMapper.listProject();
    }

    @Override
    public PageInfo listProjectByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ProjectVo> projectVoList=projectMapper.listProject();
        PageInfo pageInfo=new PageInfo(projectVoList);
        return pageInfo;
    }

    @Override
    public List<ProjectVo> listProjectByCondition(String condition) {
        return projectMapper.listProjectByCondition(condition);
    }

    @Override
    public PageInfo listProjectByCondition(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ProjectVo> projectVoList=projectMapper.listProjectByCondition(condition);
        PageInfo pageInfo=new PageInfo(projectVoList);
        return pageInfo;
    }
}
