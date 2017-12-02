package com.yigong.student_innovation_base_api.config;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 处理全局异常
 * @author jinbin
 * @date 2017-08-05 12:34
 */
@ControllerAdvice
public class GloablExceptionHandler {
    private Logger logger= LoggerFactory.getLogger(GloablExceptionHandler.class);
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        // 记录错误信息
        logger.error(ExceptionUtils.getStackTrace(e));
        String msg = e.getMessage();
        if (msg == null || msg.equals("")) {
            msg = "服务器出错";
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", msg);
        return jsonObject;
    }
}
