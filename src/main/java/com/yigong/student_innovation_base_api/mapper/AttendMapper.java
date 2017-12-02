package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.AttendVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 值班mapper
 * @author jinbin
 * @date 2017-08-12 11:01
 */
@Component
public interface AttendMapper {
    /**
     * @param attendVo
     */
    void saveAttend(AttendVo attendVo);

    /**
     * @param attendVo
     */
    void updateAttend(AttendVo attendVo);

    /**
     * @param attendId attend_id
     */
    void deleteAttendByAttendId(@Param("attendId") String attendId);

    /**
     * @param attendId attend_id
     * @return AttendVo
     */
    AttendVo findAttendByAttendId(@Param("attendId") String attendId);

    /**
     * @return List<AttendVo>
     */
    List<AttendVo> listAttend();

    /**
     * @param condition check_time，attend_time
     * @return List<AttendVo>
     */
    List<AttendVo> listAttendByCondition(@Param("condition") String condition);
}
