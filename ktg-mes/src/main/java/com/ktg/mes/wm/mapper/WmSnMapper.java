package com.ktg.mes.wm.mapper;

import java.util.List;
import com.ktg.mes.wm.domain.WmSn;
import com.ktg.mes.wm.domain.vo.WmSnPageVO;
import org.apache.ibatis.annotations.Param;

/**
 * SN码Mapper接口
 */
public interface WmSnMapper 
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
     * @param ids 需要删除的数据主键集合
     */
    int deleteWmSnBySnIds(@Param("ids") List<Long> ids);

    List<WmSnPageVO> getWmSnList(WmSn wmSn);
}
