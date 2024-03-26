package com.example.slowstep_pjt.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.example.slowstep_pjt.user.domain.UserDTO;

@Mapper
public interface UserMapper {
    // 기존의 로그인 메소드
    UserDTO loginRow(String mbrEml);

    // 사용자 정보를 업데이트하는 메소드 추가
  
    void updateUser(UserDTO userDTO);
}
