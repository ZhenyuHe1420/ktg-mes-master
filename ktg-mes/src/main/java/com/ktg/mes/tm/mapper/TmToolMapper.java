package com.ktg.mes.tm.mapper;

import java.util.List;
import com.ktg.mes.tm.domain.TmTool;

/**
 * 工装夹具清单Mapper接口
 */
public interface TmToolMapper 
{
    /**
     * 查询工装夹具清单
     * @param toolId 工装夹具清单主键
     * @return 工装夹具清单
     */
    TmTool selectTmToolByToolId(Long toolId);

    /**
     * 查询工装夹具清单列表
     * @param tmTool 工装夹具清单
     * @return 工装夹具清单集合
     */
    List<TmTool> selectTmToolList(TmTool tmTool);

    TmTool checkToolCodeUnique(TmTool tmTool);

    /**
     * 新增工装夹具清单
     * @param tmTool 工装夹具清单
     */
    int insertTmTool(TmTool tmTool);

    /**
     * 修改工装夹具清单
     * @param tmTool 工装夹具清单
     */
    int updateTmTool(TmTool tmTool);

    /**
     * 批量删除工装夹具清单
     * @param toolIds 需要删除的数据主键集合
     */
    int deleteTmToolByToolIds(Long[] toolIds);
}
