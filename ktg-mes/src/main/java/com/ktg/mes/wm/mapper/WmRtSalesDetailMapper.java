package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtSalesDetail;

/**
 * 销售退货记录明细Mapper接口
 */
public interface WmRtSalesDetailMapper 
{
    /**
     * 查询销售退货记录明细
     * @param detailId 销售退货记录明细主键
     * @return 销售退货记录明细
     */
    WmRtSalesDetail selectWmRtSalesDetailByDetailId(Long detailId);

    /**
     * 查询销售退货记录明细列表
     * @param wmRtSalesDetail 销售退货记录明细
     * @return 销售退货记录明细集合
     */
    List<WmRtSalesDetail> selectWmRtSalesDetailList(WmRtSalesDetail wmRtSalesDetail);

    /**
     * 检查退货行上的数量是否与明细行总数量一致
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增销售退货记录明细
     * @param wmRtSalesDetail 销售退货记录明细
     */
    int insertWmRtSalesDetail(WmRtSalesDetail wmRtSalesDetail);

    /**
     * 修改销售退货记录明细
     * @param wmRtSalesDetail 销售退货记录明细
     */
    int updateWmRtSalesDetail(WmRtSalesDetail wmRtSalesDetail);

    /**
     * 批量删除销售退货记录明细
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmRtSalesDetailByDetailIds(Long[] detailIds);
}
