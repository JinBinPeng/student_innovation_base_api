package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.ExcelVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 上传Excel的mapper
 * @author jinbin
 * @date 2017-10-27 21:26
 */
@Component
public interface ExcelMapper {
    void addExcel(ExcelVo excelVo);
    ExcelVo findExcelById(@Param("id") String id);
}
