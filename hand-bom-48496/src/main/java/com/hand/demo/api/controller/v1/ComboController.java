package com.hand.demo.api.controller.v1;


import com.hand.demo.config.SwaggerTags;
import com.hand.demo.domain.entity.Combo;
import com.hand.demo.domain.repository.ComboRepository;

import io.choerodon.core.iam.ResourceLevel;

import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Api(tags = SwaggerTags.Combo)
@RestController("comboController.v1")
@RequestMapping("/v1/{organizationId}/combos")
public class ComboController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(ComboController.class);


    private ComboRepository comboRepository;

    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @ApiOperation("创建套餐")
    @PostMapping
    public ResponseEntity<Combo> createCombo(@PathVariable("organizationId") Long tenantId,
                                             @RequestBody Combo combo) {

        this.validObject(combo);
        combo.setTenantId(tenantId);
        comboRepository.insert(combo);
        return Results.success(combo);

    }
}