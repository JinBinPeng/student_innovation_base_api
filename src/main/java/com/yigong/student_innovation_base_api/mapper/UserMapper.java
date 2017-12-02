package com.yigong.student_innovation_base_api.mapper;

import com.yigong.student_innovation_base_api.entity.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户成员的mapper
 * @author jinbin
 * @date 2017-08-04 22:59
 */
@Component
public interface UserMapper {
    void saveUser(UserVo userVo);
    void updateUser(UserVo userVo);
    void deleteUser(@Param("userId") String userId);
    UserVo findUserById(@Param("userId") String userId);
    UserVo findUserByPhoneNumber(@Param("phoneNumber") String phoneNumber);
    UserVo findUserByMemberName(@Param("memberName") String memberName);
    List<UserVo> findBatchByUserIds(@Param("userIds") List<String> userIds);
    UserVo findUserByCondition(UserVo userVo);
    List<UserVo> listUser();
    List<UserVo> listUserByCondition(@Param("condition") String condition);
}
