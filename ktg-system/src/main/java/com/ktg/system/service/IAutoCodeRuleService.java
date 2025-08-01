package com.ktg.system.service;

import com.ktg.common.core.domain.entity.SysAutoCodeRule;
import java.util.List;

public interface IAutoCodeRuleService {
    SysAutoCodeRule getOne(String ruleCode);

    List<SysAutoCodeRule> selectAutoCodeList(SysAutoCodeRule sysAutoCodeRule);

    SysAutoCodeRule findById(Long ruleId);

    String checkRuleCodeUnique(SysAutoCodeRule sysAutoCodeRule);

    String checkRuleNameUnique(SysAutoCodeRule sysAutoCodeRule);

    int insertInfo(SysAutoCodeRule rule);

    int updateInfo(SysAutoCodeRule rule);

    int deleteByIds(Long[] ruleIds);
}
