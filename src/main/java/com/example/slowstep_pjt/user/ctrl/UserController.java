package com.example.slowstep_pjt.user.ctrl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.slowstep_pjt.user.domain.UserRequest;
import com.example.slowstep_pjt.user.domain.UserResponse;
import com.example.slowstep_pjt.user.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    
    @PostMapping("/login") 
    public String login(@RequestParam("id") String id,
                        @RequestParam("pwd") String pwd,
                        HttpSession session,
                        RedirectAttributes attr) {
           
        System.out.println("debug UserController client path/user/login");

        UserResponse response = userService.loginService(id);

        System.out.println("debug >>> ctrl result ," + response);
        if (response != null && response.getMbrPwd() != null) {
            // 암호화 이후 로그인 처리
            if (passwordEncoder.matches(pwd, response.getMbrPwd())) {
                System.out.println("debug >>> matches() true");
                response.setMbrPwd(pwd);
                session.setAttribute("loginUser", response);
                
                // 사용자의 직업 유형에 따라 다른 홈페이지로 리다이렉트
                if (response.getJobTyp() == 'D') {
                    System.out.println("의사입니다!");
                    return "redirect:/doctor_home";
                } else if (response.getJobTyp() == 'N') {
                    System.out.println("간호사입니다!");
                    return "redirect:/nurse_home";
                } else {
                    // 기타 직업 유형에 따른 처리
                    return "redirect:/login";
                }
            } else {
                System.out.println("debug>>>비밀번호가 일치하지 않습니다");
                attr.addFlashAttribute("failMsg", "비밀번호가 일치하지 않습니다");
                return "redirect:/login";
            }
        } else {
            System.out.println("debug>>>아이디가 일치하지 않습니다");
            attr.addFlashAttribute("failMsg", "아이디가 일치하지 않습니다");
            return "redirect:/login";
        }
    }
}
