package com.ktg.mes.qc.service;

import java.util.List;
import com.ktg.mes.qc.domain.QcIqcLine;

/**
 * 来料检验单行Service接口
 */
public interface IQcIqcLineService 
{
    /**
     * 查询来料检验单行
     * @param lineId 来料检验单行主键
     * @return 来料检验单行
     */
    QcIqcLine selectQcIqcLineByLineId(Long lineId);

    /**
     * 查询来料检验单行列表
     * @param qcIqcLine 来料检验单行
     * @return 来料检验单行集合
     */
    List<QcIqcLine> selectQcIqcLineList(QcIqcLine qcIqcLine);

    /**
     * 新增来料检验单行
     * @param qcIqcLine 来料检验单行
     */
    int insertQcIqcLine(QcIqcLine qcIqcLine);

    /**
     * 修改来料检验单行
     * @param qcIqcLine 来料检验单行
     */
    int updateQcIqcLine(QcIqcLine qcIqcLine);

    /**
     * 计算并更新当前行的Cr,Maj,Min的总数量
     * @param iqcId
     * @param lineId
     */
    int updateCrMajMinQuantity(Long iqcId, Long lineId);

    /**
     * 批量删除来料检验单行
     * @param lineIds 需要删除的来料检验单行主键集合
     */
    int deleteQcIqcLineByLineIds(Long[] lineIds);

    /**
     * 删除所有行信息
     * @param iqcId
     */
    int deleteByIqcId(Long iqcId);
}
