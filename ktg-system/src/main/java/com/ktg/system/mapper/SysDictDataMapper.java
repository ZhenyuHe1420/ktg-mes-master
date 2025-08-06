package com.ktg.system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.ktg.common.core.domain.entity.SysDictData;

/**
 * 字典表 数据层
 */
public interface SysDictDataMapper
{
    /**
     * 根据条件分页查询字典数据
     * @param dictData 字典数据信息
     * @return 字典数据集合信息
     */
    List<SysDictData> selectDictDataList(SysDictData dictData);

    /**
     * 根据字典类型查询字典数据
     * @param dictType 字典类型
     * @return 字典数据集合信息
     */
    List<SysDictData> selectDictDataByType(String dictType);

    /**
     * 根据字典类型和字典键值查询字典数据信息
     * @param dictType 字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    String selectDictLabel(@Param("dictType") String dictType, @Param("dictValue") String dictValue);

    /**
     * 根据字典数据ID查询信息
     * @param dictCode 字典数据ID
     * @return 字典数据
     */
    SysDictData selectDictDataById(Long dictCode);

    /**
     * 查询字典数据
     * @param dictType 字典类型
     * @return 字典数据
     */
    int countDictDataByType(String dictType);

    /**
     * 通过字典ID删除字典数据信息
     * @param dictCode 字典数据ID
     */
    int deleteDictDataById(Long dictCode);

    /**
     * 新增字典数据信息
     * @param dictData 字典数据信息
     */
    int insertDictData(SysDictData dictData);

    /**
     * 修改字典数据信息
     * @param dictData 字典数据信息
     */
    int updateDictData(SysDictData dictData);

    /**
     * 同步修改字典类型
     * @param oldDictType 旧字典类型
     * @param newDictType 新旧字典类型
     */
    int updateDictDataType(@Param("oldDictType") String oldDictType, @Param("newDictType") String newDictType);
}
