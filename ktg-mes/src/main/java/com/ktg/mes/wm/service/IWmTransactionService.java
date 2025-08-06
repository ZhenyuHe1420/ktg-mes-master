package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.WmTransaction;

/**
 * 库存事务Service接口
 */
public interface IWmTransactionService 
{
    WmTransaction processTransaction(WmTransaction wmTransaction);
}
