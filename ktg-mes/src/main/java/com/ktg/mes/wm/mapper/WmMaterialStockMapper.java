package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.WmMaterialStock;
import java.util.List;

/**
 * 库存记录Mapper接口
 */
public interface WmMaterialStockMapper 
{
    /**
     * 查询库存记录
     * @param materialStockId 库存记录主键
     * @return 库存记录
     */
    WmMaterialStock selectWmMaterialStockByMaterialStockId(Long materialStockId);

    WmMaterialStock loadMaterialStock(WmMaterialStock stock);

    /**
     * 查询库存记录列表
     * @param wmMaterialStock 库存记录
     * @return 库存记录集合
     */
    List<WmMaterialStock> selectWmMaterialStockList(WmMaterialStock wmMaterialStock);

    /**
     * 新增库存记录
     * @param wmMaterialStock 库存记录
     */
    int insertWmMaterialStock(WmMaterialStock wmMaterialStock);

    /**
     * 修改库存记录
     * @param wmMaterialStock 库存记录
     */
    int updateWmMaterialStock(WmMaterialStock wmMaterialStock);

    /**
     * 批量删除库存记录
     * @param materialStockIds 需要删除的数据主键集合
     */
    int deleteWmMaterialStockByMaterialStockIds(Long[] materialStockIds);
}
