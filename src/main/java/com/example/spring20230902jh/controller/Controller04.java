package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main4")
public class Controller04 {
    
    @RequestMapping("sub1")
    //@RequestParam 의 파람에 파라미터의 이름이 같으면
    //@RequsetParam 의 value 를 생략가능
   // public  void  m1(@RequestParam("name")String name){
    public  void  m1(@RequestParam String name){
        System.out.println("name = " + name);
    }


    @RequestMapping("sub2")
    public  void  m2(@RequestParam String address ,@RequestParam String email, @RequestParam Integer age){
        System.out.println("address = " + address);
        System.out.println("email = " + email);
        System.out.println("age = " + age);
    }

    @RequestMapping("sub3")
    public void m3(String name ,Boolean married){
        System.out.println("name = " + name);
        System.out.println("married = " + married);
    }

    // main4/sub4?check=true&eamil=abc@naver.com&age=55
    @RequestMapping("sub4")
    public void m4(String email, Boolean check , Integer age){
        System.out.println("email = " + email);
        System.out.println("check = " + check);
        System.out.println("age = " + age);
    }

    
}
