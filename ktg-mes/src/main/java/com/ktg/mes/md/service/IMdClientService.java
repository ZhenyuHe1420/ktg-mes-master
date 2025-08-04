package com.ktg.mes.md.service;

import java.util.List;
import com.ktg.mes.md.domain.MdClient;

/**
 * 客户Service接口
 */
public interface IMdClientService 
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

    String checkClientCodeUnique(MdClient mdClient);

    String checkClientNameUnique(MdClient mdClient);

    String checkClientNickUnique(MdClient mdClient);

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
     * @param clientIds 需要删除的客户主键集合
     */
    int deleteMdClientByClientIds(Long[] clientIds);

    /**
     * 导入客户信息
     * @param clientList
     * @param isUpdateSupport
     * @param operName
     */
    String importClient(List<MdClient> clientList, Boolean isUpdateSupport, String operName);
}
