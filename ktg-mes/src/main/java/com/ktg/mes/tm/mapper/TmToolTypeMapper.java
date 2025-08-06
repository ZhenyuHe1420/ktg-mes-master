package com.ktg.mes.tm.mapper;

import java.util.List;
import com.ktg.mes.tm.domain.TmToolType;

/**
 * 工装夹具类型Mapper接口
 */
public interface TmToolTypeMapper 
{
    /**
     * 查询工装夹具类型
     * @param toolTypeId 工装夹具类型主键
     * @return 工装夹具类型
     */
    TmToolType selectTmToolTypeByToolTypeId(Long toolTypeId);

    /**
     * 查询工装夹具类型列表
     * @param tmToolType 工装夹具类型
     * @return 工装夹具类型集合
     */
    List<TmToolType> selectTmToolTypeList(TmToolType tmToolType);

    TmToolType checkToolTypeCodeUnique(TmToolType tmToolType);

    TmToolType checkToolTypeNameUnique(TmToolType tmToolType);

    /**
     * 新增工装夹具类型
     * @param tmToolType 工装夹具类型
     */
    int insertTmToolType(TmToolType tmToolType);

    /**
     * 修改工装夹具类型
     * @param tmToolType 工装夹具类型
     */
    int updateTmToolType(TmToolType tmToolType);

    /**
     * 批量删除工装夹具类型
     * @param toolTypeIds 需要删除的数据主键集合
     */
    int deleteTmToolTypeByToolTypeIds(Long[] toolTypeIds);
}
