package com.ktg.mes.dv.mapper;

import java.util.List;
import com.ktg.mes.dv.domain.DvCheckPlan;
import org.apache.ibatis.annotations.Param;

/**
 * 设备点检计划头Mapper接口
 */
public interface DvCheckPlanMapper 
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

    DvCheckPlan checkPlanCodeUnique(DvCheckPlan dvCheckPlan);

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
     * @param planIds 需要删除的数据主键集合
     */
    int deleteDvCheckPlanByPlanIds(Long[] planIds);

    List<DvCheckPlan> getByIds(@Param("planIds") List<Long> planIds,@Param("planType") String planType);
}
