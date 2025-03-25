package org.example.hzerobom48496.application.service;

import org.example.hzerobom48496.domin.entiy.ComboBOM;
import org.example.hzerobom48496.infrastructure.mapper.ComboBOMMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComboBOMApplicationService {
    private final ComboBOMMapper comboBOMMapper;

    public ComboBOMApplicationService(ComboBOMMapper comBOMMapper) {
        this.comboBOMMapper = comBOMMapper;
    }

    public List<ComboBOM> getComboBOMsByConditions(String menuPackageName, String packageName) {
        return comboBOMMapper.selectComboBOMsByConditions(menuPackageName, packageName);
    }
}
