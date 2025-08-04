package com.ktg.mes.qc.service;

import java.util.List;
import com.ktg.mes.qc.domain.QcRqc;

/**
 * 退料检验单Service接口
 */
public interface IQcRqcService 
{
    /**
     * 查询退料检验单
     * @param rqcId 退料检验单主键
     * @return 退料检验单
     */
    QcRqc selectQcRqcByRqcId(Long rqcId);

    /**
     * 查询退料检验单列表
     * @param qcRqc 退料检验单
     * @return 退料检验单集合
     */
    List<QcRqc> selectQcRqcList(QcRqc qcRqc);

    /**
     * 检查编码唯一性
     */
    String checkCodeUnique(QcRqc qcRqc);

    /**
     * 新增退料检验单
     * @param qcRqc 退料检验单
     */
    int insertQcRqc(QcRqc qcRqc);

    /**
     * 修改退料检验单
     * @param qcRqc 退料检验单
     */
    int updateQcRqc(QcRqc qcRqc);

    /**
     * 批量删除退料检验单
     * @param rqcIds 需要删除的退料检验单主键集合
     */
    int deleteQcRqcByRqcIds(Long[] rqcIds);
}
