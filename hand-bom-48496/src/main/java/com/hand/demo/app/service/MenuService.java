package com.hand.demo.app.service;

import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import com.hand.demo.domain.entity.Menu;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.mybatis.service.BaseService;

/**
 * ExampleService
 */
public interface MenuService extends BaseService<Menu> {
    Page<MenuComboDto> meuCombo(Long tenantId, MenuComboDto menuComboDto, PageRequest pageRequest);
}
