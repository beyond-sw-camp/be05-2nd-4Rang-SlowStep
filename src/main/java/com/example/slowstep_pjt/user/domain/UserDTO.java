
package com.example.slowstep_pjt.user.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
public class UserDTO {
    private Integer mbrNo;
    private String mbrNm; //사용자 이름
    @NotBlank
    private String mbrPwd; // 사용자 비밀번호
    private String mbrRrno; // residentRegistrationNumber의 약어
    @Email
    private String mbrEml; // 사용자 이메일
    private String mbrTelno; // 사용자 전화번호
    private String ogdpInstNm; // 사용자 근무지
    private char jobTyp; //사용자 직업
}
