package com.ktg.mes.qc.service;

import java.util.List;
import com.ktg.mes.qc.domain.QcIndex;

/**
 * 检测项Service接口
 */
public interface IQcIndexService 
{
    /**
     * 查询检测项
     * @param indexId 检测项主键
     * @return 检测项
     */
    QcIndex selectQcIndexByIndexId(Long indexId);

    /**
     * 查询检测项列表
     * @param qcIndex 检测项
     * @return 检测项集合
     */
    List<QcIndex> selectQcIndexList(QcIndex qcIndex);

    /**
     * 检测项编号是否唯一
     */
    String checkIndexCodeUnique(QcIndex qcIndex);

    /**
     * 检测项名称是否唯一
     */
    String checkIndexNameUnique(QcIndex qcIndex);

    /**
     * 新增检测项
     * @param qcIndex 检测项
     */
    int insertQcIndex(QcIndex qcIndex);

    /**
     * 修改检测项
     * @param qcIndex 检测项
     */
    int updateQcIndex(QcIndex qcIndex);

    /**
     * 批量删除检测项
     * @param indexIds 需要删除的检测项主键集合
     */
    int deleteQcIndexByIndexIds(Long[] indexIds);
}
