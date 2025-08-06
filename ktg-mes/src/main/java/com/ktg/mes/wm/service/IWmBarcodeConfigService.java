package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmBarcodeConfig;

/**
 * 条码配置Service接口
 */
public interface IWmBarcodeConfigService 
{
    /**
     * 查询条码配置
     * @param configId 条码配置主键
     * @return 条码配置
     */
    WmBarcodeConfig selectWmBarcodeConfigByConfigId(Long configId);

    /**
     * 查询条码配置列表
     * @param wmBarcodeConfig 条码配置
     * @return 条码配置集合
     */
    List<WmBarcodeConfig> selectWmBarcodeConfigList(WmBarcodeConfig wmBarcodeConfig);

    /**
     * 新增条码配置
     * @param wmBarcodeConfig 条码配置
     */
    int insertWmBarcodeConfig(WmBarcodeConfig wmBarcodeConfig);

    /**
     * 修改条码配置
     * @param wmBarcodeConfig 条码配置
     */
    int updateWmBarcodeConfig(WmBarcodeConfig wmBarcodeConfig);

    /**
     * 批量删除条码配置
     * @param configIds 需要删除的条码配置主键集合
     */
    int deleteWmBarcodeConfigByConfigIds(Long[] configIds);

    /**
     * 判断某种类型的业务是否需要自动生成赋码
     * @param barcodeType
     */
    boolean isAutoGen(String barcodeType);
}
