package com.wenyu7980.area.internal.controller;

import com.wenyu7980.area.aggregation.AreaAggregation;
import com.wenyu7980.area.api.service.AreaAggregationInternalService;
import com.wenyu7980.area.internal.handler.AreaAggregationInternalHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author wenyu
 */
@ApiIgnore
@RestController
@RequestMapping("internal/aggregation/areas")
public class AreaAggregationInternalController implements AreaAggregationInternalService {
    @Autowired
    private AreaAggregationInternalHandler areaAggregationInternalHandler;

    @Override
    @GetMapping("{id}")
    public AreaAggregation getArea(@PathVariable("id") Integer id) {
        return areaAggregationInternalHandler.getArea(id);
    }
}
