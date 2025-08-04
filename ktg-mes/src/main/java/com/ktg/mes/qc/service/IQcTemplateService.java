package com.ktg.mes.qc.service;

import java.util.List;

import com.ktg.mes.qc.domain.QcTemplate;

/**
 * 检测模板Service接口
 */
public interface IQcTemplateService 
{
    /**
     * 查询检测模板
     * @param templateId 检测模板主键
     * @return 检测模板
     */
    QcTemplate selectQcTemplateByTemplateId(Long templateId);

    /**
     * 查询检测模板列表
     * @param qcTemplate 检测模板
     * @return 检测模板集合
     */
    List<QcTemplate> selectQcTemplateList(QcTemplate qcTemplate);

    /**
     * 根据检测类型和产品查找对应的检测模板
     */
    QcTemplate selectQcTemplateByProductAndQcType(QcTemplate qcTemplate);

    /**
     * 检测模板编号是否唯一
     */
    String checkTemplateCodeUnique(QcTemplate qcTemplate);

    /**
     * 新增检测模板
     * @param qcTemplate 检测模板
     */
    int insertQcTemplate(QcTemplate qcTemplate);

    /**
     * 修改检测模板
     * @param qcTemplate 检测模板
     */
    int updateQcTemplate(QcTemplate qcTemplate);

    /**
     * 批量删除检测模板
     * @param templateIds 需要删除的检测模板主键集合
     */
    int deleteQcTemplateByTemplateIds(Long[] templateIds);
}
