package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmOutsourceRecpt;
import com.ktg.mes.wm.domain.tx.OutsourceRecptTxBean;

/**
 * 外协入库单Service接口
 */
public interface IWmOutsourceRecptService 
{
    /**
     * 查询外协入库单
     * @param recptId 外协入库单主键
     * @return 外协入库单
     */
    WmOutsourceRecpt selectWmOutsourceRecptByRecptId(Long recptId);

    /**
     * 查询外协入库单列表
     * @param wmOutsourceRecpt 外协入库单
     * @return 外协入库单集合
     */
    List<WmOutsourceRecpt> selectWmOutsourceRecptList(WmOutsourceRecpt wmOutsourceRecpt);

    /**
     * 新增外协入库单
     * @param wmOutsourceRecpt 外协入库单
     */
    int insertWmOutsourceRecpt(WmOutsourceRecpt wmOutsourceRecpt);

    /**
     * 修改外协入库单
     * @param wmOutsourceRecpt 外协入库单
     */
    int updateWmOutsourceRecpt(WmOutsourceRecpt wmOutsourceRecpt);

    /**
     * 批量删除外协入库单
     * @param recptIds 需要删除的外协入库单主键集合
     */
    int deleteWmOutsourceRecptByRecptIds(Long[] recptIds);

    /**
     * 获取执行入库的TxBeans
     * @param recptId
     */
    List<OutsourceRecptTxBean> getTxBeans(Long recptId);

    /**
     * 校验编码是否唯一
     */
    String checkIssueCodeUnique(WmOutsourceRecpt wmOutsourceRecpt);
}
