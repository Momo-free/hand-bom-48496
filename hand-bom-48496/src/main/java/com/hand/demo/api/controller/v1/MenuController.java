package com.hand.demo.api.controller.v1;

import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import com.hand.demo.app.service.MenuService;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.hzero.core.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Date;

@Api(tags = "Menu")
@RestController("menuController.v1")
@RequestMapping("/v1/{organizationId}/example")
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/page")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @ApiOperation("分页获取菜单")
    public ResponseEntity<Page<MenuComboDto>> menuComboPage(@PathVariable("organizationId") Long tenantId,
                                                            MenuComboDto menuComboDto,
                                                            PageRequest pageRequest) {
        return ResponseEntity.ok(menuService.menuComboPage(tenantId, menuComboDto, pageRequest));
    }

    @GetMapping("/search")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @ApiOperation("根据条件分页查询菜单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "organizationId", value = "租户ID", required = true, paramType = "path", dataType = "long"),
            @ApiImplicitParam(name = "menuName", value = "菜单名称", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "menuOwner", value = "菜单负责人", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "comboName", value = "套餐名称", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "comboOwner", value = "套餐负责人", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "comboType", value = "套餐类型", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "salesArea", value = "销售地区", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "comboStartDate", value = "有效起始日期", paramType = "query", dataType = "date"),
            @ApiImplicitParam(name = "comboEndDate", value = "有效终止日期", paramType = "query", dataType = "date")
    })
    public ResponseEntity<Page<MenuComboDto>> searchMenuComboPage(@PathVariable("organizationId") Long tenantId,
                                                                  @RequestParam(required = false) String menuName,
                                                                  @RequestParam(required = false) String menuOwner,
                                                                  @RequestParam(required = false) String comboName,
                                                                  @RequestParam(required = false) String comboOwner,
                                                                  @RequestParam(required = false) String comboType,
                                                                  @RequestParam(required = false) String salesArea,
                                                                  @RequestParam(required = false) Date comboStartDate,
                                                                  @RequestParam(required = false) Date comboEndDate,
                                                                  PageRequest pageRequest) {
        MenuComboDto dto = new MenuComboDto();
        dto.setMenuName(menuName);
        dto.setMenuOwner(menuOwner);
        dto.setComboName(comboName);
        dto.setComboOwner(comboOwner);
        dto.setComboType(comboType);
        dto.setSalesArea(salesArea);
        dto.setComboStartDate(comboStartDate);
        dto.setComboEndDate(comboEndDate);
        dto.setTenantId(tenantId);
        return ResponseEntity.ok(menuService.menuComboPage(tenantId, dto, pageRequest));
    }
}