package com.example.slowstep_pjt.managePatient.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AD_DRUG_INFO_DTO { // 복용 약물 정보 테이블
    private Integer adDrugInfoNo;   // 복용 약물 정보 번호
    private Integer ptHthInfoNo;    // 환자 건강 정보 번호
    private String drugNm;  // 약물명
    private String drugAdFreq;  // 약물 복용 주기


}

