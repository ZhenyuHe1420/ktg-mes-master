package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtVendorLine;

/**
 * 供应商退货行Mapper接口
 */
public interface WmRtVendorLineMapper 
{
    /**
     * 查询供应商退货行
     * @param lineId 供应商退货行主键
     * @return 供应商退货行
     */
    WmRtVendorLine selectWmRtVendorLineByLineId(Long lineId);

    /**
     * 查询供应商退货行列表
     * @param wmRtVendorLine 供应商退货行
     * @return 供应商退货行集合
     */
    List<WmRtVendorLine> selectWmRtVendorLineList(WmRtVendorLine wmRtVendorLine);

    /**
     * 查询供应商退货行列表（含明细）
     */
    List<WmRtVendorLine> selectWmRtVendorLineListWithDetail(WmRtVendorLine wmRtVendorLine);

    /**
     * 新增供应商退货行
     * @param wmRtVendorLine 供应商退货行
     */
    int insertWmRtVendorLine(WmRtVendorLine wmRtVendorLine);

    /**
     * 修改供应商退货行
     * @param wmRtVendorLine 供应商退货行
     */
    int updateWmRtVendorLine(WmRtVendorLine wmRtVendorLine);

    /**
     * 批量删除供应商退货行
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmRtVendorLineByLineIds(Long[] lineIds);

    int deleteByRtId(Long rtId);
}
