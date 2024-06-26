package com.example.slowstep_pjt.pm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.pm.domain.PmRequest;
import com.example.slowstep_pjt.pm.domain.PmResponse;
import com.example.slowstep_pjt.pm.mapper.PmMapper;
import com.example.slowstep_pjt.user.domain.UserDTO;

import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PmServiceImpl implements PmService {

    private final PmMapper      pmMapper    ;

    

    @Transactional
    @Override
    public void deletePmByNo(Integer pmNo) {
        System.out.println("debug >>> service deletePmByNo ");
        pmMapper.deleteByPmNo(pmNo); 
    }

    @Transactional
    @Override
    public List<PmResponse> findAllPm(Integer pmRmNo) {
        System.out.println("debug >>> service findAllPm ");
        List<PmResponse>    response    = pmMapper.findAll(pmRmNo);
        return response;
    }
    
    @Transactional
    @Override
    public PmResponse getDetailByPmNo(Integer pmNo, HttpSession session) {
        System.out.println("debug >>> service viewDetails ");
        PmResponse  response    = pmMapper.findByPmNo(pmNo);
        String      deleteYn    = response.getDeleteYn();

        if (deleteYn.equals("0")){
            UserDTO userResponse = (UserDTO) session.getAttribute("loginUser");
            if ((response.getTrsmDir().equals("1") && userResponse.getJobTyp()=='N')
                || (response.getTrsmDir().equals("0") && userResponse.getJobTyp()=='D')){
                pmMapper.updateRdYn(pmNo);
            }
            return pmMapper.findByPmNo(pmNo);
        } else {
            return null;
        }
    }

    @Override
    public void writePmCn(PmRequest params) {
        System.out.println("debug >>> PmService writePmCn");
        pmMapper.writePmCn(params);
    }

    @Override
    public List<Map<String, String>> getDoctorList() {
        System.out.println("debug >>> PmService getDoctorList");
        List<Map<String, String>> info = new ArrayList<>();
        List<PmResponse> lst = pmMapper.getDoctorList();
        for(PmResponse some : lst) {
            Map<String, String> map = new HashMap<>();
            map.put("MBR_NO", some.getMbrNo().toString());
            map.put("name", some.getMbrNm());
            map.put("dept", some.getMdPicDept());
            info.add(map);
        }

        return info;
    }

    @Override
    public List<Map<String, String>> getNurseList() {
        System.out.println("debug >>> PmService getNurseList");
        List<Map<String, String>> info = new ArrayList<>();
        List<PmResponse> lst = pmMapper.getNurseList();
        for(PmResponse some : lst) {
            Map<String, String> map = new HashMap<>();
            map.put("MBR_NM", some.getMbrNm());
            map.put("MBR_NO", some.getMbrNo().toString());
            info.add(map);
        }
        return info;
    }

    @Override
    public Integer checkView(Integer doctorNo, Integer nurseNo) {
        Integer rmNo = pmMapper.checkView(doctorNo, nurseNo);
        if(rmNo == null) {
            pmMapper.createView(doctorNo, nurseNo);
            rmNo = pmMapper.checkView(doctorNo, nurseNo);
        }
        return rmNo;
    }
}
