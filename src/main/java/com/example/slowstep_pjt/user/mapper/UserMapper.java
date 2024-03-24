package com.example.slowstep_pjt.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.slowstep_pjt.user.domain.UserDTO;

@Mapper
public interface UserMapper {
    
   

    UserDTO findByEmail(String email);
}
