package com.example.slowstep_pjt.managePatient.service;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.slowstep_pjt.managePatient.mapper.MPDoctorMapper;

@Service
public class MPDoctorService {

    @Autowired
    private MPDoctorMapper mpDoctorMapper;

    public void postExamInfo(EXAM_INFO postData){

        System.out.println("debug >> Service postExamInfo()");

        mpDoctorMapper.postExamInfo(postData);

    }
    
} 
