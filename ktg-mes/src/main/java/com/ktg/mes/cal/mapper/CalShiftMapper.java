package com.ktg.mes.cal.mapper;

import java.util.List;
import com.ktg.mes.cal.domain.CalShift;

/**
 * 计划班次Mapper接口
 */
public interface CalShiftMapper 
{
    /**
     * 查询计划班次
     * @param shiftId 计划班次主键
     * @return 计划班次
     */
    CalShift selectCalShiftByShiftId(Long shiftId);

    /**
     * 查询计划班次列表
     * @param calShift 计划班次
     * @return 计划班次集合
     */
    List<CalShift> selectCalShiftList(CalShift calShift);

    int checkShiftCount(Long planId);

    /**
     * 新增计划班次
     * @param calShift 计划班次
     */
    int insertCalShift(CalShift calShift);

    /**
     * 修改计划班次
     * @param calShift 计划班次
     */
    int updateCalShift(CalShift calShift);

    /**
     * 批量删除计划班次
     * @param shiftIds 需要删除的数据主键集合
     */
    int deleteCalShiftByShiftIds(Long[] shiftIds);

    int deleteByPlanId(Long planId);
}
