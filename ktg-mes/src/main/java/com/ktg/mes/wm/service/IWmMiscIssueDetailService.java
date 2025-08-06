package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmMiscIssueDetail;

/**
 * 杂项出库单明细Service接口
 */
public interface IWmMiscIssueDetailService 
{
    /**
     * 查询杂项出库单明细
     * @param detailId 杂项出库单明细主键
     * @return 杂项出库单明细
     */
    WmMiscIssueDetail selectWmMiscIssueDetailByDetailId(Long detailId);

    /**
     * 查询杂项出库单明细列表
     * @param wmMiscIssueDetail 杂项出库单明细
     * @return 杂项出库单明细集合
     */
    List<WmMiscIssueDetail> selectWmMiscIssueDetailList(WmMiscIssueDetail wmMiscIssueDetail);

    /**
     * 新增杂项出库单明细
     * @param wmMiscIssueDetail 杂项出库单明细
     */
    int insertWmMiscIssueDetail(WmMiscIssueDetail wmMiscIssueDetail);

    /**
     * 修改杂项出库单明细
     * @param wmMiscIssueDetail 杂项出库单明细
     */
    int updateWmMiscIssueDetail(WmMiscIssueDetail wmMiscIssueDetail);

    /**
     * 批量删除杂项出库单明细
     * @param detailIds 需要删除的杂项出库单明细主键集合
     */
    int deleteWmMiscIssueDetailByDetailIds(Long[] detailIds);

    /**
     * 根据行ID删除对应的明细记录
     * @param lineId
     */
    int deleteWmMiscIssueDetailByLineId(Long lineId);
}
