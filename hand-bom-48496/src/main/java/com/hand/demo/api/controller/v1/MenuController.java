package com.hand.demo.api.controller.v1;

import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import com.hand.demo.app.service.MenuService;
import com.hand.demo.config.SwaggerTags;
import com.hand.demo.domain.entity.Menu;
import com.hand.demo.domain.repository.MenuRepository;
import com.hand.demo.domain.vo.MenuComboVo;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = SwaggerTags.Menu)
@RestController("menuController.v1")
@RequestMapping("/v1/{organizationId}/example")
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private MenuRepository menuRepository;
    @GetMapping("/page")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @ApiOperation("分页获取菜单")
    public ResponseEntity<Page<MenuComboVo>> list(@PathVariable("organizationId") Long tenantId,
                                                            MenuComboDto menuComboDto,
                                                            PageRequest pageRequest) {
        Page<MenuComboVo> list = menuService.page(tenantId,menuComboDto, pageRequest);
        return Results.success(list);

    }
    @ApiOperation(value = "创建菜单")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @PostMapping
    public ResponseEntity create(@RequestBody Menu menu, @PathVariable("organizationId") Long tenantId) {
        this.validObject(menu);
        menu.setTenantId(tenantId);
        menuRepository.insert(menu);
        return Results.success("成功新增menu");
    }


}