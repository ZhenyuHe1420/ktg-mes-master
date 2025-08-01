package com.ktg.mes.md.service.impl;

import java.util.List;

import com.ktg.common.constant.UserConstants;
import com.ktg.common.utils.StringUtils;
import com.ktg.mes.md.service.IMdUnitMeasureService;
import com.ktg.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ktg.mes.md.mapper.MdUnitMeasureMapper;
import com.ktg.mes.md.domain.MdUnitMeasure;
import static com.ktg.common.utils.SecurityUtils.getUsername;

/**
 * 计量单位
 */
@Service
public class MdUnitMeasureServiceImpl implements IMdUnitMeasureService
{
    @Autowired
    private MdUnitMeasureMapper mdUnitMeasureMapper;

    /**
     * 查询单位
     * @param measureId 单位主键
     * @return 单位
     */
    @Override
    public MdUnitMeasure selectMdUnitMeasureByMeasureId(Long measureId)
    {
        return mdUnitMeasureMapper.selectMdUnitMeasureByMeasureId(measureId);
    }

    @Override
    public String checkMeasureUnitCodeUnique(MdUnitMeasure mdUnitMeasure) {
        MdUnitMeasure unitMeasure = mdUnitMeasureMapper.checkMeasureUnitCodeUnique(mdUnitMeasure);
        Long subjectId = mdUnitMeasure.getMeasureId()== null ? -1L : mdUnitMeasure.getMeasureId();
        if(StringUtils.isNotNull(unitMeasure) && unitMeasure.getMeasureId().longValue() != subjectId.longValue()){
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 查询单位列表
     * @param mdUnitMeasure 单位
     * @return 单位
     */
    @Override
    public List<MdUnitMeasure> selectMdUnitMeasureList(MdUnitMeasure mdUnitMeasure)
    {
        return mdUnitMeasureMapper.selectMdUnitMeasureList(mdUnitMeasure);
    }

    @Override
    public MdUnitMeasure selectMdUnitByCode(String unitCode) {
        return mdUnitMeasureMapper.selectMdUnitByCode(unitCode);
    }

    /**
     * 新增单位
     * @param mdUnitMeasure 单位
     */
    @Override
    public int insertMdUnitMeasure(MdUnitMeasure mdUnitMeasure)
    {
        mdUnitMeasure.setCreateTime(DateUtils.getNowDate());
        mdUnitMeasure.setCreateBy(getUsername());
        mdUnitMeasure.setUpdateTime(DateUtils.getNowDate());
        mdUnitMeasure.setUpdateBy(getUsername());
        return mdUnitMeasureMapper.insertMdUnitMeasure(mdUnitMeasure);
    }

    /**
     * 修改单位
     * @param mdUnitMeasure 单位
     */
    @Override
    public int updateMdUnitMeasure(MdUnitMeasure mdUnitMeasure)
    {
        mdUnitMeasure.setUpdateTime(DateUtils.getNowDate());
        mdUnitMeasure.setUpdateBy(getUsername());
        return mdUnitMeasureMapper.updateMdUnitMeasure(mdUnitMeasure);
    }

    /**
     * 批量删除单位
     * @param measureIds 需要删除的单位主键
     */
    @Override
    public int deleteMdUnitMeasureByMeasureIds(Long[] measureIds)
    {
        return mdUnitMeasureMapper.deleteMdUnitMeasureByMeasureIds(measureIds);
    }
}
