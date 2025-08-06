package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmProductProduceDetail;

/**
 * 产品产出记录明细Mapper接口
 */
public interface WmProductProduceDetailMapper 
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
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmProductProduceDetailByDetailIds(Long[] detailIds);
}
