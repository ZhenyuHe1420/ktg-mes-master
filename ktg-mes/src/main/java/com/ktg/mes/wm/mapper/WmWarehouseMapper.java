package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmWarehouse;
import org.apache.ibatis.annotations.Param;

/**
 * 仓库设置Mapper接口
 */
public interface WmWarehouseMapper 
{
    /**
     * 查询仓库设置
     * @param warehouseId 仓库设置主键
     * @return 仓库设置
     */
    WmWarehouse selectWmWarehouseByWarehouseId(Long warehouseId);

    /**
     * 根据编码查询仓库
     * @param warehouseCdoe
     */
    WmWarehouse selectWmWarehouseByWarehouseCode(String warehouseCdoe);

    /**
     * 查询仓库设置列表
     * @param wmWarehouse 仓库设置
     * @return 仓库设置集合
     */
    List<WmWarehouse> selectWmWarehouseList(WmWarehouse wmWarehouse);

    List<WmWarehouse> getTreeList();

    WmWarehouse checkWarehouseCodeUnique(WmWarehouse wmWarehouse);

    WmWarehouse checkWarehouseNameUnique(WmWarehouse wmWarehouse);

    /**
     * 新增仓库设置
     * @param wmWarehouse 仓库设置
     */
    int insertWmWarehouse(WmWarehouse wmWarehouse);

    /**
     * 修改仓库设置
     * @param wmWarehouse 仓库设置
     */
    int updateWmWarehouse(WmWarehouse wmWarehouse);

    /**
     * 批量删除仓库设置
     * @param warehouseIds 需要删除的数据主键集合
     */
    int deleteWmWarehouseByWarehouseIds(Long[] warehouseIds);

    /**
     * 根据仓库id查询相关仓库数据
     * @param warehouseIds
     */
    List<WmWarehouse> selectByWarehouseId(@Param("ids") Long[] warehouseIds);
}
