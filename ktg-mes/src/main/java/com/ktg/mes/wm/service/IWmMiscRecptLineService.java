package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmMiscRecptLine;

/**
 * 杂项入库单行Service接口
 */
public interface IWmMiscRecptLineService 
{
    /**
     * 查询杂项入库单行
     * @param lineId 杂项入库单行主键
     * @return 杂项入库单行
     */
    WmMiscRecptLine selectWmMiscRecptLineByLineId(Long lineId);

    /**
     * 查询杂项入库单行列表
     * @param wmMiscRecptLine 杂项入库单行
     * @return 杂项入库单行集合
     */
    List<WmMiscRecptLine> selectWmMiscRecptLineList(WmMiscRecptLine wmMiscRecptLine);

    /**
     * 新增杂项入库单行
     * @param wmMiscRecptLine 杂项入库单行
     */
    int insertWmMiscRecptLine(WmMiscRecptLine wmMiscRecptLine);

    /**
     * 修改杂项入库单行
     * @param wmMiscRecptLine 杂项入库单行
     */
    int updateWmMiscRecptLine(WmMiscRecptLine wmMiscRecptLine);

    /**
     * 批量删除杂项入库单行
     * @param lineIds 需要删除的杂项入库单行主键集合
     */
    int deleteWmMiscRecptLineByLineIds(Long[] lineIds);
}
