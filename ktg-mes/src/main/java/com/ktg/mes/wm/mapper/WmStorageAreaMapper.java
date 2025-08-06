package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmPosition;
import com.ktg.mes.wm.domain.WmStorageArea;
import org.apache.ibatis.annotations.Param;

/**
 * 库位设置Mapper接口
 */
public interface WmStorageAreaMapper 
{
    /**
     * 查询库位设置
     * @param areaId 库位设置主键
     * @return 库位设置
     */
    WmStorageArea selectWmStorageAreaByAreaId(Long areaId);

    /**
     * 根据库位编码查询库位
     * @param areaCode
     */
    WmStorageArea selectWmStorageAreaByAreaCode(String areaCode);

    /**
     * 查询库位设置列表
     * @param wmStorageArea 库位设置
     * @return 库位设置集合
     */
    List<WmStorageArea> selectWmStorageAreaList(WmStorageArea wmStorageArea);

    /**
     * 新增库位设置
     * @param wmStorageArea 库位设置
     */
    int insertWmStorageArea(WmStorageArea wmStorageArea);

    /**
     * 修改库位设置
     * @param wmStorageArea 库位设置
     */
    int updateWmStorageArea(WmStorageArea wmStorageArea);

    /**
     * 批量更新某个库区下库位的产品混合设置
     */
    void updateWmStorageAreaProductMixing(WmStorageArea wmStorageArea);

    /**
     * 批量更新某个库区下库位的批次混合设置
     */
    void updateWmStorageAreaBatchMixing(WmStorageArea wmStorageArea);

    /**
     * 批量删除库位设置
     * @param areaIds 需要删除的数据主键集合
     */
    int deleteWmStorageAreaByAreaIds(Long[] areaIds);

    /**
     * 根据仓库删除对应的库位
     * @param warehouseId
     */
    int deleteByWarehouseId(Long warehouseId);

    List<WmStorageArea> selectByAreaIds(@Param("ids") Long[] areaIds);

    int deleteByLocationIds(@Param("ids") Long[] locationIds);
}
