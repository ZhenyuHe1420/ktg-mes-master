package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmStorageLocation;
import org.apache.ibatis.annotations.Param;

/**
 * 库区设置Mapper接口
 */
public interface WmStorageLocationMapper 
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

    WmStorageLocation checkLocationCodeUnique(WmStorageLocation wmStorageLocation);

    WmStorageLocation checkLocationNameUnique(WmStorageLocation wmStorageLocation);

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
     * @param locationIds 需要删除的数据主键集合
     */
    int deleteWmStorageLocationByLocationIds(Long[] locationIds);

    /**
     * 根据仓库删除对应的库区
     * @param warehouseId
     */
    int deleteByWarehouseId(Long warehouseId);

    /**
     * 根据locationIds查询库区数据
     * @param locationIds
     */
    List<WmStorageLocation> selectByLocationIds(@Param("ids") Long[] locationIds);
}
