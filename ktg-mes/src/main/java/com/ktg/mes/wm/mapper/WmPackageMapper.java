package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmPackage;

/**
 * 装箱单Mapper接口
 */
public interface WmPackageMapper 
{
    /**
     * 查询装箱单
     * @param packageId 装箱单主键
     * @return 装箱单
     */
    WmPackage selectWmPackageByPackageId(Long packageId);

    /**
     * 查询装箱单列表
     * @param wmPackage 装箱单
     * @return 装箱单集合
     */
    List<WmPackage> selectWmPackageList(WmPackage wmPackage);

    /**
     * 检查装箱单编号是否唯一
     */
    WmPackage checkPackgeCodeUnique(WmPackage wmPackage);

    /**
     * 新增装箱单
     * @param wmPackage 装箱单
     */
    int insertWmPackage(WmPackage wmPackage);

    /**
     * 修改装箱单
     * @param wmPackage 装箱单
     */
    int updateWmPackage(WmPackage wmPackage);

    /**
     * 批量删除装箱单
     * @param packageIds 需要删除的数据主键集合
     */
    int deleteWmPackageByPackageIds(Long[] packageIds);
}
