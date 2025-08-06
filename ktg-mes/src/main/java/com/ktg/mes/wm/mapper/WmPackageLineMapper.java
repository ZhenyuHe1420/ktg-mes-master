package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmPackageLine;

/**
 * 装箱明细Mapper接口
 */
public interface WmPackageLineMapper 
{
    /**
     * 查询装箱明细
     * @param lineId 装箱明细主键
     * @return 装箱明细
     */
    WmPackageLine selectWmPackageLineByLineId(Long lineId);

    /**
     * 查询装箱明细列表
     * @param wmPackageLine 装箱明细
     * @return 装箱明细集合
     */
    List<WmPackageLine> selectWmPackageLineList(WmPackageLine wmPackageLine);

    /**
     * 新增装箱明细
     * @param wmPackageLine 装箱明细
     */
    int insertWmPackageLine(WmPackageLine wmPackageLine);

    /**
     * 修改装箱明细
     * @param wmPackageLine 装箱明细
     */
    int updateWmPackageLine(WmPackageLine wmPackageLine);

    /**
     * 批量删除装箱明细
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmPackageLineByLineIds(Long[] lineIds);
}
