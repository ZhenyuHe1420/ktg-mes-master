package com.ktg.mes.pro.mapper;

import java.util.List;
import com.ktg.mes.pro.domain.ProRouteProduct;
import org.apache.ibatis.annotations.Param;

/**
 * 产品制程Mapper接口
 */
public interface ProRouteProductMapper 
{
    /**
     * 查询产品制程
     * @param recordId 产品制程主键
     * @return 产品制程
     */
    ProRouteProduct selectProRouteProductByRecordId(Long recordId);

    /**
     * 查询产品制程列表
     * @param proRouteProduct 产品制程
     * @return 产品制程集合
     */
    List<ProRouteProduct> selectProRouteProductList(ProRouteProduct proRouteProduct);

    ProRouteProduct checkItemUnique(ProRouteProduct proRouteProduct);

    /**
     * 新增产品制程
     * @param proRouteProduct 产品制程
     */
    int insertProRouteProduct(ProRouteProduct proRouteProduct);

    /**
     * 修改产品制程
     * @param proRouteProduct 产品制程
     */
    int updateProRouteProduct(ProRouteProduct proRouteProduct);

    /**
     * 批量删除产品制程
     * @param recordIds 需要删除的数据主键集合
     */
    int deleteProRouteProductByRecordIds(Long[] recordIds);

    /**
     * 根据工艺路线ID删除对应的产品配置
     * @param routeId
     */
    int deleteByRouteId(Long routeId);

    /**
     * 根据 productIds 查询相关数据
     * @param productIds
     */
    List<ProRouteProduct> selectByProductIds(@Param("productIds") List<Long> productIds);
}
