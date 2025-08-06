package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtIssue;
import com.ktg.mes.wm.domain.tx.RtIssueTxBean;

/**
 * 生产退料单头Mapper接口
 */
public interface WmRtIssueMapper 
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
     * @param rtId
     */
    List<RtIssueTxBean> getTxBeans(Long rtId);

    /**
     * 检查编号是否重复
     */
    WmRtIssue checkUnique(WmRtIssue wmRtIssue);

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
     * @param rtIds 需要删除的数据主键集合
     */
    int deleteWmRtIssueByRtIds(Long[] rtIds);
}
