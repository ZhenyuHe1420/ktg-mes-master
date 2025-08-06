package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmTransferDetail;

/**
 * 转移调拨单明细Mapper接口
 */
public interface WmTransferDetailMapper 
{
    /**
     * 查询转移调拨单明细
     * @param detailId 转移调拨单明细主键
     * @return 转移调拨单明细
     */
    WmTransferDetail selectWmTransferDetailByDetailId(Long detailId);

    /**
     * 查询转移调拨单明细列表
     * @param wmTransferDetail 转移调拨单明细
     * @return 转移调拨单明细集合
     */
    List<WmTransferDetail> selectWmTransferDetailList(WmTransferDetail wmTransferDetail);

    /**
     * 检查明细行总数量与行数量是否一致
     * @param lineId
     */
    String checkQuantity(Long lineId);

    /**
     * 新增转移调拨单明细
     * @param wmTransferDetail 转移调拨单明细
     */
    int insertWmTransferDetail(WmTransferDetail wmTransferDetail);

    /**
     * 修改转移调拨单明细
     * @param wmTransferDetail 转移调拨单明细
     */
    int updateWmTransferDetail(WmTransferDetail wmTransferDetail);

    /**
     * 批量删除转移调拨单明细
     * @param detailIds 需要删除的数据主键集合
     */
    int deleteWmTransferDetailByDetailIds(Long[] detailIds);
}
