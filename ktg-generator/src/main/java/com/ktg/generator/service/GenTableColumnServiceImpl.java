package com.ktg.generator.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ktg.common.core.text.Convert;
import com.ktg.generator.domain.GenTableColumn;
import com.ktg.generator.mapper.GenTableColumnMapper;

/**
 * 业务字段 服务层实现
 */
@Service
public class GenTableColumnServiceImpl implements IGenTableColumnService 
{
	@Autowired
	private GenTableColumnMapper genTableColumnMapper;

	/**
     * 查询业务字段列表
     * @param tableId 业务字段编号
     * @return 业务字段集合
     */
	@Override
	public List<GenTableColumn> selectGenTableColumnListByTableId(Long tableId)
	{
	    return genTableColumnMapper.selectGenTableColumnListByTableId(tableId);
	}
}
