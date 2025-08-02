package com.ktg.generator.service;

import java.util.List;
import com.ktg.generator.domain.GenTableColumn;

/**
 * 业务字段 服务层
 */
public interface IGenTableColumnService
{
    /**
     * 查询业务字段列表
     * @param tableId 业务字段编号
     * @return 业务字段集合
     */
    public List<GenTableColumn> selectGenTableColumnListByTableId(Long tableId);
}
