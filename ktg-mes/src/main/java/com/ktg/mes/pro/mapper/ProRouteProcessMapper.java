package com.ktg.mes.pro.mapper;

import java.util.List;
import com.ktg.mes.pro.domain.ProRouteProcess;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 工艺组成Mapper接口
 */
public interface ProRouteProcessMapper 
{
    /**
     * 查询工艺组成
     * @param recordId 工艺组成主键
     * @return 工艺组成
     */
    ProRouteProcess selectProRouteProcessByRecordId(Long recordId);

    /**
     * 查询工艺组成列表
     * @param proRouteProcess 工艺组成
     * @return 工艺组成集合
     */
    List<ProRouteProcess> selectProRouteProcessList(ProRouteProcess proRouteProcess);

    ProRouteProcess checkOrderNumExists(ProRouteProcess proRouteProcess);

    ProRouteProcess checkProcessExists(ProRouteProcess proRouteProcess);

    ProRouteProcess checkUpdateFlagUnique(ProRouteProcess proRouteProcess);

    ProRouteProcess findPreProcess(ProRouteProcess proRouteProcess);

    ProRouteProcess findNextProcess(ProRouteProcess proRouteProcess);

    /**
     * 新增工艺组成
     * @param proRouteProcess 工艺组成
     */
    int insertProRouteProcess(ProRouteProcess proRouteProcess);

    /**
     * 修改工艺组成
     * @param proRouteProcess 工艺组成
     */
    int updateProRouteProcess(ProRouteProcess proRouteProcess);

    /**
     * 批量删除工艺组成
     * @param recordIds 需要删除的数据主键集合
     */
    int deleteProRouteProcessByRecordIds(Long[] recordIds);

    /**
     * 根据工艺路线ID删除所有工序配置
     * @param routeId
     */
    int deleteByRouteId(Long routeId);

    /**
     * 根据recordIds查询相关工艺组成对象
     * @param recordIds
     */
    List<ProRouteProcess> selectByRecordId(Long recordIds);

    /**
     * 根据routeId查询相关工艺组成对象
     * @param routeId
     */
    List<ProRouteProcess> selectByRouteId(Long routeId);

    List<ProRouteProcess> selectByProcessIds(@Param("entity") Long[] processIds);

    List<ProRouteProcess> selectByRouteIds(@Param("routeIds") List<Long> routeIds);
}
