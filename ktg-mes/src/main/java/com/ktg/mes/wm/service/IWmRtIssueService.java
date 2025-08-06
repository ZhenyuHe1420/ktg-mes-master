package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtIssue;
import com.ktg.mes.wm.domain.tx.RtIssueTxBean;

/**
 * 生产退料单头Service接口
 */
public interface IWmRtIssueService 
{
    /**
     * 查询生产退料单头
     * @param rtId 生产退料单头主键
     * @return 生产退料单头
     */
    WmRtIssue selectWmRtIssueByRtId(Long rtId);

    /**
     * 查询生产退料单头列表
     * @param wmRtIssue 生产退料单头
     * @return 生产退料单头集合
     */
    List<WmRtIssue> selectWmRtIssueList(WmRtIssue wmRtIssue);

    /**
     * 检查编号是否重复
     */
    String checkUnique(WmRtIssue wmRtIssue);

    /**
     * 新增生产退料单头
     * @param wmRtIssue 生产退料单头
     */
    int insertWmRtIssue(WmRtIssue wmRtIssue);

    /**
     * 修改生产退料单头
     * @param wmRtIssue 生产退料单头
     */
    int updateWmRtIssue(WmRtIssue wmRtIssue);

    /**
     * 批量删除生产退料单头
     * @param rtIds 需要删除的生产退料单头主键集合
     */
    int deleteWmRtIssueByRtIds(Long[] rtIds);

    /**
     * @param rtId
     */
    List<RtIssueTxBean> getTxBeans(Long rtId);
}
