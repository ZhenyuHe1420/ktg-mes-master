package com.ktg.mes.dv.mapper;

import com.ktg.mes.dv.domain.DvMachinery;
import java.util.List;

/**
 * 设备Mapper接口
 */
public interface DvMachineryMapper 
{
    /**
     * 查询设备
     * @param machineryId 设备主键
     * @return 设备
     */
    DvMachinery selectDvMachineryByMachineryId(Long machineryId);

    /**
     * 依据设备编码查询设备
     * @param machineryCode 设备编码
     * @return 设备
     */
    List<DvMachinery> selectByMachineryCode(String machineryCode);

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
    int insertDvMachinery(DvMachinery dvMachinery);

    /**
     * 修改设备
     * @param dvMachinery 设备
     */
    int updateDvMachinery(DvMachinery dvMachinery);

    /**
     * 批量删除设备
     * @param machineryIds 需要删除的数据主键集合
     */
    int deleteDvMachineryByMachineryIds(Long[] machineryIds);

    DvMachinery checkRecptCodeUnique(DvMachinery dvMachinery);
}
