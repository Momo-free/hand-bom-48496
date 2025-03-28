package com.hand.demo.infra.mapper;


import com.hand.demo.domain.entity.Combo;
import io.choerodon.mybatis.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ComboMapper extends BaseMapper<Combo> {
}
