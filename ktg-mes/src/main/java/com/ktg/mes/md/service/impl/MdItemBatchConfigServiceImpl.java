package com.ktg.mes.md.service.impl;

import java.util.List;
import com.ktg.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ktg.mes.md.mapper.MdItemBatchConfigMapper;
import com.ktg.mes.md.domain.MdItemBatchConfig;
import com.ktg.mes.md.service.IMdItemBatchConfigService;

/**
 * 物料批次属性配置Service业务层处理
 */
@Service
public class MdItemBatchConfigServiceImpl implements IMdItemBatchConfigService 
{
    @Autowired
    private MdItemBatchConfigMapper mdItemBatchConfigMapper;

    /**
     * 查询物料批次属性配置列表
     * 
     * @param mdItemBatchConfig 物料批次属性配置
     * @return 物料批次属性配置
     */
    @Override
    public List<MdItemBatchConfig> selectMdItemBatchConfigList(MdItemBatchConfig mdItemBatchConfig)
    {
        return mdItemBatchConfigMapper.selectMdItemBatchConfigList(mdItemBatchConfig);
    }

    @Override
    public MdItemBatchConfig getMdItemBatchConfigByItemId(Long itemId) {
        return mdItemBatchConfigMapper.getMdItemBatchConfigByItemId(itemId);
    }

    /**
     * 新增物料批次属性配置
     * @param mdItemBatchConfig 物料批次属性配置
     */
    @Override
    public int insertMdItemBatchConfig(MdItemBatchConfig mdItemBatchConfig)
    {
        mdItemBatchConfig.setCreateTime(DateUtils.getNowDate());
        return mdItemBatchConfigMapper.insertMdItemBatchConfig(mdItemBatchConfig);
    }

    /**
     * 修改物料批次属性配置
     * @param mdItemBatchConfig 物料批次属性配置
     */
    @Override
    public int updateMdItemBatchConfig(MdItemBatchConfig mdItemBatchConfig)
    {
        mdItemBatchConfig.setUpdateTime(DateUtils.getNowDate());
        return mdItemBatchConfigMapper.updateMdItemBatchConfig(mdItemBatchConfig);
    }

    /**
     * 批量删除物料批次属性配置
     * @param configIds 需要删除的物料批次属性配置主键
     */
    @Override
    public int deleteMdItemBatchConfigByConfigIds(Long[] configIds)
    {
        return mdItemBatchConfigMapper.deleteMdItemBatchConfigByConfigIds(configIds);
    }
}
