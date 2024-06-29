//package com.java.springboot.util;
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.util.StringUtils;
//
//import java.io.IOException;
//@WebFilter(urlPatterns = "/*")
//public class LocalFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//    HttpServletRequest req = (HttpServletRequest) servletRequest;
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//
//        String url = req.getRequestURL().toString();
//        if(url.contains("user")){
//            filterChain.doFilter(servletRequest,servletResponse);
//            return;
//        }
//        String jwt = req.getHeader("token");
//        System.out.println(jwt);
//        if(!StringUtils.hasLength(jwt)){
//            return;
//        }
//        try {
//            Jwt.parseJWT(jwt);
//        } catch (Exception e) {//jwt解析失败
//            e.printStackTrace();
//            return;
//        }
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//}
