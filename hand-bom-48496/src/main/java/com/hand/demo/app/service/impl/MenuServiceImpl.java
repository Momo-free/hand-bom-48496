package com.hand.demo.app.service.impl;

import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import com.hand.demo.app.service.MenuService;
import com.hand.demo.domain.entity.Menu;
import com.hand.demo.infra.mapper.MenuMapper;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.PageHelper;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.mybatis.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ExampleServiceImpl
 */
@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Page<MenuComboDto> meuCombo(Long tenantId, MenuComboDto menuComboDto, PageRequest pageRequest) {
        return PageHelper.doPage(pageRequest, () -> menuMapper.menuComboList(tenantId, menuComboDto));
    }
}
