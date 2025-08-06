package com.ktg.system.mapper;

import java.util.List;
import com.ktg.system.domain.SysRoleMenu;

/**
 * 角色与菜单关联表 数据层
 */
public interface SysRoleMenuMapper
{
    /**
     * 查询菜单使用数量
     * @param menuId 菜单ID
     */
    int checkMenuExistRole(Long menuId);

    /**
     * 通过角色ID删除角色和菜单关联
     * @param roleId 角色ID
     */
    int deleteRoleMenuByRoleId(Long roleId);

    /**
     * 批量删除角色菜单关联信息
     * @param ids 需要删除的数据ID
     */
    int deleteRoleMenu(Long[] ids);

    /**
     * 批量新增角色菜单信息
     * @param roleMenuList 角色菜单列表
     */
    int batchRoleMenu(List<SysRoleMenu> roleMenuList);
}
