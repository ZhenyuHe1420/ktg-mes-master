package com.ktg.mes.md.service;

import java.util.List;
import com.ktg.mes.md.domain.MdWorkstation;

/**
 * 工作站Service接口
 */
public interface IMdWorkstationService 
{
    /**
     * 查询工作站
     * @param workstationId 工作站主键
     * @return 工作站
     */
    MdWorkstation selectMdWorkstationByWorkstationId(Long workstationId);

    /**
     * 查询工作站列表
     * @param mdWorkstation 工作站
     * @return 工作站集合
     */
    List<MdWorkstation> selectMdWorkstationList(MdWorkstation mdWorkstation);

    /**
     * 检查编码是否存在
     */
    String checkWorkStationCodeUnique(MdWorkstation mdWorkstation);

    /**
     * 检查名称是否存在
     */
    String checkWorkStationNameUnique(MdWorkstation mdWorkstation);

    /**
     * 新增工作站
     * @param mdWorkstation 工作站
     */
    int insertMdWorkstation(MdWorkstation mdWorkstation);

    /**
     * 修改工作站
     * @param mdWorkstation 工作站
     */
    int updateMdWorkstation(MdWorkstation mdWorkstation);

    /**
     * 批量删除工作站
     * @param workstationIds 需要删除的工作站主键集合
     */
    int deleteMdWorkstationByWorkstationIds(Long[] workstationIds);
}
