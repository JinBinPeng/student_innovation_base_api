package com.yigong.student_innovation_base_api.service;

import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.UserVo;

import java.util.List;

/**
 * 用户service接口
 * @author jinbin
 * @date 2017-08-04 23:48
 */
@SuppressWarnings("ALL")
public interface UserService {
    /**
    * @description 添加基地成员
    **/
    UserVo addUser(UserVo userVo);
    /**
    * @description 更新成员的基本信息
    **/
    UserVo updateUser(UserVo userVo);
    /**
    * @description 删除成员
    **/
    boolean deleteUser(String userId);
    /**
    * @description 根据成员ID查询成员信息
    **/
    UserVo findUserById(String userId);
    /**
    * @description 根据成员名或者手机号查询成员信息
    **/
    UserVo findUserByMemberNameOrPhoneNumber(UserVo userVo);
    /**
    * @description 查询所有成员信息
    **/
    List<UserVo> listUser();
    /**
    * @description 分页查询所有成员信息
    **/
    PageInfo listUserByPage(int pageNum, int pageSize);
    /**
     * @description 根据搜索条件查询所有成员信息
     **/
    List<UserVo> listUserByCondition(String condition);
    /**
     * @description 根据搜索条件分页查询所有成员信息
     **/
    PageInfo listUserByCondition(String condition,int pageNum, int pageSize);
}
