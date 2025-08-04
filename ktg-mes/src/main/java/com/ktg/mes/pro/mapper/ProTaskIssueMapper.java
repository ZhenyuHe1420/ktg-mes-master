package com.ktg.mes.pro.mapper;

import java.util.List;
import com.ktg.mes.pro.domain.ProTaskIssue;

/**
 * 生产任务投料Mapper接口
 */
public interface ProTaskIssueMapper 
{
    /**
     * 查询生产任务投料
     * @param recordId 生产任务投料主键
     * @return 生产任务投料
     */
    ProTaskIssue selectProTaskIssueByRecordId(Long recordId);

    /**
     * 查询生产任务投料列表
     * @param proTaskIssue 生产任务投料
     * @return 生产任务投料集合
     */
    List<ProTaskIssue> selectProTaskIssueList(ProTaskIssue proTaskIssue);

    ProTaskIssue checkUnique(ProTaskIssue proTaskIssue);

    /**
     * 新增生产任务投料
     * @param proTaskIssue 生产任务投料
     */
    int insertProTaskIssue(ProTaskIssue proTaskIssue);

    /**
     * 修改生产任务投料
     * @param proTaskIssue 生产任务投料
     */
    int updateProTaskIssue(ProTaskIssue proTaskIssue);

    /**
     * 批量删除生产任务投料
     * @param recordIds 需要删除的数据主键集合
     */
    int deleteProTaskIssueByRecordIds(Long[] recordIds);
}
