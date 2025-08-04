package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.mes.dv.domain.DvCheckMachinery;

/**
 * 点检设备Service接口
 */
public interface IDvCheckMachineryService 
{
    /**
     * 查询点检设备
     * @param recordId 点检设备主键
     * @return 点检设备
     */
    DvCheckMachinery selectDvCheckMachineryByRecordId(Long recordId);

    /**
     * 查询点检设备列表
     * @param dvCheckMachinery 点检设备
     * @return 点检设备集合
     */
    List<DvCheckMachinery> selectDvCheckMachineryList(DvCheckMachinery dvCheckMachinery);

    String  checkMachineryUnique(DvCheckMachinery dvCheckMachinery);

    /**
     * 新增点检设备
     * @param dvCheckMachinery 点检设备
     */
    int insertDvCheckMachinery(DvCheckMachinery dvCheckMachinery);

    /**
     * 修改点检设备
     * @param dvCheckMachinery 点检设备
     */
    int updateDvCheckMachinery(DvCheckMachinery dvCheckMachinery);

    /**
     * 批量删除点检设备
     * @param recordIds 需要删除的点检设备主键集合
     */
    int deleteDvCheckMachineryByRecordIds(Long[] recordIds);

    /**
     * 根据计划头ID删除对应的设备列表
     * @param planId
     */
    int deleteByPlanId(Long planId);

    /**
     * 根据设备编码获取相关计划id
     * @param machineryCode
     */
    List<Long> getPlanId(String machineryCode);
}
