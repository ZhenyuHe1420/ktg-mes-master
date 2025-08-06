package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmProductRecptDetail;

/**
 * 产品入库记录明细Mapper接口
 */
public interface WmProductRecptDetailMapper 
{
    /**
     * 查询产品入库记录明细
     * @param detailId 产品入库记录明细主键
     * @return 产品入库记录明细
     */
    WmProductRecptDetail selectWmProductRecptDetailByDetailId(Long detailId);

    /**
     * 查询产品入库记录明细列表
     * @param wmProductRecptDetail 产品入库记录明细
     * @return 产品入库记录明细集合
     */
    List<WmProductRecptDetail> selectWmProductRecptDetailList(WmProductRecptDetail wmProductRecptDetail);

    /**
     * 效验产品入库行与明细行数量是否一致
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增产品入库记录明细
     * @param wmProductRecptDetail 产品入库记录明细
     */
    int insertWmProductRecptDetail(WmProductRecptDetail wmProductRecptDetail);

    /**
     * 修改产品入库记录明细
     * @param wmProductRecptDetail 产品入库记录明细
     */
    int updateWmProductRecptDetail(WmProductRecptDetail wmProductRecptDetail);

    /**
     * 批量删除产品入库记录明细
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmProductRecptDetailByDetailIds(Long[] detailIds);
}
