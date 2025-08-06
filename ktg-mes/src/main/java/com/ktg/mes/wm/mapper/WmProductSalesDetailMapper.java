package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmProductSalesDetail;

/**
 * 产品销售出库记录明细Mapper接口
 */
public interface WmProductSalesDetailMapper 
{
    /**
     * 查询产品销售出库记录明细
     * @param detailId 产品销售出库记录明细主键
     * @return 产品销售出库记录明细
     */
    WmProductSalesDetail selectWmProductSalesDetailByDetailId(Long detailId);

    /**
     * 查询产品销售出库记录明细列表
     * @param wmProductSalesDetail 产品销售出库记录明细
     * @return 产品销售出库记录明细集合
     */
    List<WmProductSalesDetail> selectWmProductSalesDetailList(WmProductSalesDetail wmProductSalesDetail);

    /**
     * 检查销售出库单行与明细行数量是否一致
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增产品销售出库记录明细
     * @param wmProductSalesDetail 产品销售出库记录明细
     */
    int insertWmProductSalesDetail(WmProductSalesDetail wmProductSalesDetail);

    /**
     * 修改产品销售出库记录明细
     * @param wmProductSalesDetail 产品销售出库记录明细
     */
    int updateWmProductSalesDetail(WmProductSalesDetail wmProductSalesDetail);

    /**
     * 批量删除产品销售出库记录明细
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmProductSalesDetailByDetailIds(Long[] detailIds);
}
