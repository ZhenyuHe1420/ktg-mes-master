package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmBatch;

/**
 * 批次记录Service接口
 */
public interface IWmBatchService 
{
    /**
     * 查询批次记录
     * @param batchId 批次记录主键
     * @return 批次记录
     */
    WmBatch selectWmBatchByBatchId(Long batchId);

    /**
     * 查询批次记录列表
     * @param wmBatch 批次记录
     * @return 批次记录集合
     */
    List<WmBatch> selectWmBatchList(WmBatch wmBatch);

    /**
     * 根据批次号查询，当前批次被哪些工单的哪些批次产品给消耗掉了
     * @param batchCode
     */
    List<WmBatch> selectForwardBatchList(String batchCode);

    /**
     * 根据批次号查询，当前批次的产品都用到了哪些批次的物资
     * @param batchCode
     */
    List<WmBatch> selectBackwardBatchList(String batchCode);

    /**
     * 新增批次记录
     * @param wmBatch 批次记录
     */
    int insertWmBatch(WmBatch wmBatch);

    /**
     * 修改批次记录
     * @param wmBatch 批次记录
     */
    int updateWmBatch(WmBatch wmBatch);

    /**
     * 批量删除批次记录
     * @param batchIds 需要删除的批次记录主键集合
     */
    int deleteWmBatchByBatchIds(Long[] batchIds);

    /**
     * 获取批次号
     * 根据传入的完整参数获取批次号
     * 如果根据参数可以查询到批次号，则返回批次号，否则生成新的批次号
     */
    WmBatch getOrGenerateBatchCode(WmBatch wmBatch);
}
