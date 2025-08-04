package com.ktg.mes.md.service;

import java.util.List;
import com.ktg.mes.md.domain.MdWorkstationMachine;

/**
 * 设备资源Service接口
 */
public interface IMdWorkstationMachineService 
{
    /**
     * 查询设备资源
     * @param recordId 设备资源主键
     * @return 设备资源
     */
    MdWorkstationMachine selectMdWorkstationMachineByRecordId(Long recordId);

    /**
     * 查询设备资源列表
     * @param mdWorkstationMachine 设备资源
     * @return 设备资源集合
     */
    List<MdWorkstationMachine> selectMdWorkstationMachineList(MdWorkstationMachine mdWorkstationMachine);

    MdWorkstationMachine checkMachineryExists(MdWorkstationMachine mdWorkstationMachine);

    /**
     * 新增设备资源
     * @param mdWorkstationMachine 设备资源
     */
    int insertMdWorkstationMachine(MdWorkstationMachine mdWorkstationMachine);

    /**
     * 修改设备资源
     * @param mdWorkstationMachine 设备资源
     */
    int updateMdWorkstationMachine(MdWorkstationMachine mdWorkstationMachine);

    /**
     * 批量删除设备资源
     * @param recordIds 需要删除的设备资源主键集合
     */
    int deleteMdWorkstationMachineByRecordIds(Long[] recordIds);

    /**
     * 根据工作站ID删除对应的设备列表
     * @param workstationId
     */
    int deleteByWorkstationId(Long workstationId);
}
