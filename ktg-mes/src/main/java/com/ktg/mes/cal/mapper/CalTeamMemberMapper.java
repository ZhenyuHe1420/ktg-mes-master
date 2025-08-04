package com.ktg.mes.cal.mapper;

import java.util.List;
import com.ktg.mes.cal.domain.CalTeamMember;
import org.apache.ibatis.annotations.Param;

/**
 * 班组成员Mapper接口
 */
public interface CalTeamMemberMapper 
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

    CalTeamMember checkUserUnique(CalTeamMember calTeamMember);

    /**
     * 新增班组成员
     * @param calTeamMember 班组成员
     */
    int insertCalTeamMember(CalTeamMember calTeamMember);

    int deleteByTeamId(Long teamId);

    /**
     * 批量删除班组成员
     * @param memberIds 需要删除的数据主键集合
     */
    int deleteCalTeamMemberByMemberIds(Long[] memberIds);

    /**
     * 根据班组IDS查询班组成员列表
     * @param ids
     */
    List<CalTeamMember> getListByTeamId(@Param("ids") String[] ids);
}
