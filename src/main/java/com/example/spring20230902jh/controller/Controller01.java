package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {
    //프로토콜이 있다.
    @RequestMapping("/path1")
    public  void  m1(){
        System.out.println("cotroller");
    }
    
    @RequestMapping("/")
    public void  m2(){
        System.out.println("/ 경로");
    }
    @RequestMapping("/path2")
    public void m3(){
        System.out.println("/path2");
    }


}
