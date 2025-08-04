package com.ktg.mes.md.mapper;

import java.util.List;
import com.ktg.mes.md.domain.MdProductSop;

/**
 * 产品SOPMapper接口
 */
public interface MdProductSopMapper
{
    /**
     * 查询产品SOP
     * @param sopId 产品SOP主键
     * @return 产品SOP
     */
    MdProductSop selectMdProductSopBySopId(Long sopId);

    /**
     * 查询产品SOP列表
     * @param mdProductSop 产品SOP
     * @return 产品SOP集合
     */
    List<MdProductSop> selectMdProductSopList(MdProductSop mdProductSop);

    /**
     * 新增产品SOP
     * @param mdProductSop 产品SOP
     */
    int insertMdProductSop(MdProductSop mdProductSop);

    /**
     * 修改产品SOP
     * @param mdProductSop 产品SOP
     */
    int updateMdProductSop(MdProductSop mdProductSop);

    /**
     * 批量删除产品SOP
     * @param sopIds 需要删除的数据主键集合
     */
    int deleteMdProductSopBySopIds(Long[] sopIds);
}
