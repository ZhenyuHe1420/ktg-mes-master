package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtVendorDetail;

/**
 * 采购退货单明细Service接口
 */
public interface IWmRtVendorDetailService 
{
    /**
     * 查询采购退货单明细
     * @param detailId 采购退货单明细主键
     * @return 采购退货单明细
     */
    WmRtVendorDetail selectWmRtVendorDetailByDetailId(Long detailId);

    /**
     * 查询采购退货单明细列表
     * @param wmRtVendorDetail 采购退货单明细
     * @return 采购退货单明细集合
     */
    List<WmRtVendorDetail> selectWmRtVendorDetailList(WmRtVendorDetail wmRtVendorDetail);

    /**
     * 检查某一行的明细数量是不是超出行上的数量
     * G:超出
     * E:等于
     * L:小于
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增采购退货单明细
     * @param wmRtVendorDetail 采购退货单明细
     */
    int insertWmRtVendorDetail(WmRtVendorDetail wmRtVendorDetail);

    /**
     * 修改采购退货单明细
     * @param wmRtVendorDetail 采购退货单明细
     */
    int updateWmRtVendorDetail(WmRtVendorDetail wmRtVendorDetail);

    /**
     * 批量删除采购退货单明细
     * @param detailIds 需要删除的采购退货单明细主键集合
     */
    int deleteWmRtVendorDetailByDetailIds(Long[] detailIds);
}
