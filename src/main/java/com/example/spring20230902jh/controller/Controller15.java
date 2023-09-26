package com.example.spring20230902jh.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main15")
public class Controller15 {
    @GetMapping("sub1")
    public void m1(){

    }

    @GetMapping("sub2")
    public void m2(
        //session을 사용하고 싶으면 메소드
            HttpSession session,
        HttpServletRequest request
    ){
        System.out.println();
        System.out.println("request = " + request.getRemoteHost());
        System.out.println("session.getId() = " + session.getId());
        System.out.println();
    }

    @GetMapping("sub3")
    public void m3(HttpSession session,String name,HttpServletRequest request){
        if(!name.isBlank()){
            session.setAttribute("username",name);
        }
        Object username = session.getAttribute("username");
        System.out.println(request.getRemoteHost());
        System.out.println(username);
    }


}
