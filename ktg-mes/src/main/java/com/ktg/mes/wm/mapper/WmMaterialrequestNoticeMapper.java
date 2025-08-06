package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmMaterialrequestNotice;

/**
 * 备料通知单Mapper接口
 */
public interface WmMaterialrequestNoticeMapper 
{
    /**
     * 查询备料通知单
     * @param noticeId 备料通知单主键
     * @return 备料通知单
     */
    WmMaterialrequestNotice selectWmMaterialrequestNoticeByNoticeId(Long noticeId);

    /**
     * 查询备料通知单列表
     * @param wmMaterialrequestNotice 备料通知单
     * @return 备料通知单集合
     */
    List<WmMaterialrequestNotice> selectWmMaterialrequestNoticeList(WmMaterialrequestNotice wmMaterialrequestNotice);

    /**
     * 新增备料通知单
     * @param wmMaterialrequestNotice 备料通知单
     */
    int insertWmMaterialrequestNotice(WmMaterialrequestNotice wmMaterialrequestNotice);

    /**
     * 修改备料通知单
     * @param wmMaterialrequestNotice 备料通知单
     */
    int updateWmMaterialrequestNotice(WmMaterialrequestNotice wmMaterialrequestNotice);

    /**
     * 批量删除备料通知单
     * @param noticeIds 需要删除的数据主键集合
     */
    int deleteWmMaterialrequestNoticeByNoticeIds(Long[] noticeIds);
}
