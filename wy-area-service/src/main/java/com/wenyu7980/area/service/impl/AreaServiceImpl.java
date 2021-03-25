package com.wenyu7980.area.service.impl;

import com.wenyu7980.area.entity.AreaEntity;
import com.wenyu7980.area.repository.AreaRepo;
import com.wenyu7980.area.service.AreaService;
import com.wenyu7980.common.exceptions.code404.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *
 * @author wenyu
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaRepo areaRepo;

    @Override
    @Cacheable(value = "AREA", key = "#p0")
    public AreaEntity findCacheById(Integer id) {
        AreaEntity entity = areaRepo.findById(id).orElseThrow(() -> new NotFoundException("area{0}不存在", id));
        return AreaEntity.ofCache(entity);
    }
}
