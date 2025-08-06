package com.ktg.system.mapper;

import java.util.List;
import com.ktg.system.domain.SysRoleDept;

/**
 * 角色与部门关联表 数据层
 */
public interface SysRoleDeptMapper
{
    /**
     * 通过角色ID删除角色和部门关联
     * @param roleId 角色ID
     */
    int deleteRoleDeptByRoleId(Long roleId);

    /**
     * 批量删除角色部门关联信息
     * @param ids 需要删除的数据ID
     */
    int deleteRoleDept(Long[] ids);

    /**
     * 批量新增角色部门信息
     * @param roleDeptList 角色部门列表
     */
    int batchRoleDept(List<SysRoleDept> roleDeptList);
}
