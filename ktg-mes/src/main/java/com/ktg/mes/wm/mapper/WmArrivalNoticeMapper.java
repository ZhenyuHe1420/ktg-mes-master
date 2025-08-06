package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmArrivalNotice;

/**
 * 到货通知单Mapper接口
 */
public interface WmArrivalNoticeMapper 
{
    /**
     * 查询到货通知单
     * @param noticeId 到货通知单主键
     * @return 到货通知单
     */
    WmArrivalNotice selectWmArrivalNoticeByNoticeId(Long noticeId);

    /**
     * 查询到货通知单列表
     * @param wmArrivalNotice 到货通知单
     * @return 到货通知单集合
     */
    List<WmArrivalNotice> selectWmArrivalNoticeList(WmArrivalNotice wmArrivalNotice);

    /**
     * 检查通知单编码是否唯一
     */
    WmArrivalNotice checkRnCodeUnique(WmArrivalNotice wmArrivalNotice);

    /**
     * 新增到货通知单
     * @param wmArrivalNotice 到货通知单
     */
    int insertWmArrivalNotice(WmArrivalNotice wmArrivalNotice);

    /**
     * 修改到货通知单
     * @param wmArrivalNotice 到货通知单
     */
    int updateWmArrivalNotice(WmArrivalNotice wmArrivalNotice);

    /**
     * 批量删除到货通知单
     * @param noticeIds 需要删除的数据主键集合
     */
    int deleteWmArrivalNoticeByNoticeIds(Long[] noticeIds);
}
