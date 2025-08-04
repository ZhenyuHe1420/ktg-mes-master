package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProRouteProduct;

/**
 * 产品制程Service接口
 */
public interface IProRouteProductService 
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

    /**
     * 检查物料是否已经存在
     */
    String checkItemUnique(ProRouteProduct proRouteProduct);

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
     * @param recordIds 需要删除的产品制程主键集合
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
    List<ProRouteProduct> selectByProductIds(List<Long> productIds);
}
