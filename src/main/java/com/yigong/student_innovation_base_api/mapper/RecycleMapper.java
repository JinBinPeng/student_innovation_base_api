package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.RecycleVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 回收站的mapper
 * @author jinbin
 * @date 2017-08-13 23:22
 */
@Component
public interface RecycleMapper {
    void saveRecycle(RecycleVo recycleVo);
    RecycleVo findRecycleByRecyclerId(@Param("recyclerId") String recyclerId);
    List<RecycleVo> listRecycle();
    List<RecycleVo> listRecycleByCondition(@Param("condition") String condition);
}
