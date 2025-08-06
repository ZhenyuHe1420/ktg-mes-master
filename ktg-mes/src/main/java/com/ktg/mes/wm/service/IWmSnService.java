package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmSn;
import com.ktg.mes.wm.domain.vo.WmSnPageVO;

/**
 * SN码Service接口
 */
public interface IWmSnService 
{
    /**
     * 查询SN码
     * @param snId SN码主键
     * @return SN码
     */
    WmSn selectWmSnBySnId(Long snId);

    /**
     * 查询SN码列表
     * @param wmSn SN码
     * @return SN码集合
     */
    List<WmSn> selectWmSnList(WmSn wmSn);

    /**
     * 查询指定SN的流转记录
     */
    List<WmSn> getStationList(WmSn sn);

    /**
     * 新增SN码
     * @param wmSn SN码
     */
    int insertWmSn(WmSn wmSn);

    /**
     * 修改SN码
     * @param wmSn SN码
     */
    int updateWmSn(WmSn wmSn);

    /**
     * 批量删除SN码
     * @param snIds 需要删除的SN码主键集合
     */
    int deleteWmSnBySnIds(String snIds);

    List<WmSnPageVO> getWmSnList(WmSn wmSn);
}
