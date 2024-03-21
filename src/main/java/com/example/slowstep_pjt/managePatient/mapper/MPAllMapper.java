package com.example.slowstep_pjt.managePatient.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;

@Mapper
public interface MPAllMapper {

    public List<PT_HTH_INFO_DTO> getHealthInfo(Integer ptNo);
    
}
