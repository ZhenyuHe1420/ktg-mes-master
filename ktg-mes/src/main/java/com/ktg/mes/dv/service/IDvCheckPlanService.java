package com.ktg.mes.dv.service;

import java.util.List;

import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.dv.domain.DvCheckPlan;
import com.ktg.mes.dv.domain.dto.DvCheckPlanDTO;

/**
 * 设备点检计划头Service接口
 */
public interface IDvCheckPlanService 
{
    /**
     * 查询设备点检计划头
     * @param planId 设备点检计划头主键
     * @return 设备点检计划头
     */
    DvCheckPlan selectDvCheckPlanByPlanId(Long planId);

    /**
     * 查询设备点检计划头列表
     * @param dvCheckPlan 设备点检计划头
     * @return 设备点检计划头集合
     */
    List<DvCheckPlan> selectDvCheckPlanList(DvCheckPlan dvCheckPlan);

    /**
     * 检查计划编码是否唯一
     * @param dvCheckPlan
     */
    String checkPlanCodeUnique(DvCheckPlan dvCheckPlan);

    /**
     * 新增设备点检计划头
     * @param dvCheckPlan 设备点检计划头
     */
    int insertDvCheckPlan(DvCheckPlan dvCheckPlan);

    /**
     * 修改设备点检计划头
     * @param dvCheckPlan 设备点检计划头
     */
    int updateDvCheckPlan(DvCheckPlan dvCheckPlan);

    /**
     * 批量删除设备点检计划头
     * @param planIds 需要删除的设备点检计划头主键集合
     */
    int deleteDvCheckPlanByPlanIds(Long[] planIds);

    /**
     * 根据设备编码和计划类型查询设备点检计划头列表
     */
    AjaxResult getCheckPlan(DvCheckPlanDTO checkPlanDTO);
}
