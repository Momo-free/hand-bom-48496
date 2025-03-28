package com.hand.demo.app.service;

import com.hand.demo.api.controller.v1.dto.MaterialDto;
import com.hand.demo.domain.vo.MaterialVo;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.springframework.stereotype.Service;


public interface MaterialService {
    Page<MaterialVo> page(Long tenantId, PageRequest pageRequest, MaterialDto materialDto);
}