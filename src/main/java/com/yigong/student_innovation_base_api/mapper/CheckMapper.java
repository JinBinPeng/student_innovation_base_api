package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.CheckVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 签到mapper
 * @author jinbin
 * @date 2017-11-03 22:48
 */
@Component
public interface CheckMapper {
    void saveCheck(CheckVo checkVo);
    CheckVo findCheckById(@Param("id") String id);
    List<CheckVo> findByCondition(CheckVo checkVo);
    List<CheckVo> listCheck();
    List<CheckVo> listCheckByCondition(@Param("condition") String condition);
}
