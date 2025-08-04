package com.ktg.mes.cal.service;

import java.util.List;
import com.ktg.mes.cal.domain.CalTeam;

/**
 * 班组Service接口
 */
public interface ICalTeamService 
{
    /**
     * 查询班组
     * @param teamId 班组主键
     * @return 班组
     */
    CalTeam selectCalTeamByTeamId(Long teamId);

    /**
     * 查询班组列表
     * @param calTeam 班组
     * @return 班组集合
     */
    List<CalTeam> selectCalTeamList(CalTeam calTeam);

    /**
     * 新增班组
     * @param calTeam 班组
     */
    int insertCalTeam(CalTeam calTeam);

    /**
     * 修改班组
     * @param calTeam 班组
     */
    int updateCalTeam(CalTeam calTeam);

    /**
     * 批量删除班组
     * @param teamIds 需要删除的班组主键集合
     */
    int deleteCalTeamByTeamIds(Long[] teamIds);

    /**
     * 校验编码是否唯一
     * @param calTeam
     */
    String checkTeamCodeUnique(CalTeam calTeam);
}
