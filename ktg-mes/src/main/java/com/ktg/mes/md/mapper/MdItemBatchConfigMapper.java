package com.ktg.mes.md.mapper;

import java.util.List;
import com.ktg.mes.md.domain.MdItemBatchConfig;

/**
 * 物料批次属性配置Mapper接口
 */
public interface MdItemBatchConfigMapper 
{
    /**
     * 查询物料批次属性配置列表
     * @param mdItemBatchConfig 物料批次属性配置
     * @return 物料批次属性配置集合
     */
    List<MdItemBatchConfig> selectMdItemBatchConfigList(MdItemBatchConfig mdItemBatchConfig);

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
     * @param configIds 需要删除的数据主键集合
     */
    int deleteMdItemBatchConfigByConfigIds(Long[] configIds);
}
