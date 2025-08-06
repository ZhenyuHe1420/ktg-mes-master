package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmOutsourceRecptDetail;

/**
 * 外协入库单明细Mapper接口
 */
public interface WmOutsourceRecptDetailMapper 
{
    /**
     * 查询外协入库单明细
     * @param detailId 外协入库单明细主键
     * @return 外协入库单明细
     */
    WmOutsourceRecptDetail selectWmOutsourceRecptDetailByDetailId(Long detailId);

    /**
     * 查询外协入库单明细列表
     * @param wmOutsourceRecptDetail 外协入库单明细
     * @return 外协入库单明细集合
     */
    List<WmOutsourceRecptDetail> selectWmOutsourceRecptDetailList(WmOutsourceRecptDetail wmOutsourceRecptDetail);

    /**
     * 检查某一行的明细数量是不是超出行上的数量
     * Y:超出
     * N:没超出
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增外协入库单明细
     * @param wmOutsourceRecptDetail 外协入库单明细
     */
    int insertWmOutsourceRecptDetail(WmOutsourceRecptDetail wmOutsourceRecptDetail);

    /**
     * 修改外协入库单明细
     * @param wmOutsourceRecptDetail 外协入库单明细
     */
    int updateWmOutsourceRecptDetail(WmOutsourceRecptDetail wmOutsourceRecptDetail);

    /**
     * 批量删除外协入库单明细
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmOutsourceRecptDetailByDetailIds(Long[] detailIds);
}
