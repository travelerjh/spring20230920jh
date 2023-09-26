package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.MyDto11;
import com.example.spring20230902jh.domain.MyDto12;
import com.example.spring20230902jh.domain.MyDto13;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("main13")
public class Controller13 {
    @RequestMapping({"sub1","sub2","sub4" ,"sub7","sub9","sub11","sub13" })
    public void m1(){
    }
    @RequestMapping("sub3")
    public void m3(
            //  @RequestParam 일단  붙쳐 넣는다.

            @RequestParam("param1") String param1,
            @RequestParam("parma2") Integer param2,
            @RequestParam("parma3") String param3,
//            자바에서 날짜는  [   LocalDate   ] param4 으로 사용해야함
            @RequestParam("parma4")LocalDate param4,
            // 날짜 시간은 [   LocalDateTime  ] 로 사용
            @RequestParam("parma5") LocalDateTime param5,
            @RequestParam("parma6") String param6,
            @RequestParam("parma8") String[] param8,
            @RequestParam("parma8")List<String> param9


            ){
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        System.out.println("param3 = " + param3);
        System.out.println("param4 = " + param4);
        System.out.println("param5 = " + param5);
        System.out.println("param6 = " + param6);
        System.out.println("param8 = " + param8);
        System.out.println("param8 = " + param9);
        System.out.println("----------------------------");
    if (param8!=null) {
        Arrays.stream(param8).forEach(System.out::println);
    }

    }

    @RequestMapping("sub5")
    public void  m4(

            @RequestParam("userId") String userId,
            @RequestParam("userEmail") String userEmail,
            @RequestParam("birthDate")LocalDate birthDate,
            @RequestParam("hobby") List<String> hobby
    ){

        System.out.println("userId = " + userId);
        System.out.println("userEmail = " + userEmail);
        System.out.println("birthDate = " + birthDate);
        System.out.println("hobby = " + hobby);
    }

    @RequestMapping("sub6")
    public void m6(MyDto11 user){
        System.out.println("user = " + user);
    }


    @RequestMapping("sub8")
    private void  m8(MyDto12 info, Model model){
        System.out.println("info = " + info);
        model.addAttribute("name",info.getName());
        model.addAttribute("id",info.getId());
        model.addAttribute("todo",info.getTodos());
        model.addAttribute("address",info.getAddress());
    }

    @RequestMapping("sub10")
    public  void  m10(
            @RequestParam("name")  String name
    ){
        System.out.println("name = " + name);
    }


    @RequestMapping("sub12")
    public  void  m12(MyDto13 vo ,Model model){
        System.out.println("vo = " + vo);
        model.addAttribute("name",vo.getName());
        model.addAttribute("address",vo.getAddress());
        model.addAttribute("description",vo.getDescription());
    }


    @RequestMapping("sub14")
    public  void  m14(String t,String e,String s,String l,String a ,Model model){
        System.out.println("t = " + t);
        System.out.println("e = " + e);
        System.out.println("s = " + s);
        System.out.println("l = " + l);
        System.out.println("a = " + a);
    model.addAttribute("t",t);
    model.addAttribute("e",e);
    model.addAttribute("s",s);
    model.addAttribute("l",l);
    model.addAttribute("a",a);

    }

}

