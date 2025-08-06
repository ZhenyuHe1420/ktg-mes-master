package com.ktg.system.mapper;

import java.util.List;
import com.ktg.system.domain.SysMessage;

/**
 * 消息Mapper接口
 */
public interface SysMessageMapper 
{
    /**
     * 查询消息
     * @param messageId 消息主键
     * @return 消息
     */
    SysMessage selectSysMessageByMessageId(Long messageId);

    /**
     * 查询消息列表
     * @param sysMessage 消息
     * @return 消息集合
     */
    List<SysMessage> selectSysMessageList(SysMessage sysMessage);

    /**
     * 新增消息
     * @param sysMessage 消息
     */
    int insertSysMessage(SysMessage sysMessage);

    /**
     * 修改消息
     * @param sysMessage 消息
     */
    int updateSysMessage(SysMessage sysMessage);

    List<SysMessage> getUnRead();
}
