package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmOutsourceIssueLine;

/**
 * 外协领料单行Mapper接口
 */
public interface WmOutsourceIssueLineMapper 
{
    /**
     * 查询外协领料单行
     * @param lineId 外协领料单行主键
     * @return 外协领料单行
     */
    WmOutsourceIssueLine selectWmOutsourceIssueLineByLineId(Long lineId);

    /**
     * 查询外协领料单行列表
     * @param wmOutsourceIssueLine 外协领料单行
     * @return 外协领料单行集合
     */
    List<WmOutsourceIssueLine> selectWmOutsourceIssueLineList(WmOutsourceIssueLine wmOutsourceIssueLine);

    List<WmOutsourceIssueLine> selectWmOutsourceIssueLineWithDetailList(WmOutsourceIssueLine wmIssueLine);

    /**
     * 新增外协领料单行
     * @param wmOutsourceIssueLine 外协领料单行
     */
    int insertWmOutsourceIssueLine(WmOutsourceIssueLine wmOutsourceIssueLine);

    /**
     * 修改外协领料单行
     * @param wmOutsourceIssueLine 外协领料单行
     */
    int updateWmOutsourceIssueLine(WmOutsourceIssueLine wmOutsourceIssueLine);

    /**
     * 批量删除外协领料单行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmOutsourceIssueLineByLineIds(Long[] lineIds);

    /**
     * 根据发料单ID删除所有行
     * @param issueId
     */
    int deleteWmOutsourceIssueLineByIssueId(Long issueId);
}
