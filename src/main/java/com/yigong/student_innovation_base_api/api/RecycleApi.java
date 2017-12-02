package com.yigong.student_innovation_base_api.api;

import com.yigong.student_innovation_base_api.ResultObject;
import com.yigong.student_innovation_base_api.annotation.UserLoginToken;
import com.yigong.student_innovation_base_api.constant.HttpCode;
import com.yigong.student_innovation_base_api.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回收站模块API
 * @author jinbin
 * @date 2017-08-14 12:42
 */
@RestController
@RequestMapping("base/api")
public class RecycleApi {
    @Autowired
    RecycleService recycleService;
    //获取回收站列表信息
    @UserLoginToken
    @GetMapping("/recycle")
    public ResultObject listRecycle(@RequestParam(defaultValue = "1") int pageNum,
                                    @RequestParam(defaultValue = "5") int pageSize,
                                    @RequestParam(defaultValue = "false") boolean all,
                                    @RequestParam(defaultValue = "") String condition){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        if ("".equals(condition)) {
            if (!all) {
                data = recycleService.listRecycleByPage(pageNum, pageSize);
                msg = "获取第" + pageNum + "页基地回收站信息成功";
            }
            if (all) {
                data = recycleService.listRecycle();
                msg = "获取基地回收站信息成功";
            }
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
        //使用了查询条件的状态下
        if (!all) {
            data = recycleService.listRecycleByCondition(condition, pageNum, pageSize);
            msg = "根据搜索条件获取第" + pageNum + "页基地回收站信息成功";
        }
        if (all) {
            data = recycleService.listRecycleByCondition(condition);
            msg = "根据搜索条件获取基地回收站信息成功";
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
        return resultObject;
    }
}
