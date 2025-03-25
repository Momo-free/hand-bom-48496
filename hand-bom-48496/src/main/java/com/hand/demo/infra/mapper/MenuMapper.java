package com.hand.demo.infra.mapper;


import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import io.choerodon.mybatis.common.BaseMapper;
import com.hand.demo.domain.entity.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {
    List<MenuComboDto> menuComboList(Long tenantId, MenuComboDto menuComboDto);
}