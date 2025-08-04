package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProSnProcess;

/**
 * SN流转-工序信息Service接口
 */
public interface IProSnProcessService 
{
    /**
     * 查询SN流转-工序信息
     * @param recordId SN流转-工序信息主键
     * @return SN流转-工序信息
     */
    ProSnProcess selectProSnProcessByRecordId(Long recordId);

    /**
     * 查询SN流转-工序信息列表
     * @param proSnProcess SN流转-工序信息
     * @return SN流转-工序信息集合
     */
    List<ProSnProcess> selectProSnProcessList(ProSnProcess proSnProcess);

    /**
     * 新增SN流转-工序信息
     * @param proSnProcess SN流转-工序信息
     */
    int insertProSnProcess(ProSnProcess proSnProcess);

    /**
     * 修改SN流转-工序信息
     * @param proSnProcess SN流转-工序信息
     */
    int updateProSnProcess(ProSnProcess proSnProcess);

    /**
     * 批量删除SN流转-工序信息
     * @param recordIds 需要删除的SN流转-工序信息主键集合
     */
    int deleteProSnProcessByRecordIds(Long[] recordIds);
}
