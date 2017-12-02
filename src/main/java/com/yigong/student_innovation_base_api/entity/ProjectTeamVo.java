package com.yigong.student_innovation_base_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 项目团队实体类
 * @author jinbin
 * @date 2017-09-18 17:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectTeamVo {
    String id;
    String memberId;
    UserVo userVo;
    String projectId;
    Long createTime;
}
