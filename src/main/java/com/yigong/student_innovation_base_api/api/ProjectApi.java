package com.yigong.student_innovation_base_api.api;

import com.yigong.student_innovation_base_api.ResultObject;
import com.yigong.student_innovation_base_api.annotation.UserLoginToken;
import com.yigong.student_innovation_base_api.constant.HttpCode;
import com.yigong.student_innovation_base_api.dto.ProjectDTO;
import com.yigong.student_innovation_base_api.entity.*;
import com.yigong.student_innovation_base_api.mapper.ProjectImageMapper;
import com.yigong.student_innovation_base_api.mapper.ProjectTeamMapper;
import com.yigong.student_innovation_base_api.service.ProjectService;
import com.yigong.student_innovation_base_api.service.RecycleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * 项目模块API
 * @author jinbin
 * @date 2017-08-11 22:59
 */
@RestController
@RequestMapping("base/api")
public class ProjectApi {
    @Autowired
    ProjectService projectService;
    @Autowired
    RecycleService recycleService;
    @Autowired
    ProjectImageMapper projectImageMapper;
    @Autowired
    ProjectTeamMapper projectTeamMapper;
    @UserLoginToken
    @PostMapping("/project")
    public Object addProject(@RequestBody ProjectVo projectVo, HttpServletRequest request){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }
        if(StringUtils.isEmpty(projectVo.getProjectName())
                ||StringUtils.isEmpty(projectVo.getDetail())
                ||projectVo.getProjectType()==null
                ||projectVo.getUserIds().size()==0
                ||projectVo.getDeadLine()==null
                ||StringUtils.isEmpty(userVo.getUserId())){
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("有数据为空，不合法");
            return resultObject;
        }else {
            //uuid为项目的ID
            String uuid=UUID.randomUUID().toString();
            //添加项目图片
            ProjectImageVo projectImageVo =new ProjectImageVo();
            projectVo.getImageUrl().stream().forEach(
                    imageUrl->{
                        projectImageVo.setProjectId(uuid);
                        projectImageVo.setImage(imageUrl);
                        projectImageMapper.saveProjectImage(projectImageVo);
                    }
            );
            //添加项目成员
            ProjectTeamVo projectTeamVo=new ProjectTeamVo();
            projectVo.getUserIds().stream().forEach(
                    userId->{
                        projectTeamVo.setProjectId(uuid);
                        projectTeamVo.setMemberId(userId);
                        projectTeamMapper.saveProjectTeam(projectTeamVo);
                    }
            );
            //添加项目
            projectVo.setCreatorId(userVo.getUserId());
            projectVo.setProjectId(uuid);
            projectService.addProject(projectVo);
            data=projectService.findByProjectId(uuid);
            msg="发布项目成功";
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
    }
    //删除单个或多个项目信息
    @UserLoginToken
    @PutMapping("/project/batchDelete")
    public Object batchDeleteProject(@RequestBody ProjectDTO projectDTO, HttpServletRequest request){
        ResultObject resultObject=new ResultObject();
        UserVo userVo=(UserVo) request.getAttribute("currentUser");
        if(userVo.getUserLevel()==1) {
            resultObject.setSuccess(false).setCode(HttpCode.UNAUTHORIZED).setMsg("你无权限进行此操作");
            return resultObject;
        }
        if(projectService.deleteProjectBatch(projectDTO.getProjectIds())){
            RecycleVo recycleVo=new RecycleVo();
            projectDTO.getProjectIds().stream().forEach(
            projectId->{
                recycleVo.setProjectId(projectId);
                recycleVo.setRecyclerType(1);
                recycleVo.setOperatorId(userVo.getUserId());
                recycleService.saveRecycle(recycleVo);
                }
            );
            resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("删除成功，,管理员可以在回收站查看");
            return resultObject;
        }else {
            resultObject.setCode(HttpCode.OK).setSuccess(true).setMsg("所要删除的项目不存在");
            return resultObject;
        }
    }
    //获取项目列表
    @UserLoginToken
    @GetMapping("/project")
    public ResultObject listProject(@RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "5") int pageSize,
                                     @RequestParam(defaultValue = "false") boolean all,
                                     @RequestParam(defaultValue = "") String condition){
        String msg= "";
        Object data= null;
        ResultObject resultObject=new ResultObject();
        if ("".equals(condition)) {
            if (!all) {
                data = projectService.listProjectByPage(pageNum, pageSize);
                msg = "获取第" + pageNum + "页基地项目信息成功";
            }
            if (all) {
                data = projectService.listProject();
                msg = "获取基地项目信息成功";
            }
            resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
            return resultObject;
        }
        //使用了查询条件的状态下
        if (!all) {
            data = projectService.listProjectByCondition(condition, pageNum, pageSize);
            msg = "根据搜索条件获取第" + pageNum + "页基地项目信息成功";
        }
        if (all) {
            data = projectService.listProjectByCondition(condition);
            msg = "根据搜索条件获取基地项目信息成功";
        }
        resultObject.setCode(HttpCode.OK).setData(data).setSuccess(true).setMsg(msg);
        return resultObject;
    }
}
