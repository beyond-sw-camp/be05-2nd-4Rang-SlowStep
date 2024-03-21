package com.example.slowstep_pjt.managePatient.domain;

import lombok.Getter;
import lombok.Setter;


import java.sql.Date;


@Getter
@Setter
public class EXAM_INFO {    // 진료 정보 테이블
    private Integer examNo; // 진료 번호
    private Integer ptNo;   // 환자 번호
    private String rxCn;    // 처방 내용
    private String disNm;  // 질병명
    private String picMdNm; // 담당의 이름

    private Date examYmd;  // 진료일
}

