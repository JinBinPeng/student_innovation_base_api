package com.yigong.student_innovation_base_api.api;

import com.yigong.student_innovation_base_api.ResultObject;
import com.yigong.student_innovation_base_api.annotation.UserLoginToken;
import com.yigong.student_innovation_base_api.constant.HttpCode;
import com.yigong.student_innovation_base_api.dto.AttendDTO;
import com.yigong.student_innovation_base_api.entity.AttendVo;
import com.yigong.student_innovation_base_api.entity.UserVo;
import com.yigong.student_innovation_base_api.service.AttendService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 值班模块API
 * @author jinbin
 * @date 2017-08-12 15:29
 */
@RestController
@RequestMapping("base/api")
public class AttendApi {
    @Autowired
    AttendService attendService;
    //添加值班安排
    @UserLoginToken
    @PostMapping("/attend")
    public Object addAttend(@RequestBody AttendDTO attendDTO, HttpServletRequest request){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }
        if(attendDTO.getAttendMemberIds().size()==0
                ||StringUtils.isEmpty(attendDTO.getAttendTime())
                ||StringUtils.isEmpty(attendDTO.getCheckTime())
                ||StringUtils.isEmpty(userVo.getUserId())){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("有数据为空，不合法");
            return resultObject;
        }else {
            AttendVo attend=new AttendVo();
            List<Object> objectList=new ArrayList<>();
            attendDTO.getAttendMemberIds().stream().forEach(
                    attendMemberId->{
                        attend.setAttendMemberId(attendMemberId);
                        attend.setCreatorId(userVo.getUserId());
                        attend.setAttendTime(attendDTO.getAttendTime());
                        attend.setCheckTime(attendDTO.getCheckTime());
                        //attendService.addAttend(attendVo);
                        objectList.add(attendService.addAttend(attend));
                    }
            );
            msg="发布值班安排成功";
            resultObject.setCode(HttpCode.OK).setData(objectList).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //修改值班安排
    @UserLoginToken
    @PutMapping("/attend")
    public Object updateAttend(@RequestBody AttendVo attendVo,HttpServletRequest request){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }
        if(attendVo.getAttendMemberId()==null
                ||StringUtils.isEmpty(attendVo.getAttendTime())
                ||StringUtils.isEmpty(attendVo.getCheckTime())
                ||StringUtils.isEmpty(userVo.getUserId())){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("有数据为空，不合法");
            return resultObject;
        }else{
            if(attendService.findAttendByAttendId(attendVo.getAttendId())==null){
                resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该值班信息不存在");
                return resultObject;
            }else {
                attendVo.setEditorId(userVo.getUserId());
                data = attendService.updateAttend(attendVo);
                msg = "更新值班安排成功";
                resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
                return resultObject;
            }
        }
    }
    //删除值班安排
    @UserLoginToken
    @DeleteMapping("/attend/{attendId}")
    public Object deleteAttend(@PathVariable(value = "attendId") String attendId, HttpServletRequest request){
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }else {
            if(attendService.findAttendByAttendId(attendId)==null){
                resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该值班信息不存在");
                return resultObject;
            }else {
                attendService.deleteAttendByAttendId(attendId);
                resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("删除成功");
                return resultObject;
            }
        }
    }
    //获取值班安排列表
    @UserLoginToken
    @GetMapping("/attend")
    public ResultObject listAttend(@RequestParam(defaultValue = "1") int pageNum,
                                    @RequestParam(defaultValue = "5") int pageSize,
                                    @RequestParam(defaultValue = "false") boolean all,
                                    @RequestParam(defaultValue = "") String condition){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        //在没用查询条件的状态下
        if ("".equals(condition)) {
            if (!all) {
                data = attendService.listAttendByPage(pageNum, pageSize);
                msg = "获取第" + pageNum + "页基地值班信息成功";
            }
            if (all) {
                data = attendService.listAttend();
                msg = "获取基地值班信息成功";
            }
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
        //使用了查询条件的状态下
        if (!all) {
            data = attendService.listAttendByCondition(condition, pageNum, pageSize);
            msg = "根据搜索条件获取第" + pageNum + "页基地值班信息成功";
        }
        if (all) {
            data = attendService.listAttendByCondition(condition);
            msg = "根据搜索条件获取基地值班信息成功";
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
        return resultObject;
    }
}
