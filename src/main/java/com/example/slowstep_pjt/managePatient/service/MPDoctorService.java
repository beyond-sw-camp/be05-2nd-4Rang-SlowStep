package com.example.slowstep_pjt.managePatient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;
import com.example.slowstep_pjt.managePatient.mapper.MPDoctorMapper;

@Service
public class MPDoctorService {

    @Autowired
    private MPDoctorMapper mpDoctorMapper;


    public List<PT_HTH_INFO_DTO> getHealthInfo(Integer ptNo){

        System.out.println("debug >> Service getHealthInfo()");

        return mpDoctorMapper.getHealthInfo(ptNo);
    }
    
} 
