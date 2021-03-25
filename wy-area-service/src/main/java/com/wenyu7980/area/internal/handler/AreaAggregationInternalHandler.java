package com.wenyu7980.area.internal.handler;

import com.wenyu7980.area.aggregation.AreaAggregation;

/**
 *
 * @author wenyu
 */
public interface AreaAggregationInternalHandler {
    /**
     * 查询
     * @param id
     * @return
     */
    AreaAggregation getArea(Integer id);
}
