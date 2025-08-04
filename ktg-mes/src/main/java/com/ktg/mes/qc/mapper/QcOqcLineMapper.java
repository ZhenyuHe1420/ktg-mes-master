package com.ktg.mes.qc.mapper;

import java.util.List;
import com.ktg.mes.qc.domain.QcOqcLine;

/**
 * 出货检验单行Mapper接口
 */
public interface QcOqcLineMapper 
{
    /**
     * 查询出货检验单行
     * @param lineId 出货检验单行主键
     * @return 出货检验单行
     */
    QcOqcLine selectQcOqcLineByLineId(Long lineId);

    /**
     * 查询出货检验单行列表
     * @param qcOqcLine 出货检验单行
     * @return 出货检验单行集合
     */
    List<QcOqcLine> selectQcOqcLineList(QcOqcLine qcOqcLine);

    /**
     * 新增出货检验单行
     * @param qcOqcLine 出货检验单行
     */
    int insertQcOqcLine(QcOqcLine qcOqcLine);

    /**
     * 修改出货检验单行
     * @param qcOqcLine 出货检验单行
     */
    int updateQcOqcLine(QcOqcLine qcOqcLine);

    /**
     * 根据缺陷记录更新行上的缺陷数量
     */
    int updateCrMajMinQuantity(QcOqcLine qcOqcLine);

    /**
     * 批量删除出货检验单行
     * 
     * @param lineIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteQcOqcLineByLineIds(Long[] lineIds);

    /**
     * 根据出货检验单头删除相应的行信息
     * @param oqcId
     */
    int deleteByOqcId(Long oqcId);
}
