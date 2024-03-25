package com.example.slowstep_pjt.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Integer mbrNo;
    private String mbrNm;
    private String mbrPwd;
    private String mbrRrno; // residentRegistrationNumber의 약어
    private String mbrEml;
    private String mbrTelno;
    private String ogdpInstNm;
    private char jobTyp;
}