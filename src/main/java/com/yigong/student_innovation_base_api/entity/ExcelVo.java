package com.yigong.student_innovation_base_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 上传Excel实体类
 * @author jinbin
 * @date 2017-10-27 21:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcelVo {
    String id;
    String excelUrl;
    Long createTime;
}
