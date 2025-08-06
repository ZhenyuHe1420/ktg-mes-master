package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmIssueDetail;

/**
 * 生产领料单明细Mapper接口
 */
public interface WmIssueDetailMapper 
{
    /**
     * 查询生产领料单明细
     * @param detailId 生产领料单明细主键
     * @return 生产领料单明细
     */
    WmIssueDetail selectWmIssueDetailByDetailId(Long detailId);

    /**
     * 查询生产领料单明细列表
     * @param wmIssueDetail 生产领料单明细
     * @return 生产领料单明细集合
     */
    List<WmIssueDetail> selectWmIssueDetailList(WmIssueDetail wmIssueDetail);

    /**
     * 检查某一行的明细数量是不是超出行上的数量
     * G:超出
     * E:等于
     * L:小于
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增生产领料单明细
     * @param wmIssueDetail 生产领料单明细
     */
    int insertWmIssueDetail(WmIssueDetail wmIssueDetail);

    /**
     * 修改生产领料单明细
     * @param wmIssueDetail 生产领料单明细
     */
    int updateWmIssueDetail(WmIssueDetail wmIssueDetail);

    /**
     * 批量删除生产领料单明细
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmIssueDetailByDetailIds(Long[] detailIds);
}
