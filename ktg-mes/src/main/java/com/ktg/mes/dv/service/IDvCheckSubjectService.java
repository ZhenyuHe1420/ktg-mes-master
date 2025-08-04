package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.mes.dv.domain.DvCheckSubject;

/**
 * 点检项目Service接口
 */
public interface IDvCheckSubjectService 
{
    /**
     * 查询点检项目
     * @param recordId 点检项目主键
     * @return 点检项目
     */
    DvCheckSubject selectDvCheckSubjectByRecordId(Long recordId);

    /**
     * 查询点检项目列表
     * @param dvCheckSubject 点检项目
     * @return 点检项目集合
     */
    List<DvCheckSubject> selectDvCheckSubjectList(DvCheckSubject dvCheckSubject);


    /**
     * 检查当前计划下，点检项目是否唯一
     * @param dvCheckSubject
     */
    String checkSubjectUnique(DvCheckSubject dvCheckSubject);

    /**
     * 新增点检项目
     * @param dvCheckSubject 点检项目
     */
    int insertDvCheckSubject(DvCheckSubject dvCheckSubject);

    /**
     * 修改点检项目
     * @param dvCheckSubject 点检项目
     */
    int updateDvCheckSubject(DvCheckSubject dvCheckSubject);

    /**
     * 批量删除点检项目
     * @param recordIds 需要删除的点检项目主键集合
     */
    int deleteDvCheckSubjectByRecordIds(Long[] recordIds);

    /**
     * 根据计划ID删除对应的计划项目
     * @param planId
     */
    int deleteByPlanId(Long planId);
}
