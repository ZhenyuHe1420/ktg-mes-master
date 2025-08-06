package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.wm.domain.WmStorageLocation;

/**
 * 库区设置Service接口
 */
public interface IWmStorageLocationService 
{
    /**
     * 查询库区设置
     * @param locationId 库区设置主键
     * @return 库区设置
     */
    WmStorageLocation selectWmStorageLocationByLocationId(Long locationId);

    /**
     * 根据库区编码查询库区
     * @param locationCode
     */
    WmStorageLocation selectWmStorageLocationByLocationCode(String locationCode);

    /**
     * 查询库区设置列表
     * @param wmStorageLocation 库区设置
     * @return 库区设置集合
     */
    List<WmStorageLocation> selectWmStorageLocationList(WmStorageLocation wmStorageLocation);

    /**
     * 检查库区编码是否唯一
     */
    String checkLocationCodeUnique(WmStorageLocation wmStorageLocation);

    /**
     * 检查库区名称是否唯一
     */
    String checkLocationNameUnique(WmStorageLocation wmStorageLocation);

    /**
     * 新增库区设置
     * @param wmStorageLocation 库区设置
     */
    int insertWmStorageLocation(WmStorageLocation wmStorageLocation);

    /**
     * 修改库区设置
     * @param wmStorageLocation 库区设置
     */
    int updateWmStorageLocation(WmStorageLocation wmStorageLocation);

    /**
     * 批量删除库区设置
     * @param locationIds 需要删除的库区设置主键集合
     */
    AjaxResult deleteWmStorageLocationByLocationIds(Long[] locationIds);

    /**
     * 根据仓库删除对应的库区
     * @param warehouseId
     */
    int deleteByWarehouseId(Long warehouseId);
}
