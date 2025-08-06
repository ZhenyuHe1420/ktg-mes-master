package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProFeedback;
import com.ktg.mes.wm.domain.WmProductProduce;
import com.ktg.mes.wm.domain.tx.ProductProductTxBean;

/**
 * 产品产出记录Service接口
 */
public interface IWmProductProduceService 
{
    /**
     * 查询产品产出记录
     * @param recordId 产品产出记录主键
     * @return 产品产出记录
     */
    WmProductProduce selectWmProductProduceByRecordId(Long recordId);

    /**
     * 查询产品产出记录列表
     * @param wmProductProduce 产品产出记录
     * @return 产品产出记录集合
     */
    List<WmProductProduce> selectWmProductProduceList(WmProductProduce wmProductProduce);

    /**
     * 新增产品产出记录
     * @param wmProductProduce 产品产出记录
     */
    int insertWmProductProduce(WmProductProduce wmProductProduce);

    /**
     * 修改产品产出记录
     * @param wmProductProduce 产品产出记录
     */
    int updateWmProductProduce(WmProductProduce wmProductProduce);

    /**
     * 批量删除产品产出记录
     * @param recordIds 需要删除的产品产出记录主键集合
     */
    int deleteWmProductProduceByRecordIds(Long[] recordIds);

    /**
     * 根据报工记录生成对应的产品产出记录
     */
    WmProductProduce generateProductProduce(ProFeedback feedback);

    List<ProductProductTxBean> getTxBeans(Long recordId);

    void executeProductProduce(WmProductProduce wmProductProduce);

}
