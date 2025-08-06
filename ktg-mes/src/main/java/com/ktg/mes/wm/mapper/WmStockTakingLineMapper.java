package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmStockTakingLine;
import org.apache.ibatis.annotations.Param;

/**
 * 库存盘点明细Mapper接口
 */
public interface WmStockTakingLineMapper 
{
    /**
     * 查询库存盘点明细
     * @param lineId 库存盘点明细主键
     * @return 库存盘点明细
     */
    WmStockTakingLine selectWmStockTakingLineByLineId(Long lineId);

    /**
     * 查询库存盘点明细列表
     * @param wmStockTakingLine 库存盘点明细
     * @return 库存盘点明细集合
     */
    List<WmStockTakingLine> selectWmStockTakingLineList(WmStockTakingLine wmStockTakingLine);

    /**
     * 根据当前行对应的盘点结果，更新盘点数量和状态
     */
    int updateTakingStatus(WmStockTakingLine wmStockTakingLine);

    /**
     * 批量冻结/解冻盘点明细中的库存物资
     */
    int updateFrozenStatus(@Param("takingId") Long takingId, @Param("frozenFlag") String frozenFlag);

    /**
     * 新增库存盘点明细
     * @param wmStockTakingLine 库存盘点明细
     */
    int insertWmStockTakingLine(WmStockTakingLine wmStockTakingLine);

    /**
     * 批量删除库存盘点明细
     * @param lineIds 需要删除的数据主键集合
     */
    int deleteWmStockTakingLineByLineIds(Long[] lineIds);

    int deleteByTakingId(Long takingId);
}
