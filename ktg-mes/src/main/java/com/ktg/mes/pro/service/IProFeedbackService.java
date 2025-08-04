package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProFeedback;

/**
 * 生产报工记录Service接口
 */
public interface IProFeedbackService 
{
    /**
     * 查询生产报工记录
     * @param recordId 生产报工记录主键
     * @return 生产报工记录
     */
    ProFeedback selectProFeedbackByRecordId(Long recordId);

    /**
     * 查询生产报工记录列表
     * @param proFeedback 生产报工记录
     * @return 生产报工记录集合
     */
    List<ProFeedback> selectProFeedbackList(ProFeedback proFeedback);

    /**
     * 新增生产报工记录
     * @param proFeedback 生产报工记录
     */
    int insertProFeedback(ProFeedback proFeedback);

    /**
     * 修改生产报工记录
     * @param proFeedback 生产报工记录
     */
    int updateProFeedback(ProFeedback proFeedback);

    /**
     * 根据当前报工单的最终结果更新生产任务和生产工单的进度
     */
    void updateProTaskAndWorkorderByFeedback(ProFeedback proFeedback);

    /**
     * 批量删除生产报工记录
     * @param recordIds 需要删除的生产报工记录主键集合
     */
    int deleteProFeedbackByRecordIds(Long[] recordIds);

    /**
     * 根据 workorderIds 查询
     */
    List<ProFeedback> selectByWorkorderIds(List<Long> workorderIds);
}
