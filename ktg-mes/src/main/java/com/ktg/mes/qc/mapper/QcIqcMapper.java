package com.ktg.mes.qc.mapper;

import java.util.List;
import com.ktg.mes.qc.domain.QcIqc;

/**
 * 来料检验单Mapper接口
 */
public interface QcIqcMapper 
{
    /**
     * 查询来料检验单
     * @param iqcId 来料检验单主键
     * @return 来料检验单
     */
    QcIqc selectQcIqcByIqcId(Long iqcId);

    /**
     * 查询来料检验单列表
     * @param qcIqc 来料检验单
     * @return 来料检验单集合
     */
    List<QcIqc> selectQcIqcList(QcIqc qcIqc);

    QcIqc checkIqcCodeUnique(QcIqc qcIqc);

    /**
     * 新增来料检验单
     * @param qcIqc 来料检验单
     */
    int insertQcIqc(QcIqc qcIqc);

    /**
     * 修改来料检验单
     * @param qcIqc 来料检验单
     */
    int updateQcIqc(QcIqc qcIqc);

    /**
     * 根据缺陷记录更新头上的缺陷数量和比率
     * @param iqcId
     */
    int updateCrMajMinQuaAndRate(Long iqcId);

    /**
     * 批量删除来料检验单
     * @param iqcIds 需要删除的数据主键集合
     */
    int deleteQcIqcByIqcIds(Long[] iqcIds);
}
