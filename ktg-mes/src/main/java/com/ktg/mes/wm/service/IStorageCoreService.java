package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.tx.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IStorageCoreService {
    /**
     * 处理物料入库单
     */
    void processItemRecpt(List<ItemRecptTxBean> lines);

    /**
     * 处理杂项入库单
     */
    void processMiscRecpt(List<MiscRecptTxBean> lines);

    /**
     * 处理供应商退货单
     */
    void processRtVendor(List<RtVendorTxBean> lines);

    /**
     * 处理生产领料
     */
    void processIssue(List<IssueTxBean> lines);


    void processMiscIssue(List<MiscIssueTxBean> lines);

    /**
     * 处理外协领料
     */
    void processOutsourceIssue(List<OutsourceIssueTxBean> lines);

    /**
     * 处理外协入库
     */
    void processOutsourceRecpt(List<OutsourceRecptTxBean> lines);

    /**
     * 处理生产退料
     */
    void processRtIssue(List<RtIssueTxBean> lines);

    /**
     * 处理生产消耗
     */
    void processItemConsume(List<ItemConsumeTxBean> lines);

    /**
     * 处理产品产出
     */
    void processProductProduce(List<ProductProductTxBean> lines);

    /**
     * 处理产品入库
     */
    void processProductRecpt(List<ProductRecptTxBean> lines);

    /**
     * 处理产品销售出库
     */
    void processProductSales(List<ProductSalesTxBean> lines);

    /**
     * 处理销售退货
     */
    void processRtSales(List<RtSalesTxBean> lines);

    /**
     * 处理转移单
     */
    void processTransfer(List<TransferTxBean> lines);
}
