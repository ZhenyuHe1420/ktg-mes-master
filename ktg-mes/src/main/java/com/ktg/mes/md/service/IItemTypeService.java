package com.ktg.mes.md.service;

import com.ktg.common.core.domain.TreeSelect;
import com.ktg.common.core.domain.entity.ItemType;
import java.util.List;

public interface IItemTypeService {

    List<ItemType> selectItemTypeList(ItemType itemType);

    ItemType selectItemTypeById(Long itemTypeId);

    List<TreeSelect> buildTreeSelect(List<ItemType> list);

    String checkItemTypeCodeUnique(ItemType itemType);

    String checkItemTypeNameUnique(ItemType itemType);

    Integer insertItemType(ItemType itemType);

    Integer updateItemType(ItemType itemType);

    Integer removeItemType(Long itemTypeId);

    boolean checkHasChild(Long itemTypeId);

    boolean checkHasItem(Long itemTypeId);
}
