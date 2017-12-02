package com.yigong.student_innovation_base_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 项目图片实体类
 * @author jinbin
 * @date 2017-09-17 22:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectImageVo {
    String id;
    String image;
    String projectId;
    Long createTime;
}
