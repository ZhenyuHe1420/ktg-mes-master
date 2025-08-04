package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.pro.domain.ProFeedback;
import com.ktg.mes.pro.domain.ProRouteProcess;

/**
 * 工艺组成Service接口
 */
public interface IProRouteProcessService 
{
    /**
     * 查询工艺组成
     * @param recordId 工艺组成主键
     * @return 工艺组成
     */
    ProRouteProcess selectProRouteProcessByRecordId(Long recordId);

    /**
     * 查询工艺组成列表
     * @param proRouteProcess 工艺组成
     * @return 工艺组成集合
     */
    List<ProRouteProcess> selectProRouteProcessList(ProRouteProcess proRouteProcess);

    /**
     * 检查序号是否已经存在
     */
    String checkOrderNumExists(ProRouteProcess proRouteProcess);

    /**
     * 检查工序是否已经存在
     */
    String checkProcessExists(ProRouteProcess proRouteProcess);

    /**
     * 检查当前工艺路线中是否已经有某个工序配置了update_flag=Y
     */
    String checkUpdateFlagUnique(ProRouteProcess proRouteProcess);

    /**
     * 检查某个报工单对应的工序是否是关键工序
     */
    boolean checkKeyProcess(ProFeedback feedback);

    /**
     * 查找上一个工序
     */
    ProRouteProcess findPreProcess(ProRouteProcess proRouteProcess);

    /**
     * 查找下一个工序
     */
    ProRouteProcess findNextProcess(ProRouteProcess proRouteProcess);

    /**
     * 新增工艺组成
     * @param proRouteProcess 工艺组成
     */
    int insertProRouteProcess(ProRouteProcess proRouteProcess);

    /**
     * 修改工艺组成
     * @param proRouteProcess 工艺组成
     */
    int updateProRouteProcess(ProRouteProcess proRouteProcess);

    /**
     * 批量删除工艺组成
     * @param recordIds 需要删除的工艺组成主键集合
     */
    int deleteProRouteProcessByRecordIds(Long[] recordIds);

    /**
     * 根据工艺路线ID删除所有工序配置
     * @param routeId
     */
    int deleteByRouteId(Long routeId);

    List<ProRouteProcess> selectByProcessIds(Long[] processIds);

    AjaxResult editProRouteProcess(ProRouteProcess proRouteProcess);

    List<ProRouteProcess> selectByRouteIds(List<Long> routeIds);
}
