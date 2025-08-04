package com.ktg.mes.dv.mapper;

import java.util.List;
import com.ktg.mes.dv.domain.DvMachineryType;

/**
 * 设备类型Mapper接口
 */
public interface DvMachineryTypeMapper 
{
    /**
     * 查询设备类型
     * @param machineryTypeId 设备类型主键
     * @return 设备类型
     */
    DvMachineryType selectDvMachineryTypeByMachineryTypeId(Long machineryTypeId);

    /**
     * 查询设备类型列表
     * @param dvMachineryType 设备类型
     * @return 设备类型集合
     */
    List<DvMachineryType> selectDvMachineryTypeList(DvMachineryType dvMachineryType);

    /**
     * 新增设备类型
     * @param dvMachineryType 设备类型
     */
    int insertDvMachineryType(DvMachineryType dvMachineryType);

    /**
     * 修改设备类型
     * @param dvMachineryType 设备类型
     */
    int updateDvMachineryType(DvMachineryType dvMachineryType);

    /**
     * 批量删除设备类型
     * @param machineryTypeIds 需要删除的数据主键集合
     */
    int deleteDvMachineryTypeByMachineryTypeIds(Long[] machineryTypeIds);
}
