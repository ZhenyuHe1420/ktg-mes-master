package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmTransfer;
import com.ktg.mes.wm.domain.tx.TransferTxBean;

/**
 * 转移单Mapper接口
 */
public interface WmTransferMapper 
{
    /**
     * 查询转移单
     * @param transferId 转移单主键
     * @return 转移单
     */
    WmTransfer selectWmTransferByTransferId(Long transferId);

    /**
     * 查询转移单列表
     * @param wmTransfer 转移单
     * @return 转移单集合
     */
    List<WmTransfer> selectWmTransferList(WmTransfer wmTransfer);

    List<TransferTxBean> getTxBeans(Long transferId);

    /**
     * 检查编码是否唯一
     */
    WmTransfer checkUnique(WmTransfer wmTransfer);

    /**
     * 新增转移单
     * @param wmTransfer 转移单
     */
    int insertWmTransfer(WmTransfer wmTransfer);

    /**
     * 修改转移单
     * @param wmTransfer 转移单
     */
    int updateWmTransfer(WmTransfer wmTransfer);

    /**
     * 批量删除转移单
     * @param transferIds 需要删除的数据主键集合
     */
    int deleteWmTransferByTransferIds(Long[] transferIds);
}
