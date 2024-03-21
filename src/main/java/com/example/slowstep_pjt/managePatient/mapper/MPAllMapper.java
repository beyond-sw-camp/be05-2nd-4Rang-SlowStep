package com.example.slowstep_pjt.managePatient.mapper;


import java.util.List;

import com.example.slowstep_pjt.managePatient.domain.AD_DRUG_INFO_DTO;
import com.example.slowstep_pjt.managePatient.domain.PT_DTO;
import org.apache.ibatis.annotations.Mapper;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;


@Mapper
public interface MPAllMapper {


    public List<PT_HTH_INFO_DTO> getHealthInfo(Integer ptNo);

    public List<PT_DTO> getPtInfo(Integer ptNo);

}
