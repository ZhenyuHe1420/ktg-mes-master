package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmMiscIssueLine;

/**
 * 杂项出库单行Mapper接口
 */
public interface WmMiscIssueLineMapper 
{
    /**
     * 查询杂项出库单行
     * @param lineId 杂项出库单行主键
     * @return 杂项出库单行
     */
    WmMiscIssueLine selectWmMiscIssueLineByLineId(Long lineId);

    /**
     * 查询杂项出库单行列表
     * @param wmMiscIssueLine 杂项出库单行
     * @return 杂项出库单行集合
     */
    List<WmMiscIssueLine> selectWmMiscIssueLineList(WmMiscIssueLine wmMiscIssueLine);

    /**
     * 新增杂项出库单行
     * @param wmMiscIssueLine 杂项出库单行
     */
    int insertWmMiscIssueLine(WmMiscIssueLine wmMiscIssueLine);

    /**
     * 修改杂项出库单行
     * @param wmMiscIssueLine 杂项出库单行
     */
    int updateWmMiscIssueLine(WmMiscIssueLine wmMiscIssueLine);

    /**
     * 批量删除杂项出库单行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmMiscIssueLineByLineIds(Long[] lineIds);
}
