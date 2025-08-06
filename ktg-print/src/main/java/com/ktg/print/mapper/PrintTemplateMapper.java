package com.ktg.print.mapper;

import java.util.List;
import com.ktg.print.domain.PrintTemplate;

/**
 * 打印模板配置Mapper接口
 */
public interface PrintTemplateMapper 
{
    /**
     * 查询打印模板配置
     * @param templateId 打印模板配置主键
     * @return 打印模板配置
     */
    PrintTemplate selectPrintTemplateByTemplateId(Long templateId);

    /**
     * 查询打印模板配置列表
     * @param printTemplate 打印模板配置
     * @return 打印模板配置集合
     */
    List<PrintTemplate> selectPrintTemplateList(PrintTemplate printTemplate);

    /**
     * 新增打印模板配置
     * @param printTemplate 打印模板配置
     */
    int insertPrintTemplate(PrintTemplate printTemplate);

    /**
     * 修改打印模板配置
     * @param printTemplate 打印模板配置
     */
    int updatePrintTemplate(PrintTemplate printTemplate);

    /**
     * 批量删除打印模板配置
     * @param templateIds 需要删除的数据主键集合
     */
    int deletePrintTemplateByTemplateIds(Long[] templateIds);
}
