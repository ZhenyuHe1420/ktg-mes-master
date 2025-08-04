package com.ktg.mes.md.mapper;

import java.util.List;
import com.ktg.mes.md.domain.MdWorkstation;

/**
 * 工作站Mapper接口
 */
public interface MdWorkstationMapper 
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

    MdWorkstation checkWorkStationCodeUnique(MdWorkstation mdWorkstation);

    MdWorkstation checkWorkStationNameUnique(MdWorkstation mdWorkstation);

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
     * @param workstationIds 需要删除的数据主键集合
     */
    int deleteMdWorkstationByWorkstationIds(Long[] workstationIds);
}
