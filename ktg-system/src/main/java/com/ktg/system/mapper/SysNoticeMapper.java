package com.ktg.system.mapper;

import java.util.List;
import com.ktg.system.domain.SysNotice;

/**
 * 通知公告表 数据层
 */
public interface SysNoticeMapper
{
    /**
     * 查询公告信息
     * @param noticeId 公告ID
     * @return 公告信息
     */
    SysNotice selectNoticeById(Long noticeId);

    /**
     * 查询公告列表
     * @param notice 公告信息
     * @return 公告集合
     */
    List<SysNotice> selectNoticeList(SysNotice notice);

    /**
     * 新增公告
     * @param notice 公告信息
     */
    int insertNotice(SysNotice notice);

    /**
     * 修改公告
     * @param notice 公告信息
     */
    int updateNotice(SysNotice notice);

    /**
     * 批量删除公告信息
     * @param noticeIds 需要删除的公告ID
     */
    int deleteNoticeByIds(Long[] noticeIds);
}
