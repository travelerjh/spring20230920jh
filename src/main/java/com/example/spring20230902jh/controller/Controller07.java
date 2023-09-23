package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller@RequestMapping("main7")
public class Controller07 {

    @RequestMapping("sub1") // 풀네임 RequestMapping Handler
    public String m1(){
        System.out.println("컨트롤러1");
        return "view1";
    }

    @RequestMapping("sub2")
    public  String m2(){
        System.out.println("컨트롤러 2");

        return  "html2";
    }

    @RequestMapping("sub3") //요청 경로가 view 이름이 됨.   --->  /main7/sub3
                                                                //WEB-INF/jsp.main7/sub3.jsp
    public void m3(){
        System.out.println("컨트롤러3");
    }

    @RequestMapping("sub4")
    public String m4(){
        return "/main7/html4";
    }

    @RequestMapping("sub5")
    public void m5(){

    }


}
