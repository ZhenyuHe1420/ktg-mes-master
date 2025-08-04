package com.ktg.mes.dv.service;

import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.dv.domain.DvMachinery;

import java.util.List;

/**
 * 设备Service接口
 */
public interface IDvMachineryService 
{
    /**
     * 查询设备
     * @param machineryId 设备主键
     * @return 设备
     */
    DvMachinery selectDvMachineryByMachineryId(Long machineryId);

    /**
     * 查询设备列表
     * @param dvMachinery 设备
     * @return 设备集合
     */
    List<DvMachinery> selectDvMachineryList(DvMachinery dvMachinery);

    /**
     * 新增设备
     * @param dvMachinery 设备
     */
    AjaxResult insertDvMachinery(DvMachinery dvMachinery);

    /**
     * 修改设备
     * @param dvMachinery 设备
     */
    public AjaxResult updateDvMachinery(DvMachinery dvMachinery);

    /**
     * 批量删除设备
     * @param machineryIds 需要删除的设备主键集合
     */
    int deleteDvMachineryByMachineryIds(Long[] machineryIds);

    /**
     * 依据上传的文件，批量导入或更新设备信息
     * @param machineryList 设备信息列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     */
     String importMachinery(List<DvMachinery> machineryList, Boolean isUpdateSupport, String operName);

    /**
     * 查询编码是否唯一
     * @param dvMachinery
     */
    String checkRecptCodeUnique(DvMachinery dvMachinery);
}
