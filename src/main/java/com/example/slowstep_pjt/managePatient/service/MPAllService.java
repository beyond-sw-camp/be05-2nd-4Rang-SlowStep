package com.example.slowstep_pjt.managePatient.service;


import java.util.List;

import com.example.slowstep_pjt.managePatient.domain.PT_DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;
import com.example.slowstep_pjt.managePatient.mapper.MPAllMapper;

@Service
public class MPAllService {

    @Autowired
    private MPAllMapper mpAllMapper;

    public List<PT_HTH_INFO_DTO> getHealthInfo(Integer ptNo){

        System.out.println("debug >> Service getHealthInfo()");

        return mpAllMapper.getHealthInfo(ptNo);
    }

    public List<PT_DTO> getPtInfo(Integer ptNo){

        System.out.println("debug >> Service getPtInfo()");

        return mpAllMapper.getPtInfo(ptNo);
    }
    

}
