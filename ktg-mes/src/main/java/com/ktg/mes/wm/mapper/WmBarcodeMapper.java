package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.WmBarcode;
import java.util.List;

/**
 * 条码清单Mapper接口
 */
public interface WmBarcodeMapper 
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
     * 检查当前条码类型下，对应的业务是否已经生成了条码
     */
    WmBarcode checkBarcodeUnique(WmBarcode wmBarcode);

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
     * @param barcodeIds 需要删除的数据主键集合
     */
    int deleteWmBarcodeByBarcodeIds(Long[] barcodeIds);
}
