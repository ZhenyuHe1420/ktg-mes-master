package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.mes.dv.domain.DvCheckRecordLine;

/**
 * 设备点检记录行Service接口
 */
public interface IDvCheckRecordLineService 
{
    /**
     * 查询设备点检记录行
     * @param lineId 设备点检记录行主键
     * @return 设备点检记录行
     */
    DvCheckRecordLine selectDvCheckRecordLineByLineId(Long lineId);

    /**
     * 查询设备点检记录行列表
     * @param dvCheckRecordLine 设备点检记录行
     * @return 设备点检记录行集合
     */
    List<DvCheckRecordLine> selectDvCheckRecordLineList(DvCheckRecordLine dvCheckRecordLine);

    /**
     * 新增设备点检记录行
     * @param dvCheckRecordLine 设备点检记录行
     */
    int insertDvCheckRecordLine(DvCheckRecordLine dvCheckRecordLine);

    /**
     * 修改设备点检记录行
     * @param dvCheckRecordLine 设备点检记录行
     */
    int updateDvCheckRecordLine(DvCheckRecordLine dvCheckRecordLine);

    /**
     * 批量删除设备点检记录行
     * @param lineIds 需要删除的设备点检记录行主键集合
     */
    int deleteDvCheckRecordLineByLineIds(Long[] lineIds);

    /**
     * 根据记录ID删除设备点检记录行信息
     * @param recordId 记录ID
     */
    int deleteDvCheckRecordLineByRecordId(Long recordId);
}
