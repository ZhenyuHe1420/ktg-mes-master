package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.WmTransaction;

/**
 * 库存事务Mapper接口
 */
public interface WmTransactionMapper 
{
    /**
     * 新增库存事务
     * @param wmTransaction 库存事务
     */
    int insertWmTransaction(WmTransaction wmTransaction);
}
