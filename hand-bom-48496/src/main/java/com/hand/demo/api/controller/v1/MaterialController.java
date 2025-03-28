package com.hand.demo.api.controller.v1;


import com.hand.demo.api.controller.v1.dto.MaterialDto;
import com.hand.demo.app.service.MaterialService;
import com.hand.demo.config.SwaggerTags;
import com.hand.demo.domain.vo.MaterialVo;
import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = SwaggerTags.MATERIAL)
@RestController("materialController.v1")
@RequestMapping("/v1/{organizationId}/material")
public class MaterialController extends BaseController {
    @Autowired
    private MaterialService materialService;

    @ApiOperation(value = "动态分页查询菜单")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @GetMapping("/materialList")
    public ResponseEntity<Page<MaterialVo>> list(MaterialDto materialDto,
                                                 PageRequest pageRequest,
                                                 @PathVariable("organizationId") Long tenantId) {
        Page<MaterialVo> list =  materialService.page(tenantId, pageRequest, materialDto);
        return Results.success(list);
    }
}
