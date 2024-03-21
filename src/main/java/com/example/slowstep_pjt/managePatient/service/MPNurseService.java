package com.example.slowstep_pjt.managePatient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.managePatient.mapper.MPNurseMapper;


@Service
public class MPNurseService {

    @Autowired
    private MPNurseMapper mpNurseMapper;
    
}
