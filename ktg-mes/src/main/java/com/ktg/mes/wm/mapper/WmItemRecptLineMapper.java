package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmItemRecptLine;

/**
 * 物料入库单行Mapper接口
 */
public interface WmItemRecptLineMapper 
{
    /**
     * 查询物料入库单行
     * @param lineId 物料入库单行主键
     * @return 物料入库单行
     */
    WmItemRecptLine selectWmItemRecptLineByLineId(Long lineId);

    /**
     * 查询物料入库单行列表
     * @param wmItemRecptLine 物料入库单行
     * @return 物料入库单行集合
     */
    List<WmItemRecptLine> selectWmItemRecptLineList(WmItemRecptLine wmItemRecptLine);

    /**
     * 查询物料入库单行列表（含明细）
     */
    List<WmItemRecptLine> selectWmItemRecptLineWithDetail(WmItemRecptLine wmItemRecptLine);

    /**
     * 新增物料入库单行
     * @param wmItemRecptLine 物料入库单行
     */
    int insertWmItemRecptLine(WmItemRecptLine wmItemRecptLine);

    /**
     * 修改物料入库单行
     * @param wmItemRecptLine 物料入库单行
     */
    int updateWmItemRecptLine(WmItemRecptLine wmItemRecptLine);

    /**
     * 批量删除物料入库单行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmItemRecptLineByLineIds(Long[] lineIds);

    int deleteByRecptId(Long recptId);
}
