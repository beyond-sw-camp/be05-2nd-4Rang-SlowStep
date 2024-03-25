package com.example.slowstep_pjt.pm.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class PmResponse {
    private Integer pmNo        ;
    private Integer pmRmNo      ;
    private String  pmCn        ;
    private Integer trsmDir     ;
    private Integer rdYn        ;
    private Date    pmDsptchDt  ;
    private Integer deleteYn    ;
    private Date    deleteDt    ;
    private Date    rdYnDt      ;
    private Date    trsmDt      ;
}
