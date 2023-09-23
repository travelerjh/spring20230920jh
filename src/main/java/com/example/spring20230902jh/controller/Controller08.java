package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {

@RequestMapping("sub1") // 모델은 보여주는 목적
    public  void  m1(Model model){
    model.addAttribute("attr1","val1");
//컨틀로러는 모델 객채에 val1을 담았다.
    // attr1 으로 부르면 val1 을 꺼낸다.
    model.addAttribute("attr2","val2");
}


@RequestMapping("sub2")
    public void  m2(Model model){
    model.addAttribute("propone","❤");
    model.addAttribute("propTWO","😎");
}

@RequestMapping("sub3")
    public  void  m3(Model model){
    model.addAttribute("myName","조나단");
    model.addAttribute("yourAddress","경기도 일산서구");
    model.addAttribute("herEmail","nsdf@nbaerc.om");

}


}

