package com.yigong.student_innovation_base_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.UserVo;
import com.yigong.student_innovation_base_api.mapper.UserMapper;
import com.yigong.student_innovation_base_api.service.UserService;
import com.yigong.student_innovation_base_api.utils.PasswordUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service实现类
 * @author jinbin
 * @date 2017-08-05 00:48
 */
@SuppressWarnings("ALL")
@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public UserVo addUser(UserVo userVo) {
        if(userMapper.findUserByMemberName(userVo.getMemberName())==null
                &&userMapper.findUserByPhoneNumber(userVo.getPhoneNumber())==null){
            String passwordHash= PasswordUtils.passwordToHash(userVo.getPassword());
            userVo.setPassword(passwordHash);
            userMapper.saveUser(userVo);
            return userMapper.findUserById(userVo.getUserId());
        }
        return null;
    }

    @Override
    public UserVo updateUser(UserVo userVo) {
        if(!StringUtils.isEmpty(userVo.getMemberName())
                ||!StringUtils.isEmpty(userVo.getPassword())
                ||!StringUtils.isEmpty(userVo.getDepartment())
                ||!StringUtils.isEmpty(userVo.getPhoneNumber())
                ||!StringUtils.isEmpty(userVo.getImageUrl())
                ||!StringUtils.isEmpty(userVo.getGrade())){
            if(userVo.getPassword()!=null){
                userVo.setPassword(PasswordUtils.passwordToHash(userVo.getPassword()));
            }
            userMapper.updateUser(userVo);
            return userMapper.findUserById(userVo.getUserId());
        }
        return null;
    }

    @Override
    public boolean deleteUser(String userId) {
         userMapper.deleteUser(userId);
         UserVo userVo=userMapper.findUserById(userId);
         if(userVo==null){
             return true;
         }
        return false;
    }

    @Override
    public UserVo findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public UserVo findUserByMemberNameOrPhoneNumber(UserVo userVo) {
        if(!StringUtils.isEmpty(userVo.getMemberName())||!StringUtils.isEmpty(userVo.getPhoneNumber())){
            return userMapper.findUserByCondition(userVo);
        }
        return null;
    }

    @Override
    public List<UserVo> listUser() {
        return  userMapper.listUser();
    }

    @Override
    public PageInfo listUserByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserVo> userVoList=userMapper.listUser();
        PageInfo pageInfo=new PageInfo(userVoList);
        return pageInfo;
    }

    @Override
    public List<UserVo> listUserByCondition(String condition) {
        return userMapper.listUserByCondition(condition);
    }

    @Override
    public PageInfo listUserByCondition(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserVo> userVoList=userMapper.listUserByCondition(condition);
        PageInfo pageInfo=new PageInfo(userVoList);
        return pageInfo;
    }
}
