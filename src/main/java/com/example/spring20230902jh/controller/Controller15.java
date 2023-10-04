package com.example.spring20230902jh.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

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

    @GetMapping("sub4")
    public void m4(){

    }


//     세션에서 넣어놓으면 정보가 계속 이어진다.
    @PostMapping("sub5")
    public void  m5(String name , HttpSession session ){
        System.out.println("name = " + name);
        session.setAttribute("username",name);

    }

    @GetMapping("sub6")
    public void m6(){

    }

    @GetMapping("sub7")
    public void m7(){

    }

    @PostMapping("sub8")
    public  void  m8(String food , HttpSession session){
        session.setAttribute("food",food);

    }

    @GetMapping("sub9")
    public  void  m9(  ){

    }


    @GetMapping("sub10")
    public  void  m10( Model model ,HttpSession session ){
        model.addAttribute("model","탕후루");
        session.setAttribute("set","마라탕");

        model.addAttribute("att","돈까스");
        session.setAttribute("att","제육");

    }


        @GetMapping("sub11")
        public  void  m11(Model model ,HttpSession session){
            model.addAttribute("items", List.of("두식","봉석"));
            session.setAttribute("items",List.of("손흥민","김민짜이","강인리"));
        }

































}
