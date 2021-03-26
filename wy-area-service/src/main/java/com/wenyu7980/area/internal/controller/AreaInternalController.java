package com.wenyu7980.area.internal.controller;

import com.wenyu7980.area.api.domain.AreaInternal;
import com.wenyu7980.area.api.service.AreaInternalService;
import com.wenyu7980.area.internal.handler.AreaInternalHandler;
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
@RequestMapping("internal/areas")
public class AreaInternalController implements AreaInternalService {
    @Autowired
    private AreaInternalHandler areaInternalHandler;

    @Override
    @GetMapping("{id}")
    public AreaInternal getById(@PathVariable Integer id) {
        return areaInternalHandler.getById(id);
    }
}
