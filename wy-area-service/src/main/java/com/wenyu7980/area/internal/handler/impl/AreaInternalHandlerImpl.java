package com.wenyu7980.area.internal.handler.impl;

import com.wenyu7980.area.api.domain.AreaInternal;
import com.wenyu7980.area.entity.AreaEntity;
import com.wenyu7980.area.internal.handler.AreaInternalHandler;
import com.wenyu7980.area.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author wenyu
 */
@Component
public class AreaInternalHandlerImpl implements AreaInternalHandler {
    @Autowired
    private AreaService areaService;

    @Override
    public AreaInternal getById(Integer id) {
        AreaEntity entity = areaService.findCacheById(id);
        AreaInternal internal = new AreaInternal();
        internal.setId(entity.getId());
        internal.setLevel(entity.getLevel());
        internal.setName(entity.getName());
        return internal;
    }
}
