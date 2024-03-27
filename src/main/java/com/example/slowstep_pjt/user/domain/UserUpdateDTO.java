
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
public class UserUpdateDTO {
    @NotBlank
    private String mbrPwd; // 사용자 비밀번호
    @Email
    private String mbrEml; // 사용자 이메일
    private String mbrTelno; // 사용자 전화번호
}
