package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.ProjectVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 项目的mapper
 * @author jinbin
 * @date 2017-08-11 15:26
 */
@Component
public interface ProjectMapper {
    void saveProject(ProjectVo projectVo);
    void deleteProjectBatch(@Param("projectIds") List<String> projectIds);
    ProjectVo findByProjectId(@Param("projectId") String projectId);
    ProjectVo findByProjectIdIsDelete(@Param("projectId") String projectId);
    List<ProjectVo> findBatchByProjectIds(@Param("projectIds") List<String> projectIds);
    List<ProjectVo> listProject();
    List<ProjectVo> listProjectByCondition(@Param("condition") String condition);
}
