package com.ktg.mes.pro.mapper;

import java.util.List;
import com.ktg.mes.pro.domain.ProRoute;

/**
 * 工艺路线Mapper接口
 */
public interface ProRouteMapper 
{
    /**
     * 查询工艺路线
     * @param routeId 工艺路线主键
     * @return 工艺路线
     */
    ProRoute selectProRouteByRouteId(Long routeId);

    /**
     * 查询工艺路线列表
     * @param proRoute 工艺路线
     * @return 工艺路线集合
     */
    List<ProRoute> selectProRouteList(ProRoute proRoute);

    /**
     * 根据物料查找生效的工艺路线
     * @param itemId
     */
    ProRoute getRouteByProductId(Long itemId);

    ProRoute checkRouteCodeUnique(ProRoute proRoute);

    /**
     * 新增工艺路线
     * @param proRoute 工艺路线
     */
    int insertProRoute(ProRoute proRoute);

    /**
     * 修改工艺路线
     * @param proRoute 工艺路线
     */
    int updateProRoute(ProRoute proRoute);

    /**
     * 批量删除工艺路线
     * @param routeIds 需要删除的数据主键集合
     */
    int deleteProRouteByRouteIds(Long[] routeIds);
}
