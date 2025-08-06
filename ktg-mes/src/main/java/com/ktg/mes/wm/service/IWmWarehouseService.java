package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.wm.domain.WmWarehouse;

/**
 * 仓库设置Service接口
 */
public interface IWmWarehouseService 
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

    /**
     * 检查仓库编码是否重复
     */
    String checkWarehouseCodeUnique(WmWarehouse wmWarehouse);

    /**
     * 检查仓库名称是否重复
     */
    String checkWarehouseNameUnique(WmWarehouse wmWarehouse);

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
     * @param warehouseIds 需要删除的仓库设置主键集合
     */
    AjaxResult deleteWmWarehouseByWarehouseIds(Long[] warehouseIds);

    /**
     * 初始化虚拟的线边库
     */
    WmWarehouse initVirtualWarehouse();
}
