package com.yigong.student_innovation_base_api.entity;

import com.yigong.student_innovation_base_api.dto.ProjectDTO;
import com.yigong.student_innovation_base_api.dto.UserDTO;
import lombok.Data;

import java.util.List;

/**
 * 项目实体类
 * @author jinbin
 * @date 2017-08-11 15:19
 */
@Data
public class ProjectVo {
    String projectId;
    String projectName;
    String detail;
    String creatorId;
    UserVo announcer;//项目创建者
    Integer projectType;//项目类型：0为app，1为网站，2为科研类项目，3为其他
    Long createTime;
    Long updateTime;
    Long deadLine;//完成时间
    UserVo userVo;
    List<String> imageUrl;
    List<ProjectImageVo> projectImageVo;
    Boolean delete;
    List<String> userIds;
    List<ProjectTeamVo> projectTeamVoList;
}
