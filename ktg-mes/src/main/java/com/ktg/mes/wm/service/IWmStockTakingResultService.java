package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmStockTakingResult;

/**
 * 库存盘点结果Service接口
 */
public interface IWmStockTakingResultService 
{
    /**
     * 查询库存盘点结果
     * @param resultId 库存盘点结果主键
     * @return 库存盘点结果
     */
    WmStockTakingResult selectWmStockTakingResultByResultId(Long resultId);

    /**
     * 查询库存盘点结果列表
     * @param wmStockTakingResult 库存盘点结果
     * @return 库存盘点结果集合
     */
    List<WmStockTakingResult> selectWmStockTakingResultList(WmStockTakingResult wmStockTakingResult);

    /**
     * 新增库存盘点结果
     * @param wmStockTakingResult 库存盘点结果
     */
    int insertWmStockTakingResult(WmStockTakingResult wmStockTakingResult);

    /**
     * 修改库存盘点结果
     * @param wmStockTakingResult 库存盘点结果
     */
    int updateWmStockTakingResult(WmStockTakingResult wmStockTakingResult);

    /**
     * 批量删除库存盘点结果
     * @param resultIds 需要删除的库存盘点结果主键集合
     */
    int deleteWmStockTakingResultByResultIds(Long[] resultIds);

    int deleteWmStockTakingResultByTakingId(Long takingId);
}
