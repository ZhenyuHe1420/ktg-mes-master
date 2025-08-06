package com.ktg.mes.report.mapper;

import com.ktg.mes.report.domain.UreportFileEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Ureport文件 Mapper
 */
@Mapper
public interface UreportFileMapper {
    /**
     *  根据报表名称查询报表
     * @param name 报表名称
     */
    UreportFileEntity queryUreportFileEntityByName(String name);

    /**
     * 查询全部报表
     */
    List<UreportFileEntity> queryReportFileList();

    /**
     * 根据报表名称删除报表
     * @param name
     */
    int deleteReportFileByName(String name);

    /**
     *  保存报表
     */
    int insertReportFile(UreportFileEntity entity);

    /**
     *  更新报表
     */
    int updateReportFile(UreportFileEntity entity);
}
