package com.ktg.mes.qc.mapper;

import java.util.List;
import com.ktg.mes.qc.domain.QcIqcLine;

/**
 * 来料检验单行Mapper接口
 */
public interface QcIqcLineMapper 
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

    int updateCrMajMinQuantity(QcIqcLine qcIqcLine);

    int deleteByIqcId(Long iqcId);

    /**
     * 批量删除来料检验单行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteQcIqcLineByLineIds(Long[] lineIds);
}
