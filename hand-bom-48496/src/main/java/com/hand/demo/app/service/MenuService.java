package com.hand.demo.app.service;

import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import com.hand.demo.domain.entity.Menu;
import com.hand.demo.domain.vo.MenuComboVo;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * 菜单应用服务接口，定义菜单应用层业务操作的接口
 */

public interface MenuService {

    Page<MenuComboVo> page(Long tenantId, MenuComboDto menuComboDto, PageRequest pageRequest);
}