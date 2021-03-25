package com.wenyu7980.area.api.service;

import com.wenyu7980.area.aggregation.AreaAggregation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author wenyu
 */
@FeignClient(name = "wy-area", path = "internal/aggregation", contextId = "wy-area-aggregation")
public interface AreaAggregationInternalService {
    /**
     * 聚合查询
     * @param id
     * @return
     */
    @GetMapping("areas/{id}")
    AreaAggregation getArea(@PathVariable("id") Integer id);
}
