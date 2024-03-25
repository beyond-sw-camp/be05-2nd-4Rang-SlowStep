package com.example.slowstep_pjt.user.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, 
                            HttpServletResponse response, Object handler) throws Exception {
          System.out.println("Debug>>>>LoginInterceptor preHandler>>>>>>>>>>>>.");
          HttpSession session = request.getSession();
          if(session.getAttribute("loginUser") != null){
            System.out.println("debug>>>session exits y");
            response.sendRedirect("/board/list");
          }
          return true;
    }
}