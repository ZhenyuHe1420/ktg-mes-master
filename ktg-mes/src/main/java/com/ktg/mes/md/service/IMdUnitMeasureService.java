package com.ktg.mes.md.service;

import com.ktg.mes.md.domain.MdUnitMeasure;
import java.util.List;

/**
 * 单位
 */
public interface IMdUnitMeasureService
{
    /**
     * 查询单位
     * @param measureId 单位主键
     * @return 单位
     */
    public MdUnitMeasure selectMdUnitMeasureByMeasureId(Long measureId);

    /**
     * 计量单位唯一校验
     * @param mdUnitMeasure 单位主键
     * @return 单位
     */
    public String checkMeasureUnitCodeUnique(MdUnitMeasure mdUnitMeasure);

    /**
     * 查询单位列表
     * @param mdUnitMeasure 单位
     * @return 单位集合
     */
    public List<MdUnitMeasure> selectMdUnitMeasureList(MdUnitMeasure mdUnitMeasure);

    /**
     * 根据单位编码查询单位名称
     * @param unitCode
     */
    public MdUnitMeasure selectMdUnitByCode(String unitCode);

    /**
     * 新增单位
     * @param mdUnitMeasure 单位
     */
    public int insertMdUnitMeasure(MdUnitMeasure mdUnitMeasure);

    /**
     * 修改单位
     * @param mdUnitMeasure 单位
     */
    public int updateMdUnitMeasure(MdUnitMeasure mdUnitMeasure);

    /**
     * 批量删除单位
     * @param measureIds 需要删除的单位主键集合
     */
    public int deleteMdUnitMeasureByMeasureIds(Long[] measureIds);
}
