package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmSalesNotice;

/**
 * 发货通知单Mapper接口
 */
public interface WmSalesNoticeMapper 
{
    /**
     * 查询发货通知单
     * @param noticeId 发货通知单主键
     * @return 发货通知单
     */
    WmSalesNotice selectWmSalesNoticeByNoticeId(Long noticeId);

    /**
     * 查询发货通知单列表
     * @param wmSalesNotice 发货通知单
     * @return 发货通知单集合
     */
    List<WmSalesNotice> selectWmSalesNoticeList(WmSalesNotice wmSalesNotice);

    /**
     * 发货通知单编码唯一性校验
     */
    WmSalesNotice checkCodeUnique(WmSalesNotice wmSalesNotice);

    /**
     * 新增发货通知单
     * @param wmSalesNotice 发货通知单
     */
    int insertWmSalesNotice(WmSalesNotice wmSalesNotice);

    /**
     * 修改发货通知单
     * @param wmSalesNotice 发货通知单
     */
    int updateWmSalesNotice(WmSalesNotice wmSalesNotice);

    /**
     * 批量删除发货通知单
     * @param noticeIds 需要删除的数据主键集合
     */
    int deleteWmSalesNoticeByNoticeIds(Long[] noticeIds);
}
