package com.yigong.student_innovation_base_api.service.impl;

import com.yigong.student_innovation_base_api.entity.ExcelVo;
import com.yigong.student_innovation_base_api.mapper.ExcelMapper;
import com.yigong.student_innovation_base_api.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Excel的service实现类
 * @author jinbin
 * @date 2017-10-27 22:28
 */
@SuppressWarnings("ALL")
@Service("ExcelService")
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    ExcelMapper excelMapper;
    @Override
    public ExcelVo addExcel(ExcelVo excelVo) {
        excelMapper.addExcel(excelVo);
        return excelMapper.findExcelById(excelVo.getId());
    }
}
