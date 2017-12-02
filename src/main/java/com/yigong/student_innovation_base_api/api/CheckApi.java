package com.yigong.student_innovation_base_api.api;

import com.yigong.student_innovation_base_api.ResultObject;
import com.yigong.student_innovation_base_api.annotation.UserLoginToken;
import com.yigong.student_innovation_base_api.constant.HttpCode;
import com.yigong.student_innovation_base_api.entity.CheckVo;
import com.yigong.student_innovation_base_api.entity.UserVo;
import com.yigong.student_innovation_base_api.service.CheckService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 签到模块API
 * @author jinbin
 * @date 2017-11-03 23:10
 */
@RestController
@RequestMapping("base/api")
public class CheckApi {
    @Autowired
    CheckService checkService;
    //添加签到信息
    @UserLoginToken
    @PostMapping("/check")
    public Object addCheck(@RequestBody CheckVo checkVo, HttpServletRequest request){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(StringUtils.isEmpty(checkVo.getCheckIp())){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("有数据为空，不合法");
            return resultObject;
        }else {
            checkVo.setUserId(userVo.getUserId());
            checkVo.setCheckMemberName(userVo.getMemberName());
            data=checkService.addCheck(checkVo);
            msg="签到成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //根据签到ID查询签到记录
    @UserLoginToken
    @GetMapping("/check/getCheck/{id}")
    public ResultObject findCheckById(@PathVariable(value = "id")String id){
        String msg;
        Object data;
        ResultObject resultObject=new ResultObject();
        data=checkService.findCheckById(id);
        if(data==null){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("没有该签到记录");
            return resultObject;
        }else {
            msg="查询签到信息成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //根据签到人的名字查询签到记录
    @UserLoginToken
    @PutMapping("/check/getCheck")
    public ResultObject findUserByCondition(@RequestBody CheckVo checkVo){
        String msg;
        Object data;
        ResultObject resultObject=new ResultObject();
        data=checkService.findCheckByCondition(checkVo);
        if(data==null){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该基地成员不存在或者没有签到记录");
            return resultObject;
        }else {
            msg="查询签到信息成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //获取签到信息列表
    @UserLoginToken
    @GetMapping("/check")
    public ResultObject listCheck(@RequestParam(defaultValue = "1") int pageNum,
                                 @RequestParam(defaultValue = "5") int pageSize,
                                 @RequestParam(defaultValue = "false") boolean all,
                                 @RequestParam(defaultValue = "") String condition){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        //在没用查询条件的状态下
        if ("".equals(condition)) {
            if (!all) {
                data = checkService.listCheckByPage(pageNum, pageSize);
                msg = "获取第" + pageNum + "页签到信息成功";
            }
            if (all) {
                data = checkService.listCheck();
                msg = "获取签到信息成功";
            }
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
        //使用了查询条件的状态下
        if (!all) {
            data = checkService.listCheckByCondition(condition, pageNum, pageSize);
            msg = "根据搜索条件获取第" + pageNum + "页签到信息成功";
        }
        if (all) {
            data = checkService.listCheckByCondition(condition);
            msg = "根据搜索条件获取签到信息成功";
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
        return resultObject;
    }
}

