package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmProductRecpt;
import com.ktg.mes.wm.domain.tx.ProductRecptTxBean;

/**
 * 产品入库录Mapper接口
 */
public interface WmProductRecptMapper 
{
    /**
     * 查询产品入库录
     * @param recptId 产品入库录主键
     * @return 产品入库录
     */
    WmProductRecpt selectWmProductRecptByRecptId(Long recptId);

    /**
     * 查询产品入库录列表
     * @param wmProductRecpt 产品入库录
     * @return 产品入库录集合
     */
    List<WmProductRecpt> selectWmProductRecptList(WmProductRecpt wmProductRecpt);

    /**
     * 检查编码唯一性
     */
    WmProductRecpt checkUnique(WmProductRecpt wmProductRecpt);

    /**
     * 新增产品入库录
     * @param wmProductRecpt 产品入库录
     */
    int insertWmProductRecpt(WmProductRecpt wmProductRecpt);

    /**
     * 修改产品入库录
     * @param wmProductRecpt 产品入库录
     */
    int updateWmProductRecpt(WmProductRecpt wmProductRecpt);

    /**
     * 批量删除产品入库录
     * @param recptIds 需要删除的数据主键集合
     */
    int deleteWmProductRecptByRecptIds(Long[] recptIds);

    List<ProductRecptTxBean> getTxBean(Long recptId);
}
