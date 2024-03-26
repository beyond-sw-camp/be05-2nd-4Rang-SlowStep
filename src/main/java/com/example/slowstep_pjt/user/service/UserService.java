package com.example.slowstep_pjt.user.service;


import com.example.slowstep_pjt.user.domain.UserDTO;
import com.example.slowstep_pjt.user.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

import java.util.*;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public UserDTO loginService(String mbrEml){
        System.out.println("debug>>>>> service loginService");
        return userMapper.loginRow(mbrEml);
    
    }

    // UserService.java


// 사용자 정보 업데이트를 위한 메소드 추가
public void updateUserInfo(UserDTO userDTO) {
     System.out.println("Debug >>>> service updateService");
     userMapper.updateUser(userDTO);
}
}



  
