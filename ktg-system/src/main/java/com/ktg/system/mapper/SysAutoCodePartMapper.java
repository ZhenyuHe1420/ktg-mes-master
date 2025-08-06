package com.ktg.system.mapper;

import com.ktg.common.core.domain.entity.SysAutoCodePart;
import java.util.List;

public interface SysAutoCodePartMapper {
    List<SysAutoCodePart> selectSysAutoCodePartList(SysAutoCodePart sysAutoCodePart);

    int add(SysAutoCodePart sysAutoCodePart);
}
