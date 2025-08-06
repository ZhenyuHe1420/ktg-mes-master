package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProFeedback;
import com.ktg.mes.wm.domain.WmItemConsume;
import com.ktg.mes.wm.domain.tx.ItemConsumeTxBean;

/**
 * 物料消耗记录Service接口
 */
public interface IWmItemConsumeService 
{
    /**
     * 查询物料消耗记录
     * @param recordId 物料消耗记录主键
     * @return 物料消耗记录
     */
    WmItemConsume selectWmItemConsumeByRecordId(Long recordId);

    /**
     * 查询物料消耗记录列表
     * @param wmItemConsume 物料消耗记录
     * @return 物料消耗记录集合
     */
    List<WmItemConsume> selectWmItemConsumeList(WmItemConsume wmItemConsume);

    /**
     * 新增物料消耗记录
     * @param wmItemConsume 物料消耗记录
     */
    int insertWmItemConsume(WmItemConsume wmItemConsume);

    /**
     * 修改物料消耗记录
     * @param wmItemConsume 物料消耗记录
     */
    int updateWmItemConsume(WmItemConsume wmItemConsume);

    /**
     * 批量删除物料消耗记录
     * @param recordIds 需要删除的物料消耗记录主键集合
     */
    int deleteWmItemConsumeByRecordIds(Long[] recordIds);

    /**
     * 根据生产报工单生成物料消耗记录
     * 这里需要处理同一个工单分多次领料的问题（每次领料可能是不同的批次）
     */
    WmItemConsume generateItemConsume(ProFeedback feedback);

    List<ItemConsumeTxBean> getTxBeans(Long recordId);
}
