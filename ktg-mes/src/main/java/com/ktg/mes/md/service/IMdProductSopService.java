package com.ktg.mes.md.service;

import java.util.List;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.md.domain.MdProductSop;

/**
 * 产品SOPService接口
 */
public interface IMdProductSopService
{
    /**
     * 查询产品SOP
     * @param sopId 产品SOP主键
     * @return 产品SOP
     */
    MdProductSop selectMdProductSopBySopId(Long sopId);

    /**
     * 查询产品SOP列表
     */
    List<MdProductSop> selectMdProductSopList(MdProductSop mdProductSop);

    /**
     * 新增产品SOP
     */
    AjaxResult insertMdProductSop(MdProductSop mdProductSop);

    /**
     * 修改产品SOP
     */
    AjaxResult updateMdProductSop(MdProductSop mdProductSop);

    /**
     * 批量删除产品SOP
     * @param sopIds 需要删除的产品SOP主键集合
     */
    int deleteMdProductSopBySopIds(Long[] sopIds);
}
