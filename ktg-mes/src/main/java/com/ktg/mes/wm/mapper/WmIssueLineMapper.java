package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmIssueLine;

/**
 * 生产领料单行Mapper接口
 */
public interface WmIssueLineMapper 
{
    /**
     * 查询生产领料单行
     * @param lineId 生产领料单行主键
     * @return 生产领料单行
     */
    WmIssueLine selectWmIssueLineByLineId(Long lineId);

    /**
     * 查询生产领料单行列表
     * @param wmIssueLine 生产领料单行
     * @return 生产领料单行集合
     */
    List<WmIssueLine> selectWmIssueLineList(WmIssueLine wmIssueLine);

    List<WmIssueLine> selectWmIssueLineWithDetailList(WmIssueLine wmIssueLine);

    /**
     * 新增生产领料单行
     * @param wmIssueLine 生产领料单行
     */
    int insertWmIssueLine(WmIssueLine wmIssueLine);

    /**
     * 修改生产领料单行
     * @param wmIssueLine 生产领料单行
     */
    int updateWmIssueLine(WmIssueLine wmIssueLine);

    /**
     * 批量删除生产领料单行
     * 
     * @param lineIds 需要删除的数据主键集合
     * @return 结果
     */
    int deleteWmIssueLineByLineIds(Long[] lineIds);

    int deleteByIssueHeaderId(Long issueId);
}
