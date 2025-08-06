package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.WmMaterialStock;
import java.util.List;

/**
 * 库存记录Service接口
 */
public interface IWmMaterialStockService 
{
    /**
     * 查询库存记录
     * @param materialStockId 库存记录主键
     * @return 库存记录
     */
    WmMaterialStock selectWmMaterialStockByMaterialStockId(Long materialStockId);

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
     * @param materialStockIds 需要删除的库存记录主键集合
     */
    int deleteWmMaterialStockByMaterialStockIds(Long[] materialStockIds);

    /**
     * 根据库位id查询相关库存现有量数据
     * @param areaId
     */
    List<WmMaterialStock> getByAreaId(Long areaId);

    /**
     * 根据库区id查询相关库存现有量
     * @param locationId
     */
    List<WmMaterialStock> getLocationId(Long locationId);

    /**
     * 根据仓库id查询相关库存现有量
     * @param warehouseId
     */
    List<WmMaterialStock> getByWarehouseId(Long warehouseId);
}
