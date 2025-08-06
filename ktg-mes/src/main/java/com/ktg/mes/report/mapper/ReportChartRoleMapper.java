package com.ktg.mes.report.mapper;

import java.util.List;
import com.ktg.mes.report.domain.ReportChartRole;

/**
 * 图形报角色权限Mapper接口
 */
public interface ReportChartRoleMapper 
{
    /**
     * 批量新增图形报角色权限
     */
    int batchChartRole(List<ReportChartRole> reportChartRoleList);

    /**
     * 删除图形报角色权限
     * @param chartId 图形报角色权限主键
     */
    int deleteReportChartRoleByChartId(Long chartId);

    /**
     * 批量删除图形报角色权限
     * @param chartIds 需要删除的数据主键集合
     */
    int deleteReportChartRoleByChartIds(Long[] chartIds);
}
