package com.yigong.student_innovation_base_api.service;

import com.yigong.student_innovation_base_api.entity.UserVo;

/**
 * token的service接口
 * @author jinbin
 * @date 2017-08-06 16:05
 */
public interface TokenService {
    /**
    * @description 获取token
    **/
    public String getToken(UserVo userVo);
}
