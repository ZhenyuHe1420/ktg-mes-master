package com.ktg.mes.pro.service;

import java.util.List;
import com.ktg.mes.pro.domain.ProCard;

/**
 * 工序流转卡Service接口
 */
public interface IProCardService 
{
    /**
     * 查询工序流转卡
     * @param cardId 工序流转卡主键
     * @return 工序流转卡
     */
    ProCard selectProCardByCardId(Long cardId);

    /**
     * 查询工序流转卡列表
     * @param proCard 工序流转卡
     * @return 工序流转卡集合
     */
    List<ProCard> selectProCardList(ProCard proCard);

    /**
     * 新增工序流转卡
     * @param proCard 工序流转卡
     */
    int insertProCard(ProCard proCard);

    /**
     * 修改工序流转卡
     * @param proCard 工序流转卡
     */
    int updateProCard(ProCard proCard);

    /**
     * 批量删除工序流转卡
     * @param cardIds 需要删除的工序流转卡主键集合
     */
    int deleteProCardByCardIds(Long[] cardIds);

    /**
     * 校验编码是否唯一
     */
    String checkCardCodeUnique(ProCard proCard);
}
