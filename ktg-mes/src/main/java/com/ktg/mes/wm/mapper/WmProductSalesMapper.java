package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmProductSales;
import com.ktg.mes.wm.domain.WmProductSalesLine;
import com.ktg.mes.wm.domain.tx.ProductSalesTxBean;
import org.apache.ibatis.annotations.Param;

/**
 * 销售出库单Mapper接口
 */
public interface WmProductSalesMapper
{
    /**
     * 查询销售出库单
     * @param salesId 销售出库单主键
     * @return 销售出库单
     */
    WmProductSales selectWmProductSalesBySalesId(Long salesId);

    /**
     * 查询销售出库单列表
     * @param wmProductSales 销售出库单
     * @return 销售出库单集合
     */
    List<WmProductSales> selectWmProductSalesList(WmProductSales wmProductSales);

    /**
     * 检查编号唯一性
     */
    WmProductSales checkUnique(WmProductSales wmProductSales);

    /**
     * 新增销售出库单
     * @param wmProductSales 销售出库单
     */
    int insertWmProductSales(WmProductSales wmProductSales);

    /**
     * 修改销售出库单
     * @param wmProductSales 销售出库单
     */
    int updateWmProductSales(WmProductSales wmProductSales);

    /**
     * 批量删除销售出库单
     * @param salesIds 需要删除的数据主键集合
     */
    int deleteWmProductSalesBySalesIds(Long[] salesIds);

    /**
     * 获取产品销售出库事务Bean
     * @param salesId
     */
    List<ProductSalesTxBean> getTxBeans(Long salesId);

    /**
     * 根据客户id获取出库产品信息
     * @param clientId
     */
    List<WmProductSalesLine> getItem(@Param("clientId") Long clientId);

    /**
     * 根据客户 id 获取销售记录数据
     * @param clientId
     */
    List<WmProductSales> getSaleRecord(@Param("clientId") Long clientId);
}
