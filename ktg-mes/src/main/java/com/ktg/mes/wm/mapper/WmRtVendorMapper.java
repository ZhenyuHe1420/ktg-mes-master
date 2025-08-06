package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmRtVendor;
import com.ktg.mes.wm.domain.tx.RtVendorTxBean;

/**
 * 供应商退货Mapper接口
 */
public interface WmRtVendorMapper 
{
    /**
     * 查询供应商退货
     * @param rtId 供应商退货主键
     * @return 供应商退货
     */
    WmRtVendor selectWmRtVendorByRtId(Long rtId);

    /**
     * 查询供应商退货列表
     * @param wmRtVendor 供应商退货
     * @return 供应商退货集合
     */
    List<WmRtVendor> selectWmRtVendorList(WmRtVendor wmRtVendor);

    /**
     * 检查供应商退货单编码是否唯一
     */
    WmRtVendor checkCodeUnique(WmRtVendor wmRtVendor);

    /**
     * 新增供应商退货
     * @param wmRtVendor 供应商退货
     */
    int insertWmRtVendor(WmRtVendor wmRtVendor);

    /**
     * 修改供应商退货
     * @param wmRtVendor 供应商退货
     */
    int updateWmRtVendor(WmRtVendor wmRtVendor);

    /**
     * 批量删除供应商退货
     * @param rtIds 需要删除的数据主键集合
     */
    int deleteWmRtVendorByRtIds(Long[] rtIds);

    List<RtVendorTxBean> getTxBeans(Long rtId);
}
