package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.MyDto10;
import com.example.spring20230902jh.domain.MyDto9;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main10")
public class Controller10 {
    @RequestMapping("sub1")
    public  void  m1(Model model){
        MyDto9 m1 = new MyDto9();
        MyDto9 m2 = new MyDto9();
        MyDto9 m3 = new MyDto9();

        m1.setFirstname("손");
        m2.setFirstname("차");

        model.addAttribute("student", List.of(m1,m2));


        m1.setFirstname("손");
        m2.setFirstname("차");
        m3.setFirstname("박");

        model.addAttribute("so",List.of(m1,m2,m3));
    }

    @RequestMapping("sub2")
    public  void  m2(Model model){
        MyDto9 m1 = new MyDto9();
        MyDto9 m2 = new MyDto9();

        m1.setLastname("무식");
        m2.setLastname("두식");

        model.addAttribute("man", Map.of("p1",m1,"p2",m2));

        model.addAttribute("people",Map.of("1st",m1,"2nd",m2 ));
    }

    @RequestMapping("sub3")
    public  void  m3(Model model){
        MyDto10 m1 =new MyDto10();
        m1.setName("son");
        m1.setId(123);
        m1.setFoods(List.of("pizza","buger","milk"));

        m1.setCars(List.of("포르쉐","테슬라","루시드"));
        model.addAttribute("p1",m1);
    }


    @RequestMapping("sub4")
public void  m4(Model model){
        model.addAttribute("list",List.of("tesla","kia","ss"));
        model.addAttribute("foodlist",List.of("c","a","k","e"));
    };

    @RequestMapping("sub5")
    public void m5(Model model){
        model.addAttribute("foodlist",List.of("c","a","k","e"));
        model.addAttribute("names",List.of("흥민","메시","날두","지뉴"));
    }

    @RequestMapping("sub6")
public void m6(Model model){
        List<MyDto9>list = new ArrayList<>();
        list.add(new MyDto9("s","son","hm","fot","010"));
        list.add(new MyDto9("k","kim","gm","fot","011"));
        list.add(new MyDto9("l","lee","ps","fot","012"));


        model.addAttribute("so",list);
    }

}
