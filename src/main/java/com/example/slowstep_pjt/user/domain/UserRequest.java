package com.example.slowstep_pjt.user.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "이메일은 필수입력사항입니다.")
    private String mbrEml;
    @NotBlank(message = "비밀번호는 필수입력사항입니다.")
    private String mbrPwd;
   
}
