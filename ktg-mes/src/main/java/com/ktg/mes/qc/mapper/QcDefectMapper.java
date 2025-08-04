package com.ktg.mes.qc.mapper;

import java.util.List;
import com.ktg.mes.qc.domain.QcDefect;

/**
 * 常见缺陷Mapper接口
 */
public interface QcDefectMapper 
{
    /**
     * 查询常见缺陷
     * @param defectId 常见缺陷主键
     * @return 常见缺陷
     */
    QcDefect selectQcDefectByDefectId(Long defectId);

    /**
     * 查询常见缺陷列表
     * @param qcDefect 常见缺陷
     * @return 常见缺陷集合
     */
    List<QcDefect> selectQcDefectList(QcDefect qcDefect);

    /**
     * 新增常见缺陷
     * @param qcDefect 常见缺陷
     */
    int insertQcDefect(QcDefect qcDefect);

    /**
     * 修改常见缺陷
     * @param qcDefect 常见缺陷
     */
    int updateQcDefect(QcDefect qcDefect);

    /**
     * 批量删除常见缺陷
     * @param defectIds 需要删除的数据主键集合
     */
    int deleteQcDefectByDefectIds(Long[] defectIds);
}
