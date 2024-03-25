package com.example.slowstep_pjt.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.slowstep_pjt.user.domain.UserRequest;
import com.example.slowstep_pjt.user.domain.UserResponse;



@Mapper
public interface UserMapper {

    public UserResponse loginRow(String mbrEml) ;

   

    
    
}
