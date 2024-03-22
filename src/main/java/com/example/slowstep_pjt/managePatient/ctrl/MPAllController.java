package com.example.slowstep_pjt.managePatient.ctrl;

import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import com.example.slowstep_pjt.managePatient.domain.PT_DTO;
import org.springframework.web.bind.annotation.RestController;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;
import com.example.slowstep_pjt.managePatient.service.MPAllService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




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

    @PostMapping("/post_pt_hth_info")
    public ResponseEntity<String> postHealthInfo(@RequestBody PT_HTH_INFO_DTO postData) {
        
        System.out.println("debug >> AllController postHealthInfo");

        mpAllService.postHealthInfo(postData);
        
        return new ResponseEntity<>("건강정보가 등록되었습니다.", HttpStatus.OK);
    }

    @GetMapping("/exam_info/{ptNo}")
    public ResponseEntity<List<EXAM_INFO>> getExamInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getExamInfo");

        return new ResponseEntity<List<EXAM_INFO>>(mpAllService.getExamInfo(ptNo), HttpStatus.OK);
    }

    @GetMapping("/exam_info_detail/{ptNo}/{examNo}")
    public ResponseEntity<EXAM_INFO> getExamInfoDetail(@PathVariable("ptNo") Integer ptNo, @PathVariable("examNo") Integer examNo) {

        System.out.println("debug >> AllController getExamInfoDetail/ptNo/examNo");
        
        return new ResponseEntity<EXAM_INFO>(mpAllService.getExamInfoDetail(ptNo, examNo), HttpStatus.OK);
    }

    @PostMapping("/post_exam_info")
    public ResponseEntity<String> postExamInfo(@RequestBody EXAM_INFO postData) {

        System.out.println("debug >> AllController postExamInfo");

        mpAllService.postExamInfo(postData);
        
        return new ResponseEntity<>("진료정보가 등록되었습니다.", HttpStatus.OK);
    }
    

    @GetMapping("/getDisInfo/{ptNo}")
    public ResponseEntity<Map<String, String>> getDisInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getDisInfo/ptNo");

        return new ResponseEntity<>(mpAllService.getDisInfo(ptNo), HttpStatus.OK);
    }
    
    
    @GetMapping("/pt/{ptNo}")
    public ResponseEntity<List<PT_DTO>> getPtInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getPtInfo");

        return new ResponseEntity<>(mpAllService.getPtInfo(ptNo), HttpStatus.OK);
    }
    
}
