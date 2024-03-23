package com.example.slowstep_pjt.managePatient.ctrl;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.slowstep_pjt.managePatient.service.MPDoctorService;


@RestController
@RequestMapping("/doctor")
public class MPDoctorController {

    @Autowired
    private MPDoctorService mpDoctorService;

    @PostMapping("/post_exam_info")
    public ResponseEntity<String> postExamInfo(@RequestBody EXAM_INFO postData) {

        System.out.println("debug >> MPDoctorController postExamInfo");

        mpDoctorService.postExamInfo(postData);

        return new ResponseEntity<>("진료정보가 등록되었습니다.", HttpStatus.OK);
    }
    

}