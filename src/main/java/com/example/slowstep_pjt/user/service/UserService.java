package com.example.slowstep_pjt.user.service;


import com.example.slowstep_pjt.user.domain.UserDTO;
import com.example.slowstep_pjt.user.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

import java.util.*;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public UserDTO loginService(String mbrEml){
        System.out.println("debug>>>>> service loginService");
        return userMapper.loginRow(mbrEml);
    
    }

  
}