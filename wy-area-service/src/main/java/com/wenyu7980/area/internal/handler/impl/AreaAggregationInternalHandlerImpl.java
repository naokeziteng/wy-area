package com.wenyu7980.area.internal.handler.impl;

import com.wenyu7980.area.aggregation.AreaAggregation;
import com.wenyu7980.area.entity.AreaEntity;
import com.wenyu7980.area.internal.handler.AreaAggregationInternalHandler;
import com.wenyu7980.area.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author wenyu
 */
@Component
public class AreaAggregationInternalHandlerImpl implements AreaAggregationInternalHandler {
    @Autowired
    private AreaService areaService;

    @Override
    public AreaAggregation getArea(Integer id) {
        AreaEntity entity = areaService.findCacheById(id);
        AreaAggregation area = new AreaAggregation();
        area.setFullName(entity.getFullName());
        area.setLatitude(entity.getLatitude());
        area.setLongitude(entity.getLongitude());
        area.setId(id);
        switch (entity.getLevel()) {
        case 3:
            area.setDistrictId(entity.getId());
            area.setDistrictName(entity.getName());
            entity = entity.getParent();
        case 2:
            area.setCityId(entity.getId());
            area.setCityName(entity.getName());
            entity = entity.getParent();
        case 1:
            area.setCityId(entity.getId());
            area.setCityName(entity.getName());
        }
        return area;
    }
}
