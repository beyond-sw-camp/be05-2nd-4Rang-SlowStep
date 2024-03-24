package com.example.slowstep_pjt.user.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String name;
    private String pwd;
    private String rrn; // residentRegistrationNumber의 약어
    private String email;
    private String phone;
    private String affiliation;
    private char occupation;
}
