package com.example.slowstep_pjt.pm.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.slowstep_pjt.pm.domain.PmRequest;
import com.example.slowstep_pjt.pm.domain.PmResponse;
import com.oracle.wls.shaded.org.apache.xalan.xsltc.util.IntegerArray;

@Mapper
public interface PmMapper {
    public  void                writePmCn(PmRequest params) ;
    public  void                deleteByPmNo(Integer pmNo)  ;
    public  List<PmResponse>    findAll(Integer pmRmNo)     ;
    public  PmResponse          findByPmNo(Integer pmNo)    ;
    public  void                updateRdYn(Integer pmNo)    ;
    public  List<PmResponse>    getDoctorList()             ;
    public  List<PmResponse>    getNurseList()              ;
    public  Integer             checkView(@Param("doctorNo")Integer doctorNo, @Param("nurseNo")Integer nurseNo);
    public  void                createView(@Param("doctorNo")Integer doctorNo, @Param("nurseNo")Integer nurseNo);
}
