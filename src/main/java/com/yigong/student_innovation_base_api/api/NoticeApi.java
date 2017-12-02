package com.yigong.student_innovation_base_api.api;

import com.yigong.student_innovation_base_api.ResultObject;
import com.yigong.student_innovation_base_api.annotation.UserLoginToken;
import com.yigong.student_innovation_base_api.constant.HttpCode;
import com.yigong.student_innovation_base_api.entity.NoticeVo;
import com.yigong.student_innovation_base_api.entity.UserVo;
import com.yigong.student_innovation_base_api.service.NoticeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 消息通知模块API
 * @author jinbin
 * @date 2017-08-13 22:32
 */
@RestController
@RequestMapping("base/api")
public class NoticeApi {
    @Autowired
    NoticeService noticeService;
    //添加消息通知
    @UserLoginToken
    @PostMapping("/notice")
    public Object addNotice(@RequestBody NoticeVo noticeVo, HttpServletRequest request) {
        String msg = "";
        Object data = null;
        ResultObject resultObject = new ResultObject();
        UserVo userVo = (UserVo) request.getAttribute("currentUser");
        if (StringUtils.isEmpty(noticeVo.getTitle())
                || StringUtils.isEmpty(noticeVo.getSummary())
                || StringUtils.isEmpty(noticeVo.getReceiverId())
                || StringUtils.isEmpty(userVo.getUserId())) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("有数据为空，不合法");
            return resultObject;
        } else {
            noticeVo.setSenderId(userVo.getUserId());
            data = noticeService.addNotice(noticeVo);
            msg = "发布消息通知成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //删除消息通知
    @UserLoginToken
    @DeleteMapping("/notice/{noticeId}")
    public Object deleteNotice(@PathVariable(value = "noticeId") String noticeId) {
        ResultObject resultObject = new ResultObject();
        if (noticeService.deleteNoticeByNoticeId(noticeId)) {
            resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("删除成功");
            return resultObject;
        } else {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该消息通知不存在");
            return resultObject;
        }
    }
    //修改消息通知
    @UserLoginToken
    @PutMapping("/notice/{noticeId}")
    public Object updateNotice(@PathVariable(value = "noticeId") String noticeId) {
        String msg = "";
        Object data = null;
        ResultObject resultObject = new ResultObject();
        if (noticeService.findNoticeByNoticeId(noticeId) == null) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该消息通知不存在");
            return resultObject;
        } else {
            data = noticeService.updateNoticeByNoticeId(noticeId);
            msg = "消息通知已读";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //获取消息通知列表
    @UserLoginToken
    @GetMapping("/notice")
    public ResultObject listNotice(@RequestParam(defaultValue = "1") int pageNum,
                                   @RequestParam(defaultValue = "5") int pageSize,
                                   @RequestParam(defaultValue = "false") boolean all,
                                   @RequestParam(defaultValue = "") String condition){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        //在没用查询条件的状态下
        if ("".equals(condition)) {
            if (!all) {
                data = noticeService.listNoticeByPage(pageNum, pageSize);
                msg = "获取第" + pageNum + "页消息通知信息成功";
            }
            if (all) {
                data = noticeService.listNotice();
                msg = "获取消息通知信息成功";
            }
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
        //使用了查询条件的状态下
        if (!all) {
            data = noticeService.listNoticeByCondition(condition, pageNum, pageSize);
            msg = "根据搜索条件获取第" + pageNum + "页消息通知信息成功";
        }
        if (all) {
            data = noticeService.listNoticeByCondition(condition);
            msg = "根据搜索条件获取消息通知信息成功";
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
        return resultObject;
    }
}
