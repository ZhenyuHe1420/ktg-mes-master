package com.ktg.mes.qc.service;

import java.util.List;
import com.ktg.mes.qc.domain.QcResult;

/**
 * 检测结果记录Service接口
 */
public interface IQcResultService 
{
    /**
     * 查询检测结果记录
     * @param resultId 检测结果记录主键
     * @return 检测结果记录
     */
    QcResult selectQcResultByResultId(Long resultId);

    /**
     * 查询检测结果记录列表
     * @param qcResult 检测结果记录
     * @return 检测结果记录集合
     */
    List<QcResult> selectQcResultList(QcResult qcResult);

    /**
     * 新增检测结果记录
     * @param qcResult 检测结果记录
     */
    int insertQcResult(QcResult qcResult);

    /**
     * 修改检测结果记录
     * @param qcResult 检测结果记录
     */
    int updateQcResult(QcResult qcResult);

    /**
     * 批量删除检测结果记录
     * @param resultIds 需要删除的检测结果记录主键集合
     */
    int deleteQcResultByResultIds(Long[] resultIds);
}
