package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtIssueLine;

/**
 * 生产退料单行Service接口
 */
public interface IWmRtIssueLineService 
{
    /**
     * 查询生产退料单行
     * @param lineId 生产退料单行主键
     * @return 生产退料单行
     */
    WmRtIssueLine selectWmRtIssueLineByLineId(Long lineId);

    /**
     * 查询生产退料单行列表
     * @param wmRtIssueLine 生产退料单行
     * @return 生产退料单行集合
     */
    List<WmRtIssueLine> selectWmRtIssueLineList(WmRtIssueLine wmRtIssueLine);

    /**
     * 查询生产退料单行列表（含明细）
     * @param wmRtIssueLine 生产退料单行
     * @return 生产退料单行集合
     */
    List<WmRtIssueLine> selectWmRtIssueLineWithDetailList(WmRtIssueLine wmRtIssueLine);

    /**
     * 新增生产退料单行
     * @param wmRtIssueLine 生产退料单行
     */
    int insertWmRtIssueLine(WmRtIssueLine wmRtIssueLine);

    /**
     * 修改生产退料单行
     * @param wmRtIssueLine 生产退料单行
     */
    int updateWmRtIssueLine(WmRtIssueLine wmRtIssueLine);

    /**
     * 批量删除生产退料单行
     * @param lineIds 需要删除的生产退料单行主键集合
     */
    int deleteWmRtIssueLineByLineIds(Long[] lineIds);

    /**
     * 根据退料单ID删除所有行
     * @param rtId
     */
    int deleteByRtId(Long rtId);
}
