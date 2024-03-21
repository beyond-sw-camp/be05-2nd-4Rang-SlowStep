package com.example.slowstep_pjt.managePatient.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MD_PT_RN_REL { // 의사,환자,간호사 관계 테이블
    private Integer relNo;  // 관계 번호
    private Integer mdNo;   // 의사 번호
    private Integer rnNo;   // 간호사 번호
}
