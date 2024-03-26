package com.example.slowstep_pjt.user.ctrl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.slowstep_pjt.user.domain.UserDTO;
import com.example.slowstep_pjt.user.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "User", description = "계정")
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    
    @PostMapping("/login")
    @Operation(summary = "로그인 기능", description = "사용자가 저장된 DB를 통해 이메일과 비밀번호로 로그인 하는 기능") 
    public ResponseEntity<UserDTO> login(@Valid @RequestParam("id") String id,
                        @RequestParam("pwd") String pwd,
                        HttpSession session,
                        RedirectAttributes attr) {
           
        System.out.println("debug UserController client path/user/login");

        UserDTO response = userService.loginService(id);

        System.out.println("debug >>> ctrl result ," + response);
        if (response != null && response.getMbrPwd() != null) {
            // 암호화 이후 로그인 처리
            if (passwordEncoder.matches(pwd, response.getMbrPwd())) {
                System.out.println("debug >>> matches() true");
                response.setMbrPwd(pwd);
                session.setAttribute("loginUser", response);
                System.out.println("session >>>>" + session.getAttribute("loginUser"));
                
                // 사용자의 직업 유형에 따라 다른 홈페이지로 리다이렉트
                if (response.getJobTyp() == 'D') {
                    System.out.println("의사입니다!");
                    return new ResponseEntity<> (response, HttpStatus.OK);
                } else if (response.getJobTyp() == 'N') {
                    System.out.println("간호사입니다!");
                    return new ResponseEntity<> (response, HttpStatus.OK);
                } else {
                    // 기타 직업 유형에 따른 처리
                    return new ResponseEntity<> (response, HttpStatus.OK);
                }
            } else {
                System.out.println("debug>>>비밀번호가 일치하지 않습니다");
                attr.addFlashAttribute("failMsg", "비밀번호가 일치하지 않습니다");
                return new ResponseEntity<> (response, HttpStatus.OK);
            }
        } else {
            System.out.println("debug>>>아이디가 일치하지 않습니다");
            attr.addFlashAttribute("failMsg", "아이디가 일치하지 않습니다");
            return new ResponseEntity<> (response, HttpStatus.OK);
        }
    }


    @GetMapping("/logout")
    @Operation(summary = "로그아웃 기능", description = "사용자가 세션에 있는 정보를 제거해서 로그아웃 하는 기능")
    public ResponseEntity<String> logout(HttpSession session) {
        System.out.println("debug UserController client path/user/logout");

        session.invalidate();
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PostMapping("/update")
    @Operation(summary = "사용자 정보 업데이트", description = "사용자의 이메일, 전화번호, 비밀번호 등을 업데이트하는 기능")
    public ResponseEntity<String> updateUserInfo(@Valid @RequestBody UserDTO userDTO, HttpSession session) {
    // 세션에서 로그인 사용자 정보를 가져옴
    UserDTO loginUser = (UserDTO) session.getAttribute("loginUser");
    if (loginUser == null) {
        return new ResponseEntity<>("사용자가 로그인하지 않았습니다.", HttpStatus.FORBIDDEN);
    }
    userDTO.setMbrNo(loginUser.getMbrNo());
    System.out.println(userDTO.toString());
    System.out.println("debug >>> "+ loginUser.getMbrNm());
    System.out.println("debug >>>>>" +userDTO.getMbrNm() );


    // // 세션에 있는 사용자 번호(mbrNo)와 요청으로 받은 사용자의 번호가 일치하는지 확인
    // if (!loginUser.getMbrNo().equals(userDTO.getMbrNo())) {
    //     return new ResponseEntity<>("잘못된 사용자입니다.", HttpStatus.BAD_REQUEST);
    // }

    // 비밀번호 암호화 처리
    if (userDTO.getMbrPwd() != null && !userDTO.getMbrPwd().isEmpty()) {
        System.out.println("비밀번호 암호화 시작");
        String encodedPassword = passwordEncoder.encode(userDTO.getMbrPwd());
        System.out.println("비밀번호 암호화 종료 : " + encodedPassword);
        userDTO.setMbrPwd(encodedPassword);
        System.out.println("끝!!!");
    }

    try {
        // 사용자 정보 업데이트 서비스 호출
        userService.updateUserInfo(userDTO);
        return new ResponseEntity<>("사용자 정보가 업데이트되었습니다.", HttpStatus.OK);
    } catch (Exception e) {
        e.printStackTrace();
        return new ResponseEntity<>("사용자 정보 업데이트에 실패하였습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

    
    
}