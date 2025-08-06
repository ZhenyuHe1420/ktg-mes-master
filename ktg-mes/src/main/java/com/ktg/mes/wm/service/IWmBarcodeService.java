package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.WmBarcode;
import java.util.List;

/**
 * 条码清单Service接口
 */
public interface IWmBarcodeService 
{
    /**
     * 查询条码清单
     * @param barcodeId 条码清单主键
     * @return 条码清单
     */
    WmBarcode selectWmBarcodeByBarcodeId(Long barcodeId);

    /**
     * 查询条码清单列表
     * @param wmBarcode 条码清单
     * @return 条码清单集合
     */
    List<WmBarcode> selectWmBarcodeList(WmBarcode wmBarcode);

    /**
     * 根据条码类型和业务内容ID判断条码是否已存在
     */
    String checkBarcodeUnique(WmBarcode wmBarcode);

    /**
     * 新增条码清单
     * @param wmBarcode 条码清单
     */
    int insertWmBarcode(WmBarcode wmBarcode);

    /**
     * 修改条码清单
     * @param wmBarcode 条码清单
     */
    int updateWmBarcode(WmBarcode wmBarcode);

    /**
     * 批量删除条码清单
     * @param barcodeIds 需要删除的条码清单主键集合
     */
    int deleteWmBarcodeByBarcodeIds(Long[] barcodeIds);

    /**
     * 根据条码记录生成实际的条码，返回对应的url地址
     */
    String generateBarcode(WmBarcode wmBarcode);
}
