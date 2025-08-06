package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtSalesLine;

/**
 * 产品销售退货行Mapper接口
 */
public interface WmRtSalesLineMapper
{
    /**
     * 查询产品销售退货行
     * @param lineId 产品销售退货行主键
     * @return 产品销售退货行
     */
    WmRtSalesLine selectWmRtSalesLineByLineId(Long lineId);

    /**
     * 查询产品销售退货行列表
     * @param wmRtSalesLine 产品销售退货行
     * @return 产品销售退货行集合
     */
    List<WmRtSalesLine> selectWmRtSalesLineList(WmRtSalesLine wmRtSalesLine);

    /**
     * 查询产品销售退货行列表（含明细）
     * @param wmRtSalesLine 产品销售退货行
     * @return 产品销售退货行集合
     */
    List<WmRtSalesLine> selectWmRtSalesLineWithDetailList(WmRtSalesLine wmRtSalesLine);

    /**
     * 新增产品销售退货行
     * @param wmRtSalesLine 产品销售退货行
     */
    int insertWmRtSalesLine(WmRtSalesLine wmRtSalesLine);

    /**
     * 修改产品销售退货行
     * @param wmRtSalesLine 产品销售退货行
     */
    int updateWmRtSalesLine(WmRtSalesLine wmRtSalesLine);

    /**
     * 批量删除产品销售退货行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmRtSalesLineByLineIds(Long[] lineIds);

    /**
     * 根据退货单ID删除所有行
     * @param rtId
     */
    int deleteByRtId(Long rtId);
}
