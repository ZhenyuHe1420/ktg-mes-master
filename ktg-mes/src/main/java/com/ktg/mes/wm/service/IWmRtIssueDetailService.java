package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtIssueDetail;

/**
 * 生产退料单明细Service接口
 */
public interface IWmRtIssueDetailService 
{
    /**
     * 查询生产退料单明细
     * @param detailId 生产退料单明细主键
     * @return 生产退料单明细
     */
    WmRtIssueDetail selectWmRtIssueDetailByDetailId(Long detailId);

    /**
     * 查询生产退料单明细列表
     * @param wmRtIssueDetail 生产退料单明细
     * @return 生产退料单明细集合
     */
    List<WmRtIssueDetail> selectWmRtIssueDetailList(WmRtIssueDetail wmRtIssueDetail);

    /**
     * 检查退料行上的数量是否与明细行总数量一致
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增生产退料单明细
     * @param wmRtIssueDetail 生产退料单明细
     */
    int insertWmRtIssueDetail(WmRtIssueDetail wmRtIssueDetail);

    /**
     * 修改生产退料单明细
     * @param wmRtIssueDetail 生产退料单明细
     */
    int updateWmRtIssueDetail(WmRtIssueDetail wmRtIssueDetail);

    /**
     * 批量删除生产退料单明细
     * @param detailIds 需要删除的生产退料单明细主键集合
     */
    int deleteWmRtIssueDetailByDetailIds(Long[] detailIds);
}
