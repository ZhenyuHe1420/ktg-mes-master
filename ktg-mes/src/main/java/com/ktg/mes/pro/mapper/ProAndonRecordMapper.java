package com.ktg.mes.pro.mapper;

import java.util.List;
import com.ktg.mes.pro.domain.ProAndonRecord;

/**
 * 安灯呼叫记录Mapper接口
 */
public interface ProAndonRecordMapper 
{
    /**
     * 查询安灯呼叫记录
     * @param recordId 安灯呼叫记录主键
     * @return 安灯呼叫记录
     */
    ProAndonRecord selectProAndonRecordByRecordId(Long recordId);

    /**
     * 查询安灯呼叫记录列表
     * @param proAndonRecord 安灯呼叫记录
     * @return 安灯呼叫记录集合
     */
    List<ProAndonRecord> selectProAndonRecordList(ProAndonRecord proAndonRecord);

    /**
     * 新增安灯呼叫记录
     * @param proAndonRecord 安灯呼叫记录
     */
    int insertProAndonRecord(ProAndonRecord proAndonRecord);

    /**
     * 修改安灯呼叫记录
     * @param proAndonRecord 安灯呼叫记录
     */
    int updateProAndonRecord(ProAndonRecord proAndonRecord);

    /**
     * 批量删除安灯呼叫记录
     * @param recordIds 需要删除的数据主键集合
     */
    int deleteProAndonRecordByRecordIds(Long[] recordIds);
}
