package com.ktg.quartz.mapper;

import java.util.List;
import com.ktg.quartz.domain.SysJobLog;

/**
 * 调度任务日志信息 数据层
 */
public interface SysJobLogMapper
{
    /**
     * 获取quartz调度器日志的计划任务
     * @param jobLog 调度日志信息
     * @return 调度任务日志集合
     */
    List<SysJobLog> selectJobLogList(SysJobLog jobLog);

    /**
     * 通过调度任务日志ID查询调度信息
     * @param jobLogId 调度任务日志ID
     * @return 调度任务日志对象信息
     */
    SysJobLog selectJobLogById(Long jobLogId);

    /**
     * 新增任务日志
     * @param jobLog 调度日志信息
     */
    int insertJobLog(SysJobLog jobLog);

    /**
     * 批量删除调度日志信息
     * @param logIds 需要删除的数据ID
     */
    int deleteJobLogByIds(Long[] logIds);

    /**
     * 清空任务日志
     */
    void cleanJobLog();
}
