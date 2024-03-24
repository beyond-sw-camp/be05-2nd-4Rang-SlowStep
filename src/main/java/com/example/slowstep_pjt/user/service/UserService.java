package com.example.slowstep_pjt.user.service;

import com.example.slowstep_pjt.user.domain.UserDTO;
import java.util.*;

public interface UserService {

    // 이메일을 기반으로 사용자 조회
    public UserDTO getUserByEmail(String email);

 
    
}
