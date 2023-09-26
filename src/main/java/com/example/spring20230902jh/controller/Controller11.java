package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public  void  m1(){

    }
    @RequestMapping("sub2")
    public  void  m2(){
    }

    @RequestMapping("sub3")
    public  void  m3(){

    }
//                         { sub4 ,sub5  } 배열로 하면 된다 .
    @RequestMapping({"sub4" ,  "sub5","sub6"})
    public  void  m4(){

    }

    @RequestMapping("sub7")
    public  void  m7(@RequestParam(value = "show" ,defaultValue = "false") Boolean show, Model model){
        if(show){
            List<MyDto9> list77 =new ArrayList<>();
            list77.add(new MyDto9(31L, "son", "hm", "football", "010"));
            list77.add(new MyDto9(32L, "lee", "ki", "paris", "011"));
            list77.add(new MyDto9(33L, "김", "두식", "서울", "02"));
            list77.add(new MyDto9(34L, "김", "봉석", "부산", "03"));
            list77.add(new MyDto9(35L, "장", "희수", "제주", "05"));
            model.addAttribute("list7", list77);
        }

    }


}
