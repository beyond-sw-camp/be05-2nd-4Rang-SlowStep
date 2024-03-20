package com.example.slowstep_pjt.managePatient.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PT_HTH_INFO_DTO {

    private Integer ptHthInfoNo;
    private Integer ptNo;
    private Integer ptBp;
    private Integer ptBst;
    private Integer ptWt;
    private Integer ptHr;
    private Date inspDt;
    
}
