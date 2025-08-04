package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProWorkorderBom;

/**
 * 生产工单BOM组成Service接口
 */
public interface IProWorkorderBomService 
{
    /**
     * 查询生产工单BOM组成
     * @param lineId 生产工单BOM组成主键
     * @return 生产工单BOM组成
     */
    ProWorkorderBom selectProWorkorderBomByLineId(Long lineId);

    /**
     * 查询生产工单BOM组成列表
     * @param proWorkorderBom 生产工单BOM组成
     * @return 生产工单BOM组成集合
     */
    List<ProWorkorderBom> selectProWorkorderBomList(ProWorkorderBom proWorkorderBom);

    /**
     * 新增生产工单BOM组成
     * @param proWorkorderBom 生产工单BOM组成
     */
    int insertProWorkorderBom(ProWorkorderBom proWorkorderBom);

    /**
     * 修改生产工单BOM组成
     * @param proWorkorderBom 生产工单BOM组成
     */
    int updateProWorkorderBom(ProWorkorderBom proWorkorderBom);

    /**
     * 批量删除生产工单BOM组成
     * @param lineIds 需要删除的生产工单BOM组成主键集合
     */
    int deleteProWorkorderBomByLineIds(Long[] lineIds);

    /**
     * 批量删除工单下所有的BOM组成数据
     * @param workorderId
     */
    int deleteProWorkorderBomByWorkorderId(Long workorderId);
}
