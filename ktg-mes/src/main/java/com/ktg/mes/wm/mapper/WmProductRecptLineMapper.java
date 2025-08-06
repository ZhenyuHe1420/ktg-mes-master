package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmProductRecptLine;

/**
 * 产品入库记录行Mapper接口
 */
public interface WmProductRecptLineMapper 
{
    /**
     * 查询产品入库记录行
     * @param lineId 产品入库记录行主键
     * @return 产品入库记录行
     */
    WmProductRecptLine selectWmProductRecptLineByLineId(Long lineId);

    /**
     * 查询产品入库记录行列表
     * @param wmProductRecptLine 产品入库记录行
     * @return 产品入库记录行集合
     */
    List<WmProductRecptLine> selectWmProductRecptLineList(WmProductRecptLine wmProductRecptLine);

    /**
     * 查询产品入库记录行列表(含明细)
     * @param wmProductRecptLine 产品入库记录行
     * @return 产品入库记录行集合
     */
    List<WmProductRecptLine> selectWmProductRecptLineWithDetailList(WmProductRecptLine wmProductRecptLine);

    /**
     * 新增产品入库记录行
     * @param wmProductRecptLine 产品入库记录行
     */
    int insertWmProductRecptLine(WmProductRecptLine wmProductRecptLine);

    /**
     * 修改产品入库记录行
     * @param wmProductRecptLine 产品入库记录行
     */
    int updateWmProductRecptLine(WmProductRecptLine wmProductRecptLine);

    /**
     * 批量删除产品入库记录行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmProductRecptLineByLineIds(Long[] lineIds);

    /**
     * 根据入库单ID删除所有行
     * @param recptId
     */
    int deleteByRecptId(Long recptId);
}
