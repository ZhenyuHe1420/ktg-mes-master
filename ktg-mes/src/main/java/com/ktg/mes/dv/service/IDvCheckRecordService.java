package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.mes.dv.domain.DvCheckRecord;

/**
 * 设备点检记录Service接口
 */
public interface IDvCheckRecordService 
{
    /**
     * 查询设备点检记录
     * @param recordId 设备点检记录主键
     * @return 设备点检记录
     */
    DvCheckRecord selectDvCheckRecordByRecordId(Long recordId);

    /**
     * 查询设备点检记录列表
     * @param dvCheckRecord 设备点检记录
     * @return 设备点检记录集合
     */
    List<DvCheckRecord> selectDvCheckRecordList(DvCheckRecord dvCheckRecord);

    /**
     * 新增设备点检记录
     * @param dvCheckRecord 设备点检记录
     */
    int insertDvCheckRecord(DvCheckRecord dvCheckRecord);

    /**
     * 修改设备点检记录
     * @param dvCheckRecord 设备点检记录
     */
    int updateDvCheckRecord(DvCheckRecord dvCheckRecord);

    /**
     * 批量删除设备点检记录
     * @param recordIds 需要删除的设备点检记录主键集合
     */
    int deleteDvCheckRecordByRecordIds(Long[] recordIds);
}
