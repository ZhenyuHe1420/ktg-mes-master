package com.ktg.mes.qc.mapper;

import java.util.List;
import com.ktg.mes.qc.domain.QcTemplateProduct;

/**
 * 检测模板-产品Mapper接口
 */
public interface QcTemplateProductMapper 
{
    /**
     * 查询检测模板-产品
     * @param recordId 检测模板-产品主键
     * @return 检测模板-产品
     */
    QcTemplateProduct selectQcTemplateProductByRecordId(Long recordId);

    /**
     * 查询检测模板-产品列表
     * @param qcTemplateProduct 检测模板-产品
     * @return 检测模板-产品集合
     */
    List<QcTemplateProduct> selectQcTemplateProductList(QcTemplateProduct qcTemplateProduct);

    QcTemplateProduct checkProductUnique(QcTemplateProduct qcTemplateProduct);

    /**
     * 新增检测模板-产品
     * @param qcTemplateProduct 检测模板-产品
     */
    int insertQcTemplateProduct(QcTemplateProduct qcTemplateProduct);

    /**
     * 修改检测模板-产品
     * @param qcTemplateProduct 检测模板-产品
     */
    int updateQcTemplateProduct(QcTemplateProduct qcTemplateProduct);

    /**
     * 批量删除检测模板-产品
     * @param recordIds 需要删除的数据主键集合
     */
    int deleteQcTemplateProductByRecordIds(Long[] recordIds);

    int deleteByTemplateId(Long templateId);
}
