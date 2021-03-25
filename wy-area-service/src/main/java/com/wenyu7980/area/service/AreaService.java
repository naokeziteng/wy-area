package com.wenyu7980.area.service;

import com.wenyu7980.area.entity.AreaEntity;

/**
 *
 * @author wenyu
 */
public interface AreaService {
    /**
     * 查询
     * @param id
     * @return
     */
    AreaEntity findCacheById(Integer id);
}
