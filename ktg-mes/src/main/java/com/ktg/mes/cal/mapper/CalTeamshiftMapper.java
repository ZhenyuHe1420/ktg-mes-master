package com.ktg.mes.cal.mapper;

import java.util.List;
import com.ktg.mes.cal.domain.CalTeamshift;

/**
 * 班组排班Mapper接口
 */
public interface CalTeamshiftMapper 
{
    /**
     * 查询班组排班
     * @param recordId 班组排班主键
     * @return 班组排班
     */
    CalTeamshift selectCalTeamshiftByRecordId(Long recordId);

    /**
     * 查询班组排班列表
     * @param calTeamshift 班组排班
     * @return 班组排班集合
     */
    List<CalTeamshift> selectCalTeamshiftList(CalTeamshift calTeamshift);

    /**
     * 新增班组排班
     * @param calTeamshift 班组排班
     */
    int insertCalTeamshift(CalTeamshift calTeamshift);

    /**
     * 修改班组排班
     * @param calTeamshift 班组排班
     */
    int updateCalTeamshift(CalTeamshift calTeamshift);
}
