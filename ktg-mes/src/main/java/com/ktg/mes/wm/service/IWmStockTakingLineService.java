package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmStockTakingLine;

/**
 * 库存盘点明细Service接口
 */
public interface IWmStockTakingLineService 
{
    /**
     * 查询库存盘点明细
     * @param lineId 库存盘点明细主键
     * @return 库存盘点明细
     */
    WmStockTakingLine selectWmStockTakingLineByLineId(Long lineId);

    /**
     * 查询库存盘点明细列表
     * @param wmStockTakingLine 库存盘点明细
     * @return 库存盘点明细集合
     */
    List<WmStockTakingLine> selectWmStockTakingLineList(WmStockTakingLine wmStockTakingLine);

    /**
     * 新增库存盘点明细
     * @param wmStockTakingLine 库存盘点明细
     */
    int insertWmStockTakingLine(WmStockTakingLine wmStockTakingLine);

    /**
     * 批量冻结/解冻盘点明细中的库存物资
     */
    int updateFrozenStatus(Long takingId, String frozenFlag);

    /**
     * 批量删除库存盘点明细
     * @param lineIds 需要删除的库存盘点明细主键集合
     */
    int deleteWmStockTakingLineByLineIds(Long[] lineIds);

    int deleteByTakingId(Long takingId);
}
