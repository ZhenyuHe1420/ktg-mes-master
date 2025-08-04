package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.mes.dv.domain.DvMaintenRecordLine;

/**
 * 设备保养记录行Service接口
 */
public interface IDvMaintenRecordLineService 
{
    /**
     * 查询设备保养记录行
     * @param lineId 设备保养记录行主键
     * @return 设备保养记录行
     */
    DvMaintenRecordLine selectDvMaintenRecordLineByLineId(Long lineId);

    /**
     * 查询设备保养记录行列表
     * @param dvMaintenRecordLine 设备保养记录行
     * @return 设备保养记录行集合
     */
    List<DvMaintenRecordLine> selectDvMaintenRecordLineList(DvMaintenRecordLine dvMaintenRecordLine);

    /**
     * 新增设备保养记录行
     * @param dvMaintenRecordLine 设备保养记录行
     */
    int insertDvMaintenRecordLine(DvMaintenRecordLine dvMaintenRecordLine);

    /**
     * 修改设备保养记录行
     * @param dvMaintenRecordLine 设备保养记录行
     */
    int updateDvMaintenRecordLine(DvMaintenRecordLine dvMaintenRecordLine);

    /**
     * 批量删除设备保养记录行
     * @param lineIds 需要删除的设备保养记录行主键集合
     */
    int deleteDvMaintenRecordLineByLineIds(Long[] lineIds);
}
