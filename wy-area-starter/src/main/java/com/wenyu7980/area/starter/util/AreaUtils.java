package com.wenyu7980.area.starter.util;

import com.wenyu7980.area.api.service.AreaInternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author wenyu
 */
@Component
public class AreaUtils {
    private static AreaInternalService areaInternalService;

    @Autowired
    private AreaUtils(AreaInternalService internalService) {
        AreaUtils.areaInternalService = internalService;
    }

    public static Integer getLevelById(Integer id) {
        return areaInternalService.getById(id).getLevel();
    }
}
