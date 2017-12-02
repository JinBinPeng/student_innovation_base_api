package com.yigong.student_innovation_base_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigong.student_innovation_base_api.entity.DynamicVo;
import com.yigong.student_innovation_base_api.mapper.DynamicMapper;
import com.yigong.student_innovation_base_api.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 动态的service实现类
 * @author jinbin
 * @date 2017-08-09 17:52
 */
@Service("DynamicService")
public class DynamicServiceImpl implements DynamicService{
    @Autowired
    DynamicMapper dynamicMapper;
    @Override
    public DynamicVo addDynamic(DynamicVo dynamicVo) {
         dynamicMapper.saveDynamic(dynamicVo);
        return findByDynamicId(dynamicVo.getDynamicId());
    }

    @Override
    public DynamicVo findByDynamicId(String dynamicId) {
        return dynamicMapper.findByDynamicId(dynamicId);
    }

    @Override
    public boolean deleteDynamicBatch(List<String> dynamicIds) {
        List<DynamicVo> dynamicVoList=dynamicMapper.findBatchByDynamicIds(dynamicIds);
        if(dynamicVoList.size()==0){
            return false;
        }else {
            dynamicMapper.deleteDynamicBatch(dynamicIds);
            return true;
        }
    }

    @Override
    public List<DynamicVo> listDynamic() {
        return dynamicMapper.listDynamic();
    }

    @Override
    public PageInfo listDynamicByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DynamicVo> dynamicVoList=dynamicMapper.listDynamic();
        PageInfo pageInfo=new PageInfo(dynamicVoList);
        return pageInfo;
    }

    @Override
    public List<DynamicVo> listDynamicByCondition(String condition) {
        return dynamicMapper.listDynamicByCondition(condition);
    }

    @Override
    public PageInfo listDynamicByCondition(String condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DynamicVo> dynamicVoList=dynamicMapper.listDynamicByCondition(condition);
        PageInfo pageInfo=new PageInfo(dynamicVoList);
        return pageInfo;
    }
}
