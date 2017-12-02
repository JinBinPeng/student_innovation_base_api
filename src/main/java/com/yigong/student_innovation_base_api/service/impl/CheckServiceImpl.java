package com.yigong.student_innovation_base_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.CheckVo;
import com.yigong.student_innovation_base_api.mapper.CheckMapper;
import com.yigong.student_innovation_base_api.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 签到service实现类
 * @author jinbin
 * @date 2017-11-03 23:08
 */
@SuppressWarnings("ALL")
@Service("CheckService")
public class CheckServiceImpl implements CheckService {
    @Autowired
    CheckMapper checkMapper;
    @Override
    public CheckVo addCheck(CheckVo checkVo) {
        checkMapper.saveCheck(checkVo);
        return checkMapper.findCheckById(checkVo.getId());
    }

    @Override
    public CheckVo findCheckById(String id) {
        return checkMapper.findCheckById(id);
    }

    @Override
    public List<CheckVo> findCheckByCondition(CheckVo checkVo) {
        return checkMapper.findByCondition(checkVo);
    }

    @Override
    public List<CheckVo> listCheck() {
        return checkMapper.listCheck();
    }

    @Override
    public PageInfo listCheckByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CheckVo> checkVoList=checkMapper.listCheck();
        PageInfo pageInfo=new PageInfo(checkVoList);
        return pageInfo;
    }

    @Override
    public List<CheckVo> listCheckByCondition(String condition) {
        return checkMapper.listCheckByCondition(condition);
    }

    @Override
    public PageInfo listCheckByCondition(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CheckVo> checkVoList=checkMapper.listCheckByCondition(condition);
        PageInfo pageInfo=new PageInfo(checkVoList);
        return pageInfo;
    }


}
