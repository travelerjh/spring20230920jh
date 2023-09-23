package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.MyDto4;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main6")
public class Controller06 {

    @RequestMapping("sub1")
    public  void  m1(String name, String address){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    //   /main.sub2?singed=true&email=ab@gamil.com&gender=male

    @RequestMapping("sub2")
    public void m2(MyDto4 myDto4){
        System.out.println("myDto4 = " + myDto4);

    }



}
