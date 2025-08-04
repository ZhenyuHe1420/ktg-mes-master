package com.ktg.mes.pro.mapper;

import java.util.List;
import com.ktg.mes.pro.domain.ProCardProcess;

/**
 * 工序流转卡-工序信息Mapper接口
 */
public interface ProCardProcessMapper 
{
    /**
     * 查询工序流转卡-工序信息
     * @param recordId 工序流转卡-工序信息主键
     * @return 工序流转卡-工序信息
     */
    ProCardProcess selectProCardProcessByRecordId(Long recordId);

    /**
     * 查询工序流转卡-工序信息列表
     * @param proCardProcess 工序流转卡-工序信息
     * @return 工序流转卡-工序信息集合
     */
    List<ProCardProcess> selectProCardProcessList(ProCardProcess proCardProcess);

    /**
     * 新增工序流转卡-工序信息
     * @param proCardProcess 工序流转卡-工序信息
     */
    int insertProCardProcess(ProCardProcess proCardProcess);

    /**
     * 修改工序流转卡-工序信息
     * @param proCardProcess 工序流转卡-工序信息
     */
    int updateProCardProcess(ProCardProcess proCardProcess);

    /**
     * 批量删除工序流转卡-工序信息
     * @param recordIds 需要删除的数据主键集合
     */
    int deleteProCardProcessByRecordIds(Long[] recordIds);
}
