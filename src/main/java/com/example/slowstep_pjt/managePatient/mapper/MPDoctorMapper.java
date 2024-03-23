package com.example.slowstep_pjt.managePatient.mapper;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MPDoctorMapper {

    public void postExamInfo(EXAM_INFO postData);

}
