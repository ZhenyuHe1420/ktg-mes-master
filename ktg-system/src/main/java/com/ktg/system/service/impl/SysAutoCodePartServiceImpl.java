package com.ktg.system.service.impl;

import com.ktg.common.core.domain.entity.SysAutoCodePart;
import com.ktg.system.mapper.SysAutoCodePartMapper;
import com.ktg.system.service.IAutoCodePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysAutoCodePartServiceImpl implements IAutoCodePartService {
    @Autowired
    private SysAutoCodePartMapper sysAutoCodePartMapper;

    @Override
    public List<SysAutoCodePart> listPart(SysAutoCodePart sysAutoCodePart) {
        return sysAutoCodePartMapper.selectSysAutoCodePartList(sysAutoCodePart);
    }
}
