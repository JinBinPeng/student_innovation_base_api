package com.yigong.student_innovation_base_api.entity;

import lombok.Data;

/**
 * 回收站实体类
 * @author jinbin
 * @date 2017-08-13 23:15
 */
@Data
public class RecycleVo {
    String recyclerId;
    Integer recyclerType;
    String dynamicId;
    DynamicVo dynamic;
    String projectId;
    ProjectVo project;
    String operatorId;
    UserVo operator;
    Long createTime;
    Long updateTime;
}
