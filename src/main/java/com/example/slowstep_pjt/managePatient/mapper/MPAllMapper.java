package com.example.slowstep_pjt.managePatient.mapper;


import java.util.List;

import com.example.slowstep_pjt.managePatient.domain.AD_DRUG_INFO_DTO;
import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import com.example.slowstep_pjt.managePatient.domain.PT_DTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;


@Mapper
public interface MPAllMapper {


    public List<PT_HTH_INFO_DTO> getHealthInfo(Integer ptNo);

    public void postHealthInfo(PT_HTH_INFO_DTO postData);

    public List<EXAM_INFO> getExamInfo(Integer phNo);

    public EXAM_INFO getExamInfoDetail(@Param("ptNo")Integer ptNo, @Param("examNo")Integer examNo);
    
    public List<EXAM_INFO> getDisInfo(Integer phNo);

    public List<PT_DTO> getPtInfo(Integer ptNo);

    public List<AD_DRUG_INFO_DTO> getDrugInfo(Integer ptHthInfoNo);

    public void postDrugInfo(AD_DRUG_INFO_DTO drugData);

}
