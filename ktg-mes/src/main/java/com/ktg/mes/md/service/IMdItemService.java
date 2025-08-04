package com.ktg.mes.md.service;

import com.ktg.mes.md.domain.MdItem;
import java.util.List;

public interface IMdItemService {
    /**
     * 根据条件查询物料编码
     */
    List<MdItem> selectMdItemList(MdItem mdItem);

    /**
     * 获取导出格式的物料产品清单
     * 主要区别是物料分类会以【父级分类】/【子集分类】的方式组合
     */
    List<MdItem> getExeportList(MdItem mdItem);

    /**
     * 导入物料信息
     * @param itemList
     * @param isUpdateSupport
     * @param operName
     */
    String importItem(List<MdItem> itemList, Boolean isUpdateSupport, String operName);

    /**
     * 根据主键查询物料编码
     * @param itemId
     */
    MdItem selectMdItemById(Long itemId);

    /**
     * 检查物料编码是否唯一
     */
    String checkItemCodeUnique(MdItem mdItem);

    /**
     * 检查物料名称是否唯一
     */
    String checkItemNameUnique(MdItem mdItem);

    /**
     * 新增物料编码
     */
    int insertMdItem(MdItem mdItem);

    /**
     * 更新物料编码
     */
    int updateMdItem(MdItem mdItem);

    /**
     * 批量删除物料编码
     * @param itemIds
     */
    int deleteByItemIds(Long[] itemIds);
}

