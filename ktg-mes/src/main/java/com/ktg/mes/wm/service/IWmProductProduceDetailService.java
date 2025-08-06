package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmProductProduceDetail;

/**
 * 产品产出记录明细Service接口
 */
public interface IWmProductProduceDetailService 
{
    /**
     * 查询产品产出记录明细
     * @param detailId 产品产出记录明细主键
     * @return 产品产出记录明细
     */
    WmProductProduceDetail selectWmProductProduceDetailByDetailId(Long detailId);

    /**
     * 查询产品产出记录明细列表
     * @param wmProductProduceDetail 产品产出记录明细
     * @return 产品产出记录明细集合
     */
    List<WmProductProduceDetail> selectWmProductProduceDetailList(WmProductProduceDetail wmProductProduceDetail);

    /**
     * 新增产品产出记录明细
     * @param wmProductProduceDetail 产品产出记录明细
     */
    int insertWmProductProduceDetail(WmProductProduceDetail wmProductProduceDetail);

    /**
     * 修改产品产出记录明细
     * @param wmProductProduceDetail 产品产出记录明细
     */
    int updateWmProductProduceDetail(WmProductProduceDetail wmProductProduceDetail);

    /**
     * 批量删除产品产出记录明细
     * @param detailIds 需要删除的产品产出记录明细主键集合
     */
    int deleteWmProductProduceDetailByDetailIds(Long[] detailIds);
}
