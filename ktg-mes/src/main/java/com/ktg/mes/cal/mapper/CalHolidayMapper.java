package com.ktg.mes.cal.mapper;

import java.util.List;
import com.ktg.mes.cal.domain.CalHoliday;

/**
 * 节假日设置Mapper接口
 */
public interface CalHolidayMapper 
{
    /**
     * 查询节假日设置
     * @param holidayId 节假日设置主键
     * @return 节假日设置
     */
    CalHoliday selectCalHolidayByHolidayId(Long holidayId);

    /**
     * 查询节假日设置列表
     * @param calHoliday 节假日设置
     * @return 节假日设置集合
     */
    List<CalHoliday> selectCalHolidayList(CalHoliday calHoliday);

    /**
     * 新增节假日设置
     * @param calHoliday 节假日设置
     */
    int insertCalHoliday(CalHoliday calHoliday);

    /**
     * 修改节假日设置
     * @param calHoliday 节假日设置
     */
    int updateCalHoliday(CalHoliday calHoliday);

    /**
     * 批量删除节假日设置
     * @param holidayIds 需要删除的数据主键集合
     */
    int deleteCalHolidayByHolidayIds(Long[] holidayIds);
}
