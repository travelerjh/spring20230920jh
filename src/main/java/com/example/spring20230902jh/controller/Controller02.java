package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class Controller02 {

    @RequestMapping("sub1")
    public void m1(){
        System.out.println("main/sub1");
    }

    @RequestMapping("sub2")
    public void m2(){
        System.out.println("메인서브2");
    }

    @RequestMapping("sub3")
    private  void  m3(){
        System.out.println("프라이빗 가능?");
    };


}

