package com.example.slowstep_pjt.managePatient.ctrl;

import com.example.slowstep_pjt.managePatient.domain.PT_DTO;
import org.springframework.web.bind.annotation.RestController;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;
import com.example.slowstep_pjt.managePatient.service.MPAllService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/all")
public class MPAllController {

    @Autowired
    private MPAllService mpAllService;

    @GetMapping("/pt_hth_info/{ptNo}")
    public ResponseEntity<List<PT_HTH_INFO_DTO>> getHealthInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getHealthInfo");

        return new ResponseEntity<>(mpAllService.getHealthInfo(ptNo), HttpStatus.OK);
    }

    @GetMapping("/pt/{ptNo}")
    public ResponseEntity<List<PT_DTO>> getPtInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getPtInfo");

        return new ResponseEntity<>(mpAllService.getPtInfo(ptNo), HttpStatus.OK);
    }
    
}
