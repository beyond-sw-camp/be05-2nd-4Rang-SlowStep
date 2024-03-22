package com.example.slowstep_pjt.pm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.pm.domain.PmRequest;
import com.example.slowstep_pjt.pm.domain.PmResponse;
import com.example.slowstep_pjt.pm.mapper.PmMapper;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PmServiceImpl implements PmService {

    private final PmMapper      pmMapper    ;

    @Transactional
    @Override
    public void savePm(PmRequest params) {
        System.out.println("debug >>> service savePm ");
        pmMapper.save(params); 
    }

    @Transactional
    @Override
    public void deletePmByNo(Integer pmNo) {
        System.out.println("debug >>> service deletePmByNo ");
        pmMapper.deleteByPmNo(pmNo); 
    }

    @Transactional
    @Override
    public List<PmResponse> findAllPm(Integer pmRmNo) {
        System.out.println("debug >>> service findAllPm ");
        List<PmResponse>    response    = pmMapper.findAll(pmRmNo);
        return response;
    }
    
    @Transactional
    @Override
    public PmResponse getDetailByPmNo(Integer pmNo) {
        System.out.println("debug >>> service viewDetails ");
        pmMapper.updateRdYn(pmNo);
        PmResponse  response    = pmMapper.findByPmNo(pmNo);
        return response;
    }
}
