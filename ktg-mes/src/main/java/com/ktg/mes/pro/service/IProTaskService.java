package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProTask;

/**
 * 生产任务Service接口
 */
public interface IProTaskService 
{
    /**
     * 查询生产任务
     * @param taskId 生产任务主键
     * @return 生产任务
     */
    ProTask selectProTaskByTaskId(Long taskId);

    /**
     * 查询生产任务列表
     * @param proTask 生产任务
     * @return 生产任务集合
     */
    List<ProTask> selectProTaskList(ProTask proTask);

    /**
     * 查询某个工单的各个工序生产进度
     * @param workorderId
     */
    List<ProTask> selectProTaskProcessViewByWorkorder(Long workorderId);

    /**
     * 新增生产任务
     * @param proTask 生产任务
     */
    int insertProTask(ProTask proTask);

    /**
     * 修改生产任务
     * @param proTask 生产任务
     */
    int updateProTask(ProTask proTask);

    /**
     * 批量删除生产任务
     * @param taskIds 需要删除的生产任务主键集合
     */
    int deleteProTaskByTaskIds(Long[] taskIds);
}
