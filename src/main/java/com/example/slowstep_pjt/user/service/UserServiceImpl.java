package com.example.slowstep_pjt.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.slowstep_pjt.user.domain.UserDTO;
import com.example.slowstep_pjt.user.mapper.UserMapper;

@Service("user")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> getUser() {

        System.out.println("debug >> UserServiceImpl getUser()");
        List<UserDTO> list = userMapper.findAll();

        return list;
    }
    


}
