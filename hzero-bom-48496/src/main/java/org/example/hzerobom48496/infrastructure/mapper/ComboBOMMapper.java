package org.example.hzerobom48496.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.hzerobom48496.domin.entiy.ComboBOM;

import java.util.List;

@Mapper
public interface ComboBOMMapper {
    List<ComboBOM> selectComboBOMsByConditions(String menuPackageName, String packageName);
}
