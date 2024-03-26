package com.example.slowstep_pjt.pm.service;

import java.util.List;
import java.util.Map;

import com.example.slowstep_pjt.pm.domain.PmRequest;
import com.example.slowstep_pjt.pm.domain.PmResponse;

public interface PmService {
    // public  void                savePm(PmRequest params);
    public  void                deletePmByNo(Integer pmNo);
    public  List<PmResponse>    findAllPm(Integer pmRmNo);
    public  PmResponse          getDetailByPmNo(Integer pmNo);
    public void writePmCn(PmRequest params);
    public  List<Map<String, String>>    getDoctorList();
    public  List<Map<String, String>>    getNurseList();
}
