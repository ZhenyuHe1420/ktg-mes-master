package com.ktg.mes.pro.mapper;

import java.util.List;
import com.ktg.mes.pro.domain.ProProcess;

/**
 * 生产工序Mapper接口
 */
public interface ProProcessMapper 
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

    ProProcess checkProcessCodeUnique(ProProcess proProcess);

    ProProcess checkProcessNameUnique(ProProcess proProcess);

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
     * @param processIds 需要删除的数据主键集合
     */
    int deleteProProcessByProcessIds(Long[] processIds);
}
