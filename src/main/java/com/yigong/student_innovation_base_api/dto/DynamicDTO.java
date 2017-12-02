package com.yigong.student_innovation_base_api.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jinbin on 2017-08-10 15:39.
 */
@SuppressWarnings("ALL")
@Component
@Data
public class DynamicDTO {
    List<String> dynamicIds;
}
