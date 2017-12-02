package com.yigong.student_innovation_base_api.api;

import com.yigong.student_innovation_base_api.ResultObject;
import com.yigong.student_innovation_base_api.annotation.UserLoginToken;
import com.yigong.student_innovation_base_api.constant.HttpCode;
import com.yigong.student_innovation_base_api.dto.DynamicDTO;
import com.yigong.student_innovation_base_api.entity.DynamicVo;
import com.yigong.student_innovation_base_api.entity.RecycleVo;
import com.yigong.student_innovation_base_api.entity.UserVo;
import com.yigong.student_innovation_base_api.service.DynamicService;
import com.yigong.student_innovation_base_api.service.RecycleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 动态模块API
 * @author jinbin
 * @date 2017-08-09 23:18
 */
@RestController
@RequestMapping("base/api")
public class DynamicApi {
    @Autowired
    DynamicService dynamicService;
    @Autowired
    RecycleService recycleService;
    //添加动态
    @UserLoginToken
    @PostMapping("/dynamic")
    public Object addDynamic(@RequestBody DynamicVo dynamicVo, HttpServletRequest request){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }
        if(StringUtils.isEmpty(dynamicVo.getTitle())
                ||StringUtils.isEmpty(dynamicVo.getContent())
                ||StringUtils.isEmpty(userVo.getUserId())){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("有数据为空，不合法");
            return resultObject;
        }else {
            dynamicVo.setAnnouncerId(userVo.getUserId());
            data=dynamicService.addDynamic(dynamicVo);
            msg="发布动态成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //删除单个或多个动态信息
    @UserLoginToken
    @PutMapping("/dynamic/batchDelete")
    public Object batchDeleteDynamic(@RequestBody DynamicDTO dynamicDTO, HttpServletRequest request){
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }
        if(dynamicService.deleteDynamicBatch(dynamicDTO.getDynamicIds())){
            //删除完了需要把删除记录添加到回收站
            RecycleVo recycleVo=new RecycleVo();
            dynamicDTO.getDynamicIds().stream().forEach(
            dynamicId->{
                    recycleVo.setDynamicId(dynamicId);
                    recycleVo.setRecyclerType(0);
                    recycleVo.setOperatorId(userVo.getUserId());
                    recycleService.saveRecycle(recycleVo);
                }
            );
            resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("删除成功,管理员可以在回收站查看");
            return resultObject;
        }else {
            resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("所要删除的动态不存在");
            return resultObject;
        }
    }
    //获取列表动态
    @UserLoginToken
    @GetMapping("/dynamic")
    public ResultObject listDynamic(@RequestParam(defaultValue = "1") int pageNum,
                                 @RequestParam(defaultValue = "5") int pageSize,
                                 @RequestParam(defaultValue = "false") boolean all,
                                 @RequestParam(defaultValue = "") String condition){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        //在没用查询条件的状态下
        if ("".equals(condition)) {
            if (!all) {
                data = dynamicService.listDynamicByPage(pageNum, pageSize);
                msg = "获取第" + pageNum + "页基地动态信息成功";
            }
            if (all) {
                data = dynamicService.listDynamic();
                msg = "获取基地动态信息成功";
            }
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
        //使用了查询条件的状态下
        if (!all) {
            data = dynamicService.listDynamicByCondition(condition, pageNum, pageSize);
            msg = "根据搜索条件获取第" + pageNum + "页基地动态信息成功";
        }
        if (all) {
            data = dynamicService.listDynamicByCondition(condition);
            msg = "根据搜索条件获取基地动态信息成功";
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
        return resultObject;
    }

}
