package com.example.slowstep_pjt.managePatient.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;

@Mapper
public interface MPNurseMapper {

    public EXAM_INFO getExamInfoNM(Integer examNo);
    
}

