package com.hand.demo.app.service.impl;

import com.hand.demo.api.controller.v1.dto.MaterialDto;
import com.hand.demo.app.service.MaterialService;
import com.hand.demo.domain.vo.MaterialVo;
import com.hand.demo.infra.mapper.MaterialMapper;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service("appMaterialServiceImpl")
public class MaterialServiceImpl implements MaterialService {
    private MaterialMapper materialMapper;
    @Override
    public Page<MaterialVo> page(Long tenantId, PageRequest pageRequest, MaterialDto materialDto) {
        return null;
    }
}
