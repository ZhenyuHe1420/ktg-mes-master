package com.ktg.print.service;

import com.ktg.print.domain.PrintBarcodeModel;
import java.util.Map;

/**
 * 打印模板配置Service接口
 */
public interface IPrintService
{
    /**
     * 标签打印
     */
    Map<String,Object> printLabel(PrintBarcodeModel printBarcodeModel);
}
