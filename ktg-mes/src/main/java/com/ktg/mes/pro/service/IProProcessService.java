package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.pro.domain.ProProcess;

/**
 * 生产工序Service接口
 */
public interface IProProcessService 
{
    /**
     * 查询生产工序
     * @param processId 生产工序主键
     * @return 生产工序
     */
    ProProcess selectProProcessByProcessId(Long processId);

    /**
     * 查询生产工序列表
     * @param proProcess 生产工序
     * @return 生产工序集合
     */
    List<ProProcess> selectProProcessList(ProProcess proProcess);

    String checkProcessCodeUnique(ProProcess proProcess);

    String checkProcessNameUnique(ProProcess proProcess);

    /**
     * 新增生产工序
     * @param proProcess 生产工序
     */
    int insertProProcess(ProProcess proProcess);

    /**
     * 修改生产工序
     * @param proProcess 生产工序
     */
    int updateProProcess(ProProcess proProcess);

    /**
     * 批量删除生产工序
     * @param processIds 需要删除的生产工序主键集合
     */
    AjaxResult deleteProProcessByProcessIds(Long[] processIds);
}
