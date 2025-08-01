package com.ktg.mes.md.mapper;

import com.ktg.common.core.domain.entity.ItemType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface ItemTypeMapper {

    /**
     * 根据条件查询物料分类
     */
    public List<ItemType> selectItemTypeList(ItemType itemType);

    /**
     * 根据主键查询物料分类
     */
    public ItemType selectItemTypeById(Long itemTypeId);

    /**
     * 根据分类名称查找分类
     * 在重名的情况下，支持按【上级分类】/【下级分类】的模式进行查找
     * @param itemTypeName 分类名称
     */
    public List<ItemType> selectItemTypeByName(String itemTypeName);

    /**
     * 根据父类ID查询是否有子类
     * @param parentTypeId 父分类ID
     */
    public Integer hasChildByItemTypeId(Long parentTypeId);

    /**
     * 根据物料分类查询是否有对应的物料和产品
     * @param itemTypeId 物料分类ID
     */
    public Integer hasItemByItemTypeId(Long itemTypeId);

    /**
     * 根据父类查询所有子类
     * @param parentTypeId 父分类ID
     */
    public List<ItemType> selectChildrenItemTypeById(Long parentTypeId);


    /**
     * 查询是否有可用的子类
     * @param parentTypeId 父分类ID
     */
    public Integer selectNormalChildrenItemTypeById(Long parentTypeId);

    /**
     * 检查同一个父类下子类名称是否重复
     * @param itemTypeName 分类名称
     * @param parentTypeId 父分类ID
     */
    public ItemType checkItemTypeNameUnique(@Param("itemTypeName") String itemTypeName,@Param("parentTypeId") Long parentTypeId);

    /**
     * 检查同一个父类下子类编码是否重复
     * @param itemTypeCode 分类名称
     * @param parentTypeId 父分类ID
     */
    public ItemType checkItemTypeCodeUnique(@Param("itemTypeCode") String itemTypeCode,@Param("parentTypeId") Long parentTypeId);

    /**
     * 新增物料分类
     */
    public Integer insertItemType(ItemType itemType);

    /**
     * 更新物料分类
     */
    public Integer updateItemType(ItemType itemType);

    /**
     * 根据主键删除物料分类
     * @param itemTypeId 物料分类ID
     */
    public Integer deleteItemTypeById(Long itemTypeId);
}
