package com.ktg.mes.md.mapper;

import java.util.List;
import com.ktg.mes.md.domain.MdClient;

/**
 * 客户Mapper接口
 */
public interface MdClientMapper 
{
    /**
     * 查询客户
     * @param clientId 客户主键
     * @return 客户
     */
    MdClient selectMdClientByClientId(Long clientId);

    /**
     * 查询客户列表
     * @param mdClient 客户
     * @return 客户集合
     */
    List<MdClient> selectMdClientList(MdClient mdClient);

    /**
     * 检查客户编码是否重复
     */
    MdClient checkClientCodeUnique(MdClient mdClient);

    /**
     * 检查客户名称是否重复
     */
    MdClient checkClientNameUnique(MdClient mdClient);

    /**
     * 检查客户简称是否重复
     */
    MdClient checkClientNickUnique(MdClient mdClient);

    /**
     * 新增客户
     * @param mdClient 客户
     */
    int insertMdClient(MdClient mdClient);

    /**
     * 修改客户
     * @param mdClient 客户
     */
    int updateMdClient(MdClient mdClient);

    /**
     * 批量删除客户
     * @param clientIds 需要删除的数据主键集合
     */
    int deleteMdClientByClientIds(Long[] clientIds);
}
