package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmOutsourceIssue;
import com.ktg.mes.wm.domain.tx.OutsourceIssueTxBean;

/**
 * 外协领料单头Service接口
 */
public interface IWmOutsourceIssueService 
{
    /**
     * 查询外协领料单头
     * @param issueId 外协领料单头主键
     * @return 外协领料单头
     */
    WmOutsourceIssue selectWmOutsourceIssueByIssueId(Long issueId);

    /**
     * 查询外协领料单头列表
     * @param wmOutsourceIssue 外协领料单头
     * @return 外协领料单头集合
     */
    List<WmOutsourceIssue> selectWmOutsourceIssueList(WmOutsourceIssue wmOutsourceIssue);

    /**
     * 新增外协领料单头
     * @param wmOutsourceIssue 外协领料单头
     */
    int insertWmOutsourceIssue(WmOutsourceIssue wmOutsourceIssue);

    /**
     * 修改外协领料单头
     * @param wmOutsourceIssue 外协领料单头
     */
    int updateWmOutsourceIssue(WmOutsourceIssue wmOutsourceIssue);

    /**
     * 批量删除外协领料单头
     * @param issueIds 需要删除的外协领料单头主键集合
     */
    int deleteWmOutsourceIssueByIssueIds(Long[] issueIds);

    List<OutsourceIssueTxBean> getTxBeans(Long issueId);

    String checkIssueCodeUnique(WmOutsourceIssue wmOutsourceIssue);
}
