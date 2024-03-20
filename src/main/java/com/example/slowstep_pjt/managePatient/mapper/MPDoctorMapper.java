package com.example.slowstep_pjt.managePatient.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;


@Mapper
public interface MPDoctorMapper {

    public List<PT_HTH_INFO_DTO> getHealthInfo(Integer ptNo);
    
}
