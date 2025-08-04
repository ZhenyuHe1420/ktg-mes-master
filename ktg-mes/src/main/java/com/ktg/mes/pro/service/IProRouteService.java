package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProRoute;

/**
 * 工艺路线Service接口
 */
public interface IProRouteService 
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

    String checkRouteCodeUnique(ProRoute proRoute);

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
     * @param routeIds 需要删除的工艺路线主键集合
     */
    int deleteProRouteByRouteIds(Long[] routeIds);
}
