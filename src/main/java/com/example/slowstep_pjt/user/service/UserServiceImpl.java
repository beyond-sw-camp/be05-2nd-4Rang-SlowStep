package com.example.slowstep_pjt.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.user.domain.UserDTO;
import com.example.slowstep_pjt.user.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
 

    @Override
    public UserDTO getUserByEmail(String email) {
        // 구현 내용은 필요에 따라 추가하십시오.
        return userMapper.findByEmail(email);
    }
}
