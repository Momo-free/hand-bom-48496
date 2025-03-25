package org.example.hzerobom48496.controller;

import org.example.hzerobom48496.application.service.ComboBOMApplicationService;
import org.example.hzerobom48496.domin.entiy.ComboBOM;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComboBOMController {
    private final ComboBOMApplicationService comboBOMApplicationService;

    public ComboBOMController(ComboBOMApplicationService comboBOMApplicationService) {
        this.comboBOMApplicationService = comboBOMApplicationService;
    }

    @GetMapping("/combo-bom/query")
    public List<ComboBOM> queryComboBOMs(@RequestParam(required = false) String menuPackageName,
                                         @RequestParam(required = false) String packageName) {
        return comboBOMApplicationService.getComboBOMsByConditions(menuPackageName, packageName);
    }
}
