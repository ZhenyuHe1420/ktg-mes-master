package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmMiscRecpt;
import com.ktg.mes.wm.domain.tx.MiscRecptTxBean;

/**
 * 杂项入库单Mapper接口
 */
public interface WmMiscRecptMapper 
{
    /**
     * 查询杂项入库单
     * @param recptId 杂项入库单主键
     * @return 杂项入库单
     */
    WmMiscRecpt selectWmMiscRecptByRecptId(Long recptId);

    /**
     * 查询杂项入库单列表
     * @param wmMiscRecpt 杂项入库单
     * @return 杂项入库单集合
     */
    List<WmMiscRecpt> selectWmMiscRecptList(WmMiscRecpt wmMiscRecpt);

    WmMiscRecpt checkRecptCodeUnique(WmMiscRecpt wmMiscRecpt);

    List<MiscRecptTxBean> getTxBeans(Long recptId);

    /**
     * 新增杂项入库单
     * @param wmMiscRecpt 杂项入库单
     */
    int insertWmMiscRecpt(WmMiscRecpt wmMiscRecpt);

    /**
     * 修改杂项入库单
     * @param wmMiscRecpt 杂项入库单
     */
    int updateWmMiscRecpt(WmMiscRecpt wmMiscRecpt);

    /**
     * 批量删除杂项入库单
     * @param recptIds 需要删除的数据主键集合
     */
    int deleteWmMiscRecptByRecptIds(Long[] recptIds);
}
