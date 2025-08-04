package com.ktg.mes.dv.service;

import java.util.List;
import com.ktg.mes.dv.domain.DvSubject;

/**
 * 设备点检保养项目Service接口
 */
public interface IDvSubjectService 
{
    /**
     * 查询设备点检保养项目
     * @param subjectId 设备点检保养项目主键
     * @return 设备点检保养项目
     */
    DvSubject selectDvSubjectBySubjectId(Long subjectId);

    /**
     * 查询设备点检保养项目列表
     * @param dvSubject 设备点检保养项目
     * @return 设备点检保养项目集合
     */
    List<DvSubject> selectDvSubjectList(DvSubject dvSubject);

    /**
     * 检查项目编码是否重复
     */
    String checkSubjectCodeUnique(DvSubject dvSubject);

    /**
     * 新增设备点检保养项目
     * @param dvSubject 设备点检保养项目
     */
    int insertDvSubject(DvSubject dvSubject);

    /**
     * 修改设备点检保养项目
     * @param dvSubject 设备点检保养项目
     */
    int updateDvSubject(DvSubject dvSubject);

    /**
     * 批量删除设备点检保养项目
     * @param subjectIds 需要删除的设备点检保养项目主键集合
     */
    int deleteDvSubjectBySubjectIds(Long[] subjectIds);
}
