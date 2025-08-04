package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.dv.domain.DvRepair;
import com.ktg.mes.dv.domain.dto.DvRepairDTO;

/**
 * 设备维修单Service接口
 */
public interface IDvRepairService 
{
    /**
     * 查询设备维修单
     * @param repairId 设备维修单主键
     * @return 设备维修单
     */
    DvRepair selectDvRepairByRepairId(Long repairId);

    /**
     * 查询设备维修单列表
     * @param dvRepair 设备维修单
     * @return 设备维修单集合
     */
    List<DvRepair> selectDvRepairList(DvRepair dvRepair);

    /**
     * 检测维修单编号是否唯一
     * @param dvRepair
     */
    String checkCodeUnique(DvRepair dvRepair);

    /**
     * 新增设备维修单
     * @param dvRepair 设备维修单
     */
    int insertDvRepair(DvRepair dvRepair);

    /**
     * 修改设备维修单
     * @param dvRepair 设备维修单
     */
    int updateDvRepair(DvRepair dvRepair);

    /**
     * 批量删除设备维修单
     * @param repairIds 需要删除的设备维修单主键集合
     */
    int deleteDvRepairByRepairIds(Long[] repairIds);

    /**
     * 根据设备编码查询设备维修单列表
     */
    AjaxResult getRepairList(DvRepairDTO repairDTO);
}
