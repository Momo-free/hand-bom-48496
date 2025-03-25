package com.hand.demo.api.controller.v1;

import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import com.hand.demo.app.service.MenuService;
import com.hand.demo.domain.entity.Menu;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import com.hand.demo.config.SwaggerTags;
import com.hand.demo.domain.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * API接口
 */
@Api(tags = SwaggerTags.MENU)
@RestController("menuController.v1")
@RequestMapping("/v1/(organizationId)/example")
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private MenuRepository menuRepository;


    @GetMapping("/page")
    @Permission(level = ResourceLevel.ORGANIZATION, permissionLogin = true)
    @ApiOperation("分页获取菜单")
    public ResponseEntity<Page<MenuComboDto>> menuComboPage(@PathVariable("organizationId")Long tenantId,
                                                           MenuComboDto menuComboDto, PageRequest pageRequest) {
        return ResponseEntity.ok(menuService.menuComboPage(tenantId, menuComboDto, pageRequest));

    }


}