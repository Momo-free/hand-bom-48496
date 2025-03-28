package com.hand.demo.infra.mapper;


import com.hand.demo.api.controller.v1.dto.MenuComboDto;
import com.hand.demo.domain.vo.MenuComboVo;
import io.choerodon.mybatis.common.BaseMapper;
import com.hand.demo.domain.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    List<MenuComboVo> page(@Param("tenantId") Long tenantId,
                           @Param("menuComboDto") MenuComboDto menuComboDto);
}