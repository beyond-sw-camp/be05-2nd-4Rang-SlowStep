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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/nurse")
@Tag(name = "Manage Patient Nurse", description = "간호사 환자 관리 기능")
public class MPNurseController {

    @Autowired
    private MPNurseService mpNurseService;

    @GetMapping("/exam_info_NM/{ptNo}")
    @Operation(summary = "진료 담당의 확인", description = "간호사가 환자의 진료 담당의를 확인하는 API")
    public ResponseEntity<EXAM_INFO> getExamInfoNM(@PathVariable("ptNo") Integer examNo) {

        System.out.println("debug >> NurseController getExamInfoNM");

        return new ResponseEntity<EXAM_INFO>(mpNurseService.getExamInfoNM(examNo), HttpStatus.OK);
    }

}