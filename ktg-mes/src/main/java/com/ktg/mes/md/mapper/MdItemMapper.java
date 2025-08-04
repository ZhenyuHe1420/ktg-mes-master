package com.ktg.mes.md.mapper;

import com.ktg.mes.md.domain.MdItem;
import java.util.List;

public interface MdItemMapper {
    /**
     * 根据条件查询物料编码
     */
    List<MdItem> selectMdItemList(MdItem mdItem);

    /**
     * 查询所有物料编码
     */
    List<MdItem> selectMdItemAll();

    List<MdItem> getExeportList(MdItem mdItem);

    /**
     * 根据物料ID查询物料
     * @param itemId
     */
    MdItem selectMdItemById(Long itemId);

    /**
     * 检查物料编码是否唯一
     * @param mdItem
     */
    MdItem checkItemCodeUnique(MdItem mdItem);

    /**
     * 检查物料名称是否唯一
     */
    MdItem  checkItemNameUnique(MdItem mdItem);

    /**
     * 新增物料
     */
    int insertMdItem(MdItem mdItem);

    /**
     * 更新物料
     */
    int updateMdItem(MdItem mdItem);

    /**
     * 批量删除物料
     * @param itemIds
     */
    int deleteMdItemByIds(Long[] itemIds);
}
