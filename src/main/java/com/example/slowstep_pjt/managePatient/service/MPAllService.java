package com.example.slowstep_pjt.managePatient.service;


import java.util.List;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
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

    public void postHealthInfo(PT_HTH_INFO_DTO postData){

        System.out.println("debug >> Service postHealthInfo()");

        mpAllMapper.postHealthInfo(postData);
    }

    public List<EXAM_INFO> getExamInfo(Integer phNo){

        System.out.println("debug >> Service getExamInfo()");

        return mpAllMapper.getExamInfo(phNo);
    }

    public EXAM_INFO getExamInfoDetail(Integer ptNo, Integer examNo) {
        
        System.out.println("debug >> Service getExamInfoDetail()");

        return mpAllMapper.getExamInfoDetail(ptNo, examNo);
    }

    public List<PT_DTO> getPtInfo(Integer ptNo){

        System.out.println("debug >> Service getPtInfo()");

        return mpAllMapper.getPtInfo(ptNo);
    }

    
    

}
