package com.ktg.mes.cal.service;

import java.util.List;
import com.ktg.mes.cal.domain.CalPlan;

/**
 * 排班计划Service接口
 */
public interface ICalPlanService 
{
    /**
     * 查询排班计划
     * @param planId 排班计划主键
     * @return 排班计划
     */
    CalPlan selectCalPlanByPlanId(Long planId);

    /**
     * 查询排班计划列表
     * @param calPlan 排班计划
     * @return 排班计划集合
     */
    List<CalPlan> selectCalPlanList(CalPlan calPlan);

    /**
     * 新增排班计划
     * @param calPlan 排班计划
     */
    int insertCalPlan(CalPlan calPlan);

    /**
     * 修改排班计划
     * @param calPlan 排班计划
     */
    int updateCalPlan(CalPlan calPlan);

    /**
     * 批量删除排班计划
     * @param planIds 需要删除的排班计划主键集合
     */
    int deleteCalPlanByPlanIds(Long[] planIds);

    /**
     * 校验编码是否唯一
     * @param calPlan
     */
    String checkPlanCodeUnique(CalPlan calPlan);
}
