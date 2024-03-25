package com.example.slowstep_pjt.managePatient.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import com.example.slowstep_pjt.managePatient.service.MPNurseService;

@RestController
@RequestMapping("/nurse")
public class MPNurseController {

    @Autowired
    private MPNurseService mpNurseService;

    @GetMapping("/exam_info_NM/{ptNo}")
    public ResponseEntity<EXAM_INFO> getExamInfoNM(@PathVariable("ptNo") Integer examNo) {

        System.out.println("debug >> NurseController getExamInfoNM");

        return new ResponseEntity<EXAM_INFO>(mpNurseService.getExamInfoNM(examNo), HttpStatus.OK);
    }

}