package com.example.slowstep_pjt.managePatient.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import com.example.slowstep_pjt.managePatient.mapper.MPNurseMapper;


@Service
public class MPNurseService {

    @Autowired
    private MPNurseMapper mpNurseMapper;

    public EXAM_INFO getExamInfoNM(Integer examNo) {
        
        return mpNurseMapper.getExamInfoNM(examNo);
    }
    

}
