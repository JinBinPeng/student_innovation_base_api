package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.ProjectImageVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 项目图片的mapper
 * @author jinbin
 * @date 2017-09-17 22:46
 */
@Component
public interface ProjectImageMapper {
    void saveProjectImage(ProjectImageVo projectImageVo);
    List<ProjectImageVo> findByProjectId(@Param("projectId") String projectId);
}
