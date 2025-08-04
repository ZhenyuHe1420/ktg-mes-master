package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.mes.dv.domain.DvMaintenRecord;

/**
 * 设备保养记录Service接口
 */
public interface IDvMaintenRecordService 
{
    /**
     * 查询设备保养记录
     * @param recordId 设备保养记录主键
     * @return 设备保养记录
     */
    DvMaintenRecord selectDvMaintenRecordByRecordId(Long recordId);

    /**
     * 查询设备保养记录列表
     * @param dvMaintenRecord 设备保养记录
     * @return 设备保养记录集合
     */
    List<DvMaintenRecord> selectDvMaintenRecordList(DvMaintenRecord dvMaintenRecord);

    /**
     * 新增设备保养记录
     * @param dvMaintenRecord 设备保养记录
     */
    int insertDvMaintenRecord(DvMaintenRecord dvMaintenRecord);

    /**
     * 修改设备保养记录
     * @param dvMaintenRecord 设备保养记录
     */
    int updateDvMaintenRecord(DvMaintenRecord dvMaintenRecord);

    /**
     * 批量删除设备保养记录
     * @param recordIds 需要删除的设备保养记录主键集合
     */
    int deleteDvMaintenRecordByRecordIds(Long[] recordIds);
}
