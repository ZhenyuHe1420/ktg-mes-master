package com.ktg.mes.md.service;

import java.util.List;
import com.ktg.mes.md.domain.MdWorkstationWorker;

/**
 * 人力资源Service接口
 */
public interface IMdWorkstationWorkerService 
{
    /**
     * 查询人力资源
     * @param recordId 人力资源主键
     * @return 人力资源
     */
    MdWorkstationWorker selectMdWorkstationWorkerByRecordId(Long recordId);

    /**
     * 查询人力资源列表
     * @param mdWorkstationWorker 人力资源
     * @return 人力资源集合
     */
    List<MdWorkstationWorker> selectMdWorkstationWorkerList(MdWorkstationWorker mdWorkstationWorker);

    /**
     * 检查当前工作站是否已添加此岗位资源
     */
    String checkPostExist(MdWorkstationWorker mdWorkstationWorker);

    /**
     * 新增人力资源
     * @param mdWorkstationWorker 人力资源
     */
    int insertMdWorkstationWorker(MdWorkstationWorker mdWorkstationWorker);

    /**
     * 修改人力资源
     * @param mdWorkstationWorker 人力资源
     */
    int updateMdWorkstationWorker(MdWorkstationWorker mdWorkstationWorker);

    /**
     * 批量删除人力资源
     * @param recordIds 需要删除的人力资源主键集合
     */
    int deleteMdWorkstationWorkerByRecordIds(Long[] recordIds);

    /**
     * 根据工作站ID删除对应的人员信息
     * @param workstationId
     */
    int deleteByWorkstationId(Long workstationId);
}
