package com.example.slowstep_pjt.managePatient.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CH_RN {    //요양병원 간호사 테이블
    private Integer rnNo;   // 간호사 번호
    private String rnJbps;  // 간호사 직급
}
