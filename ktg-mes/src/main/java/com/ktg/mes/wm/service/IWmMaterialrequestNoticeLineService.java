package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmMaterialrequestNoticeLine;

/**
 * 备料通知单明细Service接口
 */
public interface IWmMaterialrequestNoticeLineService 
{
    /**
     * 查询备料通知单明细
     * @param lineId 备料通知单明细主键
     * @return 备料通知单明细
     */
    WmMaterialrequestNoticeLine selectWmMaterialrequestNoticeLineByLineId(Long lineId);

    /**
     * 查询备料通知单明细列表
     * @param wmMaterialrequestNoticeLine 备料通知单明细
     * @return 备料通知单明细集合
     */
    List<WmMaterialrequestNoticeLine> selectWmMaterialrequestNoticeLineList(WmMaterialrequestNoticeLine wmMaterialrequestNoticeLine);

    /**
     * 新增备料通知单明细
     * @param wmMaterialrequestNoticeLine 备料通知单明细
     */
    int insertWmMaterialrequestNoticeLine(WmMaterialrequestNoticeLine wmMaterialrequestNoticeLine);

    /**
     * 修改备料通知单明细
     * @param wmMaterialrequestNoticeLine 备料通知单明细
     */
    int updateWmMaterialrequestNoticeLine(WmMaterialrequestNoticeLine wmMaterialrequestNoticeLine);

    /**
     * 批量删除备料通知单明细
     * @param lineIds 需要删除的备料通知单明细主键集合
     */
    int deleteWmMaterialrequestNoticeLineByLineIds(Long[] lineIds);
}
