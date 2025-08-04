package com.ktg.mes.dv.mapper;

import java.util.List;
import com.ktg.mes.dv.domain.DvRepairLine;

/**
 * 设备维修单行Mapper接口
 */
public interface DvRepairLineMapper 
{
    /**
     * 查询设备维修单行
     * @param lineId 设备维修单行主键
     * @return 设备维修单行
     */
    DvRepairLine selectDvRepairLineByLineId(Long lineId);

    /**
     * 查询设备维修单行列表
     * @param dvRepairLine 设备维修单行
     * @return 设备维修单行集合
     */
    List<DvRepairLine> selectDvRepairLineList(DvRepairLine dvRepairLine);

    /**
     * 新增设备维修单行
     * @param dvRepairLine 设备维修单行
     */
    int insertDvRepairLine(DvRepairLine dvRepairLine);

    /**
     * 修改设备维修单行
     * @param dvRepairLine 设备维修单行
     */
    int updateDvRepairLine(DvRepairLine dvRepairLine);

    /**
     * 批量删除设备维修单行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteDvRepairLineByLineIds(Long[] lineIds);
}
