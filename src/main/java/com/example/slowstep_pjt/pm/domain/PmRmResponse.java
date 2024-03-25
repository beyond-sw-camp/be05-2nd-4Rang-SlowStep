package com.example.slowstep_pjt.pm.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class PmRmResponse {
    private Integer pmRmNo  ;
    private Integer mdNo    ;
    private Integer rnNo    ;
}
