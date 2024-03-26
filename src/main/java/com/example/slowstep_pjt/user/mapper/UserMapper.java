package com.example.slowstep_pjt.user.mapper;

import org.apache.ibatis.annotations.Mapper;


import com.example.slowstep_pjt.user.domain.UserDTO;



@Mapper
public interface UserMapper {

    public UserDTO loginRow(String mbrEml) ;

   

    
    
}