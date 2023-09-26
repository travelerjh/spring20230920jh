package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("main14")
public class Controller14 {
    @RequestMapping("sub1")
    public void m1(){
    }

    @RequestMapping(value = "sub2",method = RequestMethod.GET)
    public void m2(
            @RequestParam String id,
            @RequestParam String password

    ){
        System.out.println("id = " + id);
        System.out.println("password = " + password);
        System.out.println("m2");
    }
    @RequestMapping(value = "sub2",method = RequestMethod.POST)
    public void  m3(
               @RequestParam String id,
                @RequestParam String password

    ){
            System.out.println("id = " + id);
            System.out.println("password = " + password);
        System.out.println("m3");
    }

    @RequestMapping("sub3")
    public void m3(){


    }


//    @RequestMapping(value = "sub4",method = RequestMethod.POST)
    @PostMapping("sub4")
//    별일 없으면  post ,get Mapping  을 사용할거야

    public void m4(
            String title,
            String content
    ){
        System.out.println("title = " + title);
        System.out.println("content = " + content);

    }

    @GetMapping("sub5")
    public  void  m5(){

    }
    @PostMapping("sub6")
    public  void  m6(
            String username,
            String password
    ){
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }


    }


