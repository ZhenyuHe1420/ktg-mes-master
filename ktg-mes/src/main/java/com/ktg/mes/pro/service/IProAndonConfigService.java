package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProAndonConfig;

/**
 * 安灯呼叫配置Service接口
 */
public interface IProAndonConfigService 
{
    /**
     * 查询安灯呼叫配置
     * @param configId 安灯呼叫配置主键
     * @return 安灯呼叫配置
     */
    ProAndonConfig selectProAndonConfigByConfigId(Long configId);

    /**
     * 查询安灯呼叫配置列表
     * @param proAndonConfig 安灯呼叫配置
     * @return 安灯呼叫配置集合
     */
    List<ProAndonConfig> selectProAndonConfigList(ProAndonConfig proAndonConfig);

    /**
     * 新增安灯呼叫配置
     * @param proAndonConfig 安灯呼叫配置
     */
    int insertProAndonConfig(ProAndonConfig proAndonConfig);

    /**
     * 修改安灯呼叫配置
     * @param proAndonConfig 安灯呼叫配置
     */
    int updateProAndonConfig(ProAndonConfig proAndonConfig);

    /**
     * 批量删除安灯呼叫配置
     * @param configIds 需要删除的安灯呼叫配置主键集合
     */
    int deleteProAndonConfigByConfigIds(Long[] configIds);
}
