package com.example.slowstep_pjt.managePatient.ctrl;

import com.example.slowstep_pjt.managePatient.domain.AD_DRUG_INFO_DTO;
import com.example.slowstep_pjt.managePatient.domain.EXAM_INFO;
import com.example.slowstep_pjt.managePatient.domain.PT_DTO;
import org.springframework.web.bind.annotation.RestController;

import com.example.slowstep_pjt.managePatient.domain.PT_HTH_INFO_DTO;
import com.example.slowstep_pjt.managePatient.service.MPAllService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

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
@Tag(name = "Manage Patient Doctor Nurse", description = "의사 간호사 환자 관리 기능")
public class MPAllController {

    @Autowired
    private MPAllService mpAllService;

    @GetMapping("/pt_hth_info/{ptNo}")
    @Operation(summary = "환자 건강 정보 확인", description = "환자의 혈압, 혈당, 체중, 심박수 등의 건강정보를 확인하는 API")
    public ResponseEntity<List<PT_HTH_INFO_DTO>> getHealthInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getHealthInfo");

        return new ResponseEntity<>(mpAllService.getHealthInfo(ptNo), HttpStatus.OK);
    }

    @PostMapping("/post_pt_hth_info")
    @Operation(summary = "환자 건강 정보 등록", description = "의사와 간호사가 관리하는 환자의 건강 정보를 등록하는 API")
    public ResponseEntity<String> postHealthInfo(@RequestBody PT_HTH_INFO_DTO postData) {
        
        System.out.println("debug >> AllController postHealthInfo");

        mpAllService.postHealthInfo(postData);
        
        return new ResponseEntity<>("건강정보가 등록되었습니다.", HttpStatus.OK);
    }

    @GetMapping("/exam_info/{ptNo}")
    @Operation(summary = "진료 차트 확인", description = "의사와 간호사가 환자의 진료 차트를 확인하는 API")
    public ResponseEntity<List<EXAM_INFO>> getExamInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getExamInfo");

        return new ResponseEntity<List<EXAM_INFO>>(mpAllService.getExamInfo(ptNo), HttpStatus.OK);
    }

    @GetMapping("/exam_info_detail/{ptNo}/{examNo}")
    @Operation(summary = "진료 정보 확인", description = "의사와 간호사가 환자의 진료 상세 정보를 확인하는 API")
    public ResponseEntity<EXAM_INFO> getExamInfoDetail(@PathVariable("ptNo") Integer ptNo, @PathVariable("examNo") Integer examNo) {

        System.out.println("debug >> AllController getExamInfoDetail/ptNo/examNo");
        
        return new ResponseEntity<EXAM_INFO>(mpAllService.getExamInfoDetail(ptNo, examNo), HttpStatus.OK);
    }


    @GetMapping("/getDisInfo/{ptNo}")
    @Operation(summary = "질병 이력 조회", description = "의사와 간호사가 환자의 질병 이록을 확인하는 API")
    public ResponseEntity<Map<String, String>> getDisInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getDisInfo/ptNo");

        return new ResponseEntity<>(mpAllService.getDisInfo(ptNo), HttpStatus.OK);
    }
    
    
    @GetMapping("/pt/{ptNo}")
    @Operation(summary = "환자 정보 조회", description = "등록된 환자 번호로 환자 정보를 조회하는 API")
    public ResponseEntity<List<PT_DTO>> getPtInfo(@PathVariable("ptNo") Integer ptNo) {

        System.out.println("debug >> AllController getPtInfo");

        return new ResponseEntity<>(mpAllService.getPtInfo(ptNo), HttpStatus.OK);
    }

    @GetMapping("/ad_drug_info")
    @Operation(summary = "복용 약물 조회", description = "의사, 간호사가 환자의 복용 약물을 조회하는 API")
    public ResponseEntity<List<AD_DRUG_INFO_DTO>> getDrugInfo() {

        System.out.println("debug >> AllController getPtInfo");

        return new ResponseEntity<>(mpAllService.getDrugInfo(), HttpStatus.OK);
    }

    @PostMapping("/post_ad_drug_info")
    @Operation(summary = "복용 약물 등록", description = "의사, 간호사가 복용 약물 정보를 등록하는 API")
    public ResponseEntity<String> postDrugInfo(@RequestBody AD_DRUG_INFO_DTO drugData) {

        System.out.println("debug >> MPDoctorController postExamInfo");

        mpAllService.postDrugInfo(drugData);

        return new ResponseEntity<>("복용 약물 정보가 등록되었습니다.", HttpStatus.OK);
    }
    
}
