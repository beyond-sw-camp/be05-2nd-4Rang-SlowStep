package com.example.slowstep_pjt.pm.domain;

import java.util.Date;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PmResponse {
    private Integer pmNo        ;
    private Integer pmRmNo      ;
    private String  pmCn        ;
    private String  trsmDir     ;
    private String  rdYn        ;
    private Date    pmDsptchDt  ;
    private String  deleteYn    ;
    private Date    deleteDt    ;
    private Date    rdDt        ;
    private String  mbrNm       ;
    private String  mdPicDept   ;
}
