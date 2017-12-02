package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.DynamicVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 动态的mapper
 * @author jinbin
 * @date 2017-08-09 17:23
 */
@Component
public interface DynamicMapper {
    void saveDynamic(DynamicVo dynamicVo);
    void deleteDynamicBatch(@Param("dynamicIds") List<String> dynamicIds);
    List<DynamicVo> findBatchByDynamicIds(@Param("dynamicIds") List<String> dynamicIds);
    DynamicVo findByDynamicId(@Param("dynamicId") String dynamicId);
    DynamicVo findByDynamicIdIsDelete(@Param("dynamicId") String dynamicId);
    List<DynamicVo> listDynamic();
    List<DynamicVo> listDynamicByCondition(@Param("condition") String condition);
}
