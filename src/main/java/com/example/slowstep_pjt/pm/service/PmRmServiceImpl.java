package com.example.slowstep_pjt.pm.service;

import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.pm.domain.PmRmRequest;
import com.example.slowstep_pjt.pm.mapper.PmRmMapper;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PmRmServiceImpl implements PmRmService {

    private final PmRmMapper pmRmMapper;

    @Transactional
    @Override
    public Integer findPmRmNo(PmRmRequest params) {
        System.out.println("debug >>> PmRmService findPmRmNo");
        Integer pmRmNo=pmRmMapper.findPmRmNo(params);
        return pmRmNo;
    }

    @Transactional
    @Override
    public void savePmRmNo(PmRmRequest params) {
        System.out.println("debug >>> PmRmService savePmRmNo");
        pmRmMapper.savePmRmNo(params);
    }
}
