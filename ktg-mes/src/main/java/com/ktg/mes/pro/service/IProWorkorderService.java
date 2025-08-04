package com.ktg.mes.pro.service;

import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.pro.domain.ProWorkorder;

import java.util.List;

/**
 * 生产工单Service接口
 */
public interface IProWorkorderService
{
    /**
     * 查询生产工单
     * @param workorderId 生产工单主键
     * @return 生产工单
     */
    ProWorkorder selectProWorkorderByWorkorderId(Long workorderId);

    /**
     * 查询生产工单
     * @param workorderId 生产工单主键
     * @return 生产工单
     */
    List<ProWorkorder> selectProWorkorderListByParentId(Long workorderId);

    /**
     * 查询生产工单列表
     * @param proWorkorder 生产工单
     * @return 生产工单集合
     */
    List<ProWorkorder> selectProWorkorderList(ProWorkorder proWorkorder);

    String checkWorkorderCodeUnique(ProWorkorder proWorkorder);

    /**
     * 新增生产工单
     * @param proWorkorder 生产工单
     */
    int insertProWorkorder(ProWorkorder proWorkorder);

    /**
     * 修改生产工单
     * @param proWorkorder 生产工单
     */
    int updateProWorkorder(ProWorkorder proWorkorder);

    /**
     * 批量删除生产工单
     * @param workorderIds 需要删除的生产工单主键集合
     */
    int deleteProWorkorderByWorkorderIds(Long[] workorderIds);

    /**
     * 首页生产工单查询
     */
    AjaxResult getHomeList(ProWorkorder proWorkorder);
}
