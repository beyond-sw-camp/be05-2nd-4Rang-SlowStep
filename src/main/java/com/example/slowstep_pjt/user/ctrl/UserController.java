package com.example.slowstep_pjt.user.ctrl;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.slowstep_pjt.user.domain.UserDTO;
import com.example.slowstep_pjt.user.service.UserServiceImpl;

import jakarta.annotation.Resource;



@Controller
@RequestMapping("/user")

public class UserController {

    @Resource(name = "user")
    private UserServiceImpl userService;

    @GetMapping("/user_happy")
    public String getMethodName(Model model) {

        System.out.println("debug >> happy.jsp");
        System.out.println("not happy...");

        List<UserDTO> list = userService.getUser();

        model.addAttribute("list", list);

        return "happy";
    }
    
    
}
