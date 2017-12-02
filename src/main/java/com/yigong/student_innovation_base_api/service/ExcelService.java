package com.yigong.student_innovation_base_api.service;

import com.yigong.student_innovation_base_api.entity.ExcelVo;

/**
 * Excel的service接口
 * @author jinbin
 * @date 2017-10-27 22:28
 */
public interface ExcelService {
    /**
     * @param excelVo
     * @return 添加excel的记录
     */
    ExcelVo addExcel(ExcelVo excelVo);
}
