package com.example.slowstep_pjt.managePatient.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PT_DTO {   // 환자 테이블
    private Integer ptNo;   // 환자 번호
    private Integer picMdNo;    // 담당의 번호
    private Integer picRnNo;    // 담당간호사 번호
    private String ptNm;    // 환자 이름
    private LocalDateTime ptBrymd;  // 환자 생년월일
    private Integer ptGndr; // 환자 성별
    private String ptRrno;  //  환자 주민등록번호
    private String prtcrNm; // 보호자 이름
    private String prtcrTelno;  // 보호자 연락처
    private String ptRoom;  // 환자 병실
    private LocalDateTime admsYmd;  // 입원일
    private LocalDateTime dischYmd; // 퇴원일

}
