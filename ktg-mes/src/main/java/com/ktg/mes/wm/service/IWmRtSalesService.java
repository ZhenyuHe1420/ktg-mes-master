package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtSales;
import com.ktg.mes.wm.domain.tx.RtSalesTxBean;

/**
 * 产品销售退货单Service接口
 */
public interface IWmRtSalesService
{
    /**
     * 查询产品销售退货单
     * @param rtId 产品销售退货单主键
     * @return 产品销售退货单
     */
    WmRtSales selectWmRtSalesByRtId(Long rtId);

    /**
     * 查询产品销售退货单列表
     * @param wmRtSales 产品销售退货单
     * @return 产品销售退货单集合
     */
    List<WmRtSales> selectWmRtSalesList(WmRtSales wmRtSales);

    /**
     * @param rtId
     */
    List<RtSalesTxBean> getTxBeans(Long rtId);

    /**
     * 检查编号唯一性
     */
    String checkUnique(WmRtSales wmRtSales);

    /**
     * 新增产品销售退货单
     * @param wmRtSales 产品销售退货单
     */
    int insertWmRtSales(WmRtSales wmRtSales);

    /**
     * 修改产品销售退货单
     * @param wmRtSales 产品销售退货单
     */
    int updateWmRtSales(WmRtSales wmRtSales);

    /**
     * 批量删除产品销售退货单
     * @param rtIds 需要删除的产品销售退货单主键集合
     */
    int deleteWmRtSalesByRtIds(Long[] rtIds);
}
