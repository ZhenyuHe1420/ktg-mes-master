package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmOutsourceIssueDetail;

/**
 * 外协领料单明细Mapper接口
 */
public interface WmOutsourceIssueDetailMapper 
{
    /**
     * 查询外协领料单明细
     * @param detailId 外协领料单明细主键
     * @return 外协领料单明细
     */
    WmOutsourceIssueDetail selectWmOutsourceIssueDetailByDetailId(Long detailId);

    /**
     * 查询外协领料单明细列表
     * @param wmOutsourceIssueDetail 外协领料单明细
     * @return 外协领料单明细集合
     */
    List<WmOutsourceIssueDetail> selectWmOutsourceIssueDetailList(WmOutsourceIssueDetail wmOutsourceIssueDetail);

    /**
     * 检查某一行的明细数量是不是超出行上的数量
     * G:超出
     * E:等于
     * L:小于
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增外协领料单明细
     * @param wmOutsourceIssueDetail 外协领料单明细
     */
    int insertWmOutsourceIssueDetail(WmOutsourceIssueDetail wmOutsourceIssueDetail);

    /**
     * 修改外协领料单明细
     * @param wmOutsourceIssueDetail 外协领料单明细
     */
    int updateWmOutsourceIssueDetail(WmOutsourceIssueDetail wmOutsourceIssueDetail);

    /**
     * 批量删除外协领料单明细
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmOutsourceIssueDetailByDetailIds(Long[] detailIds);
}
