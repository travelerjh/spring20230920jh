package com.example.spring20230902jh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main12")
public class Controller12 {
    @RequestMapping({"sub1","sub2","sub3"})
    public void  m1(Model model){
    }

    @RequestMapping("sub4")
    public  void m4(@RequestParam String name, Integer age, Model model){
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        model.addAttribute( "age",age);
        model.addAttribute("name",name);

    }

    @RequestMapping("sub5")
    public  void  m5(String name,Model model){
        model.addAttribute("name",name);

    }

    @RequestMapping("sub6")
    public  void  m6(){

    }


}
