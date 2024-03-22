package com.example.slowstep_pjt.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.slowstep_pjt.pm.domain.PmRequest;
import com.example.slowstep_pjt.pm.domain.PmResponse;

@Mapper
public interface PmMapper {
    public  void                save(PmRequest params)      ;
    public  void                deleteByPmNo(Integer pmNo)  ;
    public  List<PmResponse>    findAll(Integer pmRmNo)     ;
    public  PmResponse          findByPmNo(Integer pmNo)    ;
    public  void                updateRdYn(Integer pmNo)    ;
}
