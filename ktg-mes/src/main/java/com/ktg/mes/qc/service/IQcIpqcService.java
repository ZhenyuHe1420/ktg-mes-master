package com.ktg.mes.qc.service;

import java.util.List;
import com.ktg.mes.qc.domain.QcIpqc;

/**
 * 过程检验单Service接口
 */
public interface IQcIpqcService 
{
    /**
     * 查询过程检验单
     * @param ipqcId 过程检验单主键
     * @return 过程检验单
     */
    QcIpqc selectQcIpqcByIpqcId(Long ipqcId);

    /**
     * 查询过程检验单列表
     * @param qcIpqc 过程检验单
     * @return 过程检验单集合
     */
    List<QcIpqc> selectQcIpqcList(QcIpqc qcIpqc);

    /**
     * 检查检测编码是否唯一
     */
    String checkIpqcCodeUnique(QcIpqc qcIpqc);

    /**
     * 根据当前传递的过程检验单，查询更多工艺相关信息
     */
    List<QcIpqc> getProcessInfo(QcIpqc qcIpqc);

    /**
     * 新增过程检验单
     * @param qcIpqc 过程检验单
     */
    int insertQcIpqc(QcIpqc qcIpqc);

    /**
     * 修改过程检验单
     * @param qcIpqc 过程检验单
     */
    int updateQcIpqc(QcIpqc qcIpqc);

    /**
     * 更新头上的cr、maj、min数量
     * @param qcId
     */
    int updateCrMajMinQuaAndRate(Long qcId);

    /**
     * 批量删除过程检验单
     * @param ipqcIds 需要删除的过程检验单主键集合
     */
    int deleteQcIpqcByIpqcIds(Long[] ipqcIds);
}
