package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmMiscIssue;
import com.ktg.mes.wm.domain.tx.MiscIssueTxBean;

/**
 * 杂项出库单Mapper接口
 */
public interface WmMiscIssueMapper 
{
    /**
     * 查询杂项出库单
     * @param issueId 杂项出库单主键
     * @return 杂项出库单
     */
    WmMiscIssue selectWmMiscIssueByIssueId(Long issueId);

    /**
     * 查询杂项出库单列表
     * @param wmMiscIssue 杂项出库单
     * @return 杂项出库单集合
     */
    List<WmMiscIssue> selectWmMiscIssueList(WmMiscIssue wmMiscIssue);

    List<MiscIssueTxBean> getTxBeans(Long issueId);

    /**
     * 检查编号是否唯一
     */
    WmMiscIssue checkUnique(WmMiscIssue wmMiscIssue);

    /**
     * 新增杂项出库单
     * @param wmMiscIssue 杂项出库单
     */
    int insertWmMiscIssue(WmMiscIssue wmMiscIssue);

    /**
     * 修改杂项出库单
     * @param wmMiscIssue 杂项出库单
     */
    int updateWmMiscIssue(WmMiscIssue wmMiscIssue);

    /**
     * 批量删除杂项出库单
     * @param issueIds 需要删除的数据主键集合
     */
    int deleteWmMiscIssueByIssueIds(Long[] issueIds);
}
