package com.example.slowstep_pjt.managePatient.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;
import com.example.slowstep_pjt.managePatient.service.MPDoctorService;

@RestController
@RequestMapping("/doctor")
public class MPDoctorController {

    @Autowired
    private MPDoctorService mpDoctorService;

    @GetMapping("/pt_hth_info/{ptNo}")
    public ResponseEntity<List<PT_HTH_INFO_DTO>> getMethodName(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> Controller getMethodName");

        return new ResponseEntity<>(mpDoctorService.getHealthInfo(ptNo), HttpStatus.OK);
    }
    

}