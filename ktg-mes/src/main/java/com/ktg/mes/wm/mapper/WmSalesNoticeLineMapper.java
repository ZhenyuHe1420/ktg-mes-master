package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmSalesNoticeLine;

/**
 * 发货通知单行Mapper接口
 */
public interface WmSalesNoticeLineMapper 
{
    /**
     * 查询发货通知单行
     * @param lineId 发货通知单行主键
     * @return 发货通知单行
     */
    WmSalesNoticeLine selectWmSalesNoticeLineByLineId(Long lineId);

    /**
     * 查询发货通知单行列表
     * @param wmSalesNoticeLine 发货通知单行
     * @return 发货通知单行集合
     */
    List<WmSalesNoticeLine> selectWmSalesNoticeLineList(WmSalesNoticeLine wmSalesNoticeLine);

    /**
     * 新增发货通知单行
     * @param wmSalesNoticeLine 发货通知单行
     */
    int insertWmSalesNoticeLine(WmSalesNoticeLine wmSalesNoticeLine);

    /**
     * 修改发货通知单行
     * @param wmSalesNoticeLine 发货通知单行
     */
    int updateWmSalesNoticeLine(WmSalesNoticeLine wmSalesNoticeLine);

    /**
     * 批量删除发货通知单行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmSalesNoticeLineByLineIds(Long[] lineIds);
}
