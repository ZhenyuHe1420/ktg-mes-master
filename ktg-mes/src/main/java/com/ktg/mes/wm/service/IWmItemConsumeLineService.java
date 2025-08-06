package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmItemConsumeLine;

/**
 * 物料消耗记录行Service接口
 */
public interface IWmItemConsumeLineService 
{
    /**
     * 查询物料消耗记录行
     * @param lineId 物料消耗记录行主键
     * @return 物料消耗记录行
     */
    WmItemConsumeLine selectWmItemConsumeLineByLineId(Long lineId);

    /**
     * 查询物料消耗记录行列表
     * @param wmItemConsumeLine 物料消耗记录行
     * @return 物料消耗记录行集合
     */
    List<WmItemConsumeLine> selectWmItemConsumeLineList(WmItemConsumeLine wmItemConsumeLine);

    /**
     * 新增物料消耗记录行
     * @param wmItemConsumeLine 物料消耗记录行
     */
    int insertWmItemConsumeLine(WmItemConsumeLine wmItemConsumeLine);

    /**
     * 修改物料消耗记录行
     * @param wmItemConsumeLine 物料消耗记录行
     */
    int updateWmItemConsumeLine(WmItemConsumeLine wmItemConsumeLine);

    /**
     * 批量删除物料消耗记录行
     * @param lineIds 需要删除的物料消耗记录行主键集合
     */
    int deleteWmItemConsumeLineByLineIds(Long[] lineIds);
}
