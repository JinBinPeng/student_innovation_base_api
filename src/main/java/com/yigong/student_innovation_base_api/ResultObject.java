package com.yigong.student_innovation_base_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * 返回体的格式
 * @author jinbin
 * @date 2017-08-04 17:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObject {
    private String msg;
    private int code;
    private Object data;
    private boolean success;
    private String error;
    public ResultObject setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public ResultObject setCode(int code) {
        this.code = code;
        return this;
    }
    public ResultObject setData(Object data) {
        this.data = data;
        return this;
    }
    public ResultObject setSuccess(boolean success) {
        this.success = success;
        return this;
    }
}
