package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.ProjectTeamVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 项目成员的mapper
 * @author jinbin
 * @date 2017-09-18 17:42
 */
@Component
public interface ProjectTeamMapper {
    void saveProjectTeam(ProjectTeamVo projectTeamVo);
    List<ProjectTeamVo> listProjectTeam(@Param("projectId") String projectId);
}
