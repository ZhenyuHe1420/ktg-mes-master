package com.ktg.mes.md.mapper;

import java.util.List;
import com.ktg.mes.md.domain.MdWorkshop;

/**
 * 车间Mapper接口
 */
public interface MdWorkshopMapper 
{
    /**
     * 查询车间
     * @param workshopId 车间主键
     * @return 车间
     */
    MdWorkshop selectMdWorkshopByWorkshopId(Long workshopId);

    /**
     * 查询车间列表
     * @param mdWorkshop 车间
     * @return 车间集合
     */
    List<MdWorkshop> selectMdWorkshopList(MdWorkshop mdWorkshop);

    /**
     * 检查车间编码是否唯一
     */
    MdWorkshop checkWorkshopCodeUnique(MdWorkshop mdWorkshop);

    /**
     * 检查车间名称是否唯一
     */
    MdWorkshop checkWorkshopNameUnique(MdWorkshop mdWorkshop);

    /**
     * 新增车间
     * @param mdWorkshop 车间
     */
    int insertMdWorkshop(MdWorkshop mdWorkshop);

    /**
     * 修改车间
     * @param mdWorkshop 车间
     */
    int updateMdWorkshop(MdWorkshop mdWorkshop);

    /**
     * 批量删除车间
     * @param workshopIds 需要删除的数据主键集合
     */
    int deleteMdWorkshopByWorkshopIds(Long[] workshopIds);
}
