package com.ktg.mes.cal.service;

import java.util.List;
import com.ktg.mes.cal.domain.CalPlanTeam;

/**
 * 计划班组Service接口
 */
public interface ICalPlanTeamService 
{
    /**
     * 查询计划班组
     * @param recordId 计划班组主键
     * @return 计划班组
     */
    CalPlanTeam selectCalPlanTeamByRecordId(Long recordId);

    /**
     * 查询计划班组列表
     * @param calPlanTeam 计划班组
     * @return 计划班组集合
     */
    List<CalPlanTeam> selectCalPlanTeamList(CalPlanTeam calPlanTeam);

    List<CalPlanTeam> selectCalPlanTeamListByPlanId(Long plandId);

    String checkPlanTeamUnique(CalPlanTeam calPlanTeam);

    /**
     * 新增计划班组
     * @param calPlanTeam 计划班组
     */
    int insertCalPlanTeam(CalPlanTeam calPlanTeam);

    /**
     * 修改计划班组
     * @param calPlanTeam 计划班组
     */
    int updateCalPlanTeam(CalPlanTeam calPlanTeam);

    /**
     * 批量删除计划班组
     * @param recordIds 需要删除的计划班组主键集合
     */
    int deleteCalPlanTeamByRecordIds(Long[] recordIds);

    int deleteByPlanId(Long plandId);
}
