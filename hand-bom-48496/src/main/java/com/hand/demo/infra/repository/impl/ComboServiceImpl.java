package com.hand.demo.infra.repository.impl;

import com.hand.demo.app.service.ComboService;
import com.hand.demo.domain.entity.Combo;
import io.choerodon.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Repository;



/**
 * 套餐领域服务实现类，实现套餐业务操作的具体逻辑
 */
@Repository
public class ComboServiceImpl extends BaseServiceImpl<Combo> implements ComboService {

//    @Autowired
//    private ComboRepository comboRepository;
//
//    @Override
//    public Page<Combo> pageCombo(Combo combo, PageRequest pageRequest) {
//        return PageHelper.doPage(pageRequest, () -> comboRepository.select(combo));
//    }
//
//    @Override
//    public Combo createCombo(Combo combo) {
//        comboRepository.insert(combo);
//        return combo;
//    }
//
//    @Override
//    public Combo updateCombo(Combo combo) {
//        comboRepository.updateByPrimaryKeySelective(combo);
//        return combo;
//    }

//    @Override
//    public void deleteCombo(Long comboId) {
//        comboRepository.deleteByPrimaryKey(comboId);
//    }
}