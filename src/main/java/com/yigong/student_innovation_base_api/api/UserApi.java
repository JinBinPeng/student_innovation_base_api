package com.yigong.student_innovation_base_api.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yigong.student_innovation_base_api.ResultObject;
import com.yigong.student_innovation_base_api.annotation.PassToken;
import com.yigong.student_innovation_base_api.annotation.UserLoginToken;
import com.yigong.student_innovation_base_api.constant.HttpCode;
import com.yigong.student_innovation_base_api.dto.UserDTO;
import com.yigong.student_innovation_base_api.entity.ExcelVo;
import com.yigong.student_innovation_base_api.entity.UserVo;
import com.yigong.student_innovation_base_api.service.ExcelService;
import com.yigong.student_innovation_base_api.service.TokenService;
import com.yigong.student_innovation_base_api.service.UserService;
import com.yigong.student_innovation_base_api.utils.MobSmsUtils;
import com.yigong.student_innovation_base_api.utils.PasswordUtils;
import com.yigong.student_innovation_base_api.utils.Verify;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URL;

/**
 * 用户模块API
 * @author jinbin
 * @date 2017-08-05 10:46
 */
@RestController
@RequestMapping("base/api")
public class UserApi {
    /**
     * @description MobSms相关属性
     **/
    @Value("${mobSms.verifyUrl}")
    String verifyUrl;
    @Value("${mobSms.appkey}")
    String appkey;
    @Value("${mobSms.zone}")
    String zone;
    @Autowired
    UserService userService;
    @Autowired
    ExcelService excelService;
    @Autowired
    TokenService tokenService;
    //用户名OR手机号登录
    @PostMapping("/login")
    public Object login(@RequestBody UserVo userVo){
        ResultObject resultObject=new ResultObject();
        JSONObject jsonObject=new JSONObject();
        UserVo userForBase= userService.findUserByMemberNameOrPhoneNumber(userVo);
        if(userForBase==null){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("登录失败,用户不存在");
            return resultObject;
        }else {
            if (!userForBase.getPassword().equals(PasswordUtils.passwordToHash(userVo.getPassword()))){
                resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("登录失败,密码错误");
                return resultObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                resultObject.setCode(HttpCode.OK).setData(jsonObject).setSuccess(true).setMsg("登录成功");
                return resultObject;
            }
        }
    }
    //成员注册
    @PassToken
    @PostMapping("/user")
    public Object addUser(@RequestBody UserVo userVo){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        if(StringUtils.isEmpty(userVo.getMemberName())
                ||StringUtils.isEmpty(userVo.getPassword())
                ||StringUtils.isEmpty(userVo.getDepartment())
                ||StringUtils.isEmpty(userVo.getPhoneNumber())){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("有数据为空，不合法");
            return resultObject;
        }else {
            if(Verify.isMobileNO(userVo.getPhoneNumber())){
                data=userService.addUser(userVo);
                if(data==null){
                    msg="手机号或者用户名已经被使用";
                    resultObject.setCode(HttpCode.UNAUTHORIZED).setSuccess(false).setMsg(msg);
                    return resultObject;
                }
                msg="添加成员成功";
                resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
                return resultObject;
            }else {
                msg="手机号格式错误";
                resultObject.setCode(HttpCode.UNAUTHORIZED).setSuccess(false).setMsg(msg);;
                return resultObject;
            }
        }
    }
    //导入Excel文件添加用户
    @UserLoginToken
    @PostMapping("/user/excel")
    public Object importExcel(@RequestBody ExcelVo excelVo, HttpServletRequest request) throws IOException {
        ResultObject resultObject=new ResultObject();
        UserVo loginUser=(UserVo) request.getAttribute("currentUser");
        if(loginUser.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }
        //保存上传的excel路径
        Object data=excelService.addExcel(excelVo);
        //FileInputStream不支持从网络路径获取数据，用url可以
        URL excelUrl = new URL(excelVo.getExcelUrl());
        XSSFWorkbook book = new XSSFWorkbook(excelUrl.openStream());
        XSSFSheet sheet = book.getSheetAt(0);
        UserVo userVo = new UserVo();
        for (int i = 2; i < sheet.getLastRowNum() + 1; i++) {
            XSSFRow row = sheet.getRow(i);
            //列中的内容都设置成String类型格式
            row.getCell(0).setCellType(CellType.STRING);
            userVo.setMemberName(row.getCell(0).getStringCellValue());
            row.getCell(1).setCellType(CellType.STRING);
            userVo.setPhoneNumber(row.getCell(1).getStringCellValue());
            row.getCell(2).setCellType(CellType.STRING);
            userVo.setPassword(row.getCell(2).getStringCellValue());
            row.getCell(3).setCellType(CellType.STRING);
            userVo.setDepartment(row.getCell(3).getStringCellValue());
            userVo.setGrade(String.valueOf((long) row.getCell(4).getNumericCellValue()));
            userService.addUser(userVo);
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg("导入成功");
        return resultObject;
    }
    //删除用户
    @UserLoginToken
    @DeleteMapping("/user/{userId}")
    public Object deleteUser(@PathVariable(value = "userId") String userId, HttpServletRequest request){
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }else {
            if(userService.findUserById(userId)==null){
                resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该基地成员信息不存在");
                return resultObject;
            }else {
                userService.deleteUser(userId);
                resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("删除成功");
                return resultObject;
            }
        }
    }
    //更新基地成员信息
    @UserLoginToken
    @PutMapping("/user")
    public Object updateUser(@RequestBody UserVo userVo){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        if(userService.findUserById(userVo.getUserId())==null){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该基地成员信息不存在");
            return resultObject;
        }else {
            data=userService.updateUser(userVo);
            msg="信息更新成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    @PassToken
    @PutMapping("user/forgetPassword")
    public Object forgetPassword(@RequestBody UserDTO userDTO) {
        String params="appkey="+appkey+"&phone="+userDTO.getPhoneNumber()+"&zone="+zone+"&&code="+userDTO.getSmsCode();
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        String result=MobSmsUtils.requestData(verifyUrl,params);
        UserVo userVo=new UserVo();
        userVo.setUserId(userDTO.getUserId());
        userVo.setPassword(userDTO.getPassword());
        switch (JSON.parseObject(result).get("status").toString()) {
            case "200":
                data = userService.updateUser(userVo);
                msg = "验证成功,密码修改成功";
                break;
            case "405":
                msg = "AppKey为空";
                break;
            case "406":
                msg = "AppKey无效";
                break;
            case "456":
                msg = "国家代码或手机号码为空";
                break;
            case "457":
                msg = "手机号码格式错误";
                break;
            case "466":
                msg = "请求校验的验证码为空";
                break;
            case "467":
                msg = "请求校验验证码频繁（5分钟内同一个appkey的同一个号码最多只能校验三次）";
                break;
            case "468":
                msg = "验证码错误";
                break;
            case "474":
                msg = "没有打开服务端验证开关";
                break;
            default:
                msg = "服务器错误";
                break;
        }
        resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg(msg).setData(data);
        return resultObject;
    }
    //根据用户名或手机号查询用户
    @PassToken
    @PutMapping("/user/getMessage")
    public ResultObject findUserByCondition(@RequestBody UserVo userVo){
        String msg;
        Object data;
        ResultObject resultObject=new ResultObject();
        data=userService.findUserByMemberNameOrPhoneNumber(userVo);
        if(data==null){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该基地成员信息不存在");
            return resultObject;
        }else {
            msg="查询信息成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //获取列表用户
    @UserLoginToken
    @GetMapping("/user")
    public ResultObject listUser(@RequestParam(defaultValue = "1") int pageNum,
                                 @RequestParam(defaultValue = "5") int pageSize,
                                 @RequestParam(defaultValue = "false") boolean all,
                                 @RequestParam(defaultValue = "") String condition){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        //在没用查询条件的状态下
        if ("".equals(condition)) {
            if (!all) {
                data = userService.listUserByPage(pageNum, pageSize);
                msg = "获取第" + pageNum + "页基地成员信息成功";
            }
            if (all) {
                data = userService.listUser();
                msg = "获取基地成员信息成功";
            }
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
        //使用了查询条件的状态下
        if (!all) {
            data = userService.listUserByCondition(condition, pageNum, pageSize);
            msg = "根据搜索条件获取第" + pageNum + "页基地成员信息成功";
        }
        if (all) {
            data = userService.listUserByCondition(condition);
            msg = "根据搜索条件获取基地成员信息成功";
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
        return resultObject;
    }
    //超级管理员权限分配
    @UserLoginToken
    @PutMapping("/user/updatePower")
    public Object updatePower(@RequestBody UserVo userVo,HttpServletRequest request){
        Object data;
        ResultObject resultObject=new ResultObject();
        UserVo user=(UserVo) request.getAttribute("currentUser");
        if(user.getUserLevel()!=3){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }else {
            if(userService.findUserById(userVo.getUserId())==null){
                resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("该基地成员信息不存在");
                return resultObject;
            }else {
                data=userService.updateUser(userVo);
                resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("更新成员权限成功").setData(data);
                return resultObject;
            }
        }
    }
}
