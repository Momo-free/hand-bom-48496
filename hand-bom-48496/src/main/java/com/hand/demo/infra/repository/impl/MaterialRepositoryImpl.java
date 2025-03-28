package com.hand.demo.infra.repository.impl;

import com.hand.demo.domain.entity.Material;
import com.hand.demo.domain.repository.MaterialRepository;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;
@Repository
public class MaterialRepositoryImpl extends BaseRepositoryImpl<Material> implements MaterialRepository {
}
