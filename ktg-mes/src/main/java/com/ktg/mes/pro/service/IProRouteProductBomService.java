package com.ktg.mes.pro.service;

import java.util.List;

import com.ktg.mes.pro.domain.ProFeedback;
import com.ktg.mes.pro.domain.ProRouteProductBom;
import com.ktg.mes.wm.domain.WmItemConsume;

/**
 * 产品制程物料BOMService接口
 */
public interface IProRouteProductBomService 
{
    /**
     * 查询产品制程物料BOM
     * @param recordId 产品制程物料BOM主键
     * @return 产品制程物料BOM
     */
    ProRouteProductBom selectProRouteProductBomByRecordId(Long recordId);

    /**
     * 查询产品制程物料BOM列表
     * @param proRouteProductBom 产品制程物料BOM
     * @return 产品制程物料BOM集合
     */
    List<ProRouteProductBom> selectProRouteProductBomList(ProRouteProductBom proRouteProductBom);

    /**
     * 检测是否重复配置
     */
    String checkUnique(ProRouteProductBom proRouteProductBom);

    /**
     * 新增产品制程物料BOM
     * @param proRouteProductBom 产品制程物料BOM
     */
    int insertProRouteProductBom(ProRouteProductBom proRouteProductBom);

    /**
     * 修改产品制程物料BOM
     * @param proRouteProductBom 产品制程物料BOM
     */
    int updateProRouteProductBom(ProRouteProductBom proRouteProductBom);

    /**
     * 批量删除产品制程物料BOM
     * @param recordIds 需要删除的产品制程物料BOM主键集合
     */
    int deleteProRouteProductBomByRecordIds(Long[] recordIds);

    /**
     * 根据工艺路线ID删除所有产品BOM设置
     * @param routeId
     */
    int deleteByRouteId(Long routeId);

    /**
     * 根据工艺路线ID和产品ID删除BOM设置
     */
    int deleteByRouteIdAndProductId(ProRouteProductBom proRouteProductBom);
}
