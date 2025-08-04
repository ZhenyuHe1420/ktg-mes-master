package com.ktg.mes.md.service;

import java.util.List;
import com.ktg.mes.md.domain.MdItemBatchConfig;

/**
 * 物料批次属性配置Service接口
 */
public interface IMdItemBatchConfigService 
{
    /**
     * 查询物料批次属性配置列表
     * @param mdItemBatchConfig 物料批次属性配置
     * @return 物料批次属性配置集合
     */
    List<MdItemBatchConfig> selectMdItemBatchConfigList(MdItemBatchConfig mdItemBatchConfig);

    /**
     * 根据物料ID查询批次属性配置
     * @param itemId
     */
    MdItemBatchConfig getMdItemBatchConfigByItemId(Long itemId);

    /**
     * 新增物料批次属性配置
     * @param mdItemBatchConfig 物料批次属性配置
     */
    int insertMdItemBatchConfig(MdItemBatchConfig mdItemBatchConfig);

    /**
     * 修改物料批次属性配置
     * @param mdItemBatchConfig 物料批次属性配置
     */
    int updateMdItemBatchConfig(MdItemBatchConfig mdItemBatchConfig);

    /**
     * 批量删除物料批次属性配置
     * @param configIds 需要删除的物料批次属性配置主键集合
     */
    int deleteMdItemBatchConfigByConfigIds(Long[] configIds);
}
