package com.hand.demo.infra.mapper;


import com.hand.demo.api.controller.v1.dto.MaterialDto;
import com.hand.demo.domain.entity.Material;
import com.hand.demo.domain.vo.MaterialVo;
import io.choerodon.mybatis.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface MaterialMapper extends BaseMapper<Material> {

    List<MaterialVo>page(@Param("tenantId") Long tenantId, @Param("materialDto") MaterialDto materialDto);
}
