package com.example.slowstep_pjt.user.ctrl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.slowstep_pjt.user.domain.UserDTO;
import com.example.slowstep_pjt.user.service.UserServiceImpl;

import jakarta.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "user")
    private UserServiceImpl userService;
    
    private final PasswordEncoder passwordEncoder;

    public UserController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public String login(@RequestParam("id") String id,
                        @RequestParam("pwd") String pwd,
                        RedirectAttributes redirectAttributes) {
        // 이메일과 비밀번호를 기반으로 로그인 처리
        UserDTO user = userService.getUserByEmail(pwd);
        if (user != null) {
            // 비밀번호가 일치하는지 확인
            if (passwordEncoder.matches(pwd, user.getPwd())) {
                // 로그인 성공
                // 사용자 유형에 따라 다른 페이지로 이동
                if (user.getEmail().equals("doctor")) {
                    return "redirect:/doctor_home";
                } else if (user.getEmail().equals("nurse")) {
                    return "redirect:/nurse_home";
                }
            }
        }
        // 로그인 실패 시 에러 메시지 전달 후 로그인 페이지로 리다이렉트
        redirectAttributes.addFlashAttribute("error", "아이디 또는 비밀번호를 확인하세요");
        return "redirect:/login";
    }
}
