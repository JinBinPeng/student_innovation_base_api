package com.yigong.student_innovation_base_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.RecycleVo;
import com.yigong.student_innovation_base_api.mapper.RecycleMapper;
import com.yigong.student_innovation_base_api.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 回收站service实现类
 * @author jinbin
 * @date 2017-08-13 23:59
 */
@SuppressWarnings("ALL")
@Service("RecycleService")
public class RecycleServiceImpl implements RecycleService{
    @Autowired
    RecycleMapper recycleMapper;
    @Override
    public RecycleVo saveRecycle(RecycleVo recycleVo) {
        recycleMapper.saveRecycle(recycleVo);
        return recycleMapper.findRecycleByRecyclerId(recycleVo.getRecyclerId());
    }

    @Override
    public List<RecycleVo> listRecycle() {
        return recycleMapper.listRecycle();
    }

    @Override
    public PageInfo listRecycleByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<RecycleVo> recycleVoList=recycleMapper.listRecycle();
        PageInfo pageInfo=new PageInfo(recycleVoList);
        return pageInfo;
    }

    @Override
    public List<RecycleVo> listRecycleByCondition(String condition) {
        return recycleMapper.listRecycleByCondition(condition);
    }

    @Override
    public PageInfo listRecycleByCondition(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<RecycleVo> recycleVoList=recycleMapper.listRecycleByCondition(condition);
        PageInfo pageInfo=new PageInfo(recycleVoList);
        return pageInfo;
    }
}
