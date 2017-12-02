package com.yigong.student_innovation_base_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by jinbin on 2017-10-28 17:24.
 */
@SuppressWarnings("ALL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendDTO {
    String checkTime;
    String attendTime;
    List<String> attendMemberIds;
}
