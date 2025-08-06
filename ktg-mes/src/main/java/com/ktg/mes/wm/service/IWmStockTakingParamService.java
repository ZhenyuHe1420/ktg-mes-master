package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmStockTakingParam;

/**
 * 库存盘点方案参数Service接口
 */
public interface IWmStockTakingParamService 
{
    /**
     * 查询库存盘点方案参数
     * @param paramId 库存盘点方案参数主键
     * @return 库存盘点方案参数
     */
    WmStockTakingParam selectWmStockTakingParamByParamId(Long paramId);

    /**
     * 查询库存盘点方案参数列表
     * @param wmStockTakingParam 库存盘点方案参数
     * @return 库存盘点方案参数集合
     */
    List<WmStockTakingParam> selectWmStockTakingParamList(WmStockTakingParam wmStockTakingParam);

    /**
     * 新增库存盘点方案参数
     * @param wmStockTakingParam 库存盘点方案参数
     */
    int insertWmStockTakingParam(WmStockTakingParam wmStockTakingParam);

    /**
     * 修改库存盘点方案参数
     * @param wmStockTakingParam 库存盘点方案参数
     */
    int updateWmStockTakingParam(WmStockTakingParam wmStockTakingParam);

    /**
     * 批量删除库存盘点方案参数
     * @param paramIds 需要删除的库存盘点方案参数主键集合
     */
    int deleteWmStockTakingParamByParamIds(Long[] paramIds);
}
