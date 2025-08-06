package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmItemConsumeDetail;

/**
 * 物料消耗记录明细Service接口
 */
public interface IWmItemConsumeDetailService 
{
    /**
     * 查询物料消耗记录明细
     * @param detailId 物料消耗记录明细主键
     * @return 物料消耗记录明细
     */
    WmItemConsumeDetail selectWmItemConsumeDetailByDetailId(Long detailId);

    /**
     * 查询物料消耗记录明细列表
     * @param wmItemConsumeDetail 物料消耗记录明细
     * @return 物料消耗记录明细集合
     */
    List<WmItemConsumeDetail> selectWmItemConsumeDetailList(WmItemConsumeDetail wmItemConsumeDetail);

    /**
     * 新增物料消耗记录明细
     * @param wmItemConsumeDetail 物料消耗记录明细
     */
    int insertWmItemConsumeDetail(WmItemConsumeDetail wmItemConsumeDetail);

    /**
     * 修改物料消耗记录明细
     * @param wmItemConsumeDetail 物料消耗记录明细
     */
    int updateWmItemConsumeDetail(WmItemConsumeDetail wmItemConsumeDetail);

    /**
     * 批量删除物料消耗记录明细
     * @param detailIds 需要删除的物料消耗记录明细主键集合
     */
    int deleteWmItemConsumeDetailByDetailIds(Long[] detailIds);
}
