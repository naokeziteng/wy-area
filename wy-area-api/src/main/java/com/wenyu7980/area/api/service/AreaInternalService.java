package com.wenyu7980.area.api.service;

import com.wenyu7980.area.api.domain.AreaInternal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author wenyu
 */
@FeignClient(name = "wy-area", path = "internal/areas", contextId = "wy-area")
public interface AreaInternalService {
    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("{id}")
    AreaInternal getById(@PathVariable("id") Integer id);

}
