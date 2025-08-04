package com.ktg.mes.cal.service;

import java.util.List;
import com.ktg.mes.cal.domain.CalTeamMember;

/**
 * 班组成员Service接口
 */
public interface ICalTeamMemberService 
{
    /**
     * 查询班组成员
     * @param memberId 班组成员主键
     * @return 班组成员
     */
    CalTeamMember selectCalTeamMemberByMemberId(Long memberId);

    /**
     * 查询班组成员列表
     * @param calTeamMember 班组成员
     * @return 班组成员集合
     */
    List<CalTeamMember> selectCalTeamMemberList(CalTeamMember calTeamMember);

    String checkUserUnique(CalTeamMember calTeamMember);

    /**
     * 新增班组成员
     * @param calTeamMember 班组成员
     */
    int insertCalTeamMember(CalTeamMember calTeamMember);

    /**
     * 批量删除班组成员
     * @param memberIds 需要删除的班组成员主键集合
     */
    int deleteCalTeamMemberByMemberIds(Long[] memberIds);

    int deleteByTeamId(Long teamId);

    /**
     * 根据班组IDS查询班组成员列表
     * @param ids
     */
    List<CalTeamMember> getListByTeamId(String ids);
}
