package com.ktg.mes.md.mapper;

import java.util.List;
import com.ktg.mes.md.domain.MdVendor;

/**
 * 供应商Mapper接口
 */
public interface MdVendorMapper 
{
    /**
     * 查询供应商
     * @param vendorId 供应商主键
     * @return 供应商
     */
    MdVendor selectMdVendorByVendorId(Long vendorId);

    /**
     * 查询供应商列表
     * @param mdVendor 供应商
     * @return 供应商集合
     */
    List<MdVendor> selectMdVendorList(MdVendor mdVendor);

    MdVendor checkVendorCodeUnique(MdVendor mdVendor);

    MdVendor checkVendorNameUnique(MdVendor mdVendor);

    MdVendor checkVendorNickUnique(MdVendor mdVendor);

    /**
     * 新增供应商
     * @param mdVendor 供应商
     */
    int insertMdVendor(MdVendor mdVendor);

    /**
     * 修改供应商
     * @param mdVendor 供应商
     */
    int updateMdVendor(MdVendor mdVendor);

    /**
     * 批量删除供应商
     * @param vendorIds 需要删除的数据主键集合
     */
    int deleteMdVendorByVendorIds(Long[] vendorIds);
}
