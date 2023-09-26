package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.Ex;
import com.example.spring20230902jh.domain.MyDto7;
import com.example.spring20230902jh.domain.MyDto8;
import com.example.spring20230902jh.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main9")
public class Controller09 {
    @RequestMapping("sub1")
    public void  m1(Model model){
        model.addAttribute("arr","손흥민");
        model.addAttribute("arr2",300);

        //모델 속성이 배열일 경우
        model.addAttribute("arr3",new String[]{"son","kim","lee"});

        String[] myarr4={"korea","china","japan"};
        model.addAttribute("arr4",myarr4);
    }


@RequestMapping("sub2")
    public  void  m2(Model model){
        String[] arr1= {"최","재","희"};
        model.addAttribute("myName",arr1);
        String[] arr2= {"손","흥","민"};
        model.addAttribute("yourEmail",arr2);
        String[] arr3={"naver","google"};
        model.addAttribute("herAddress",arr3);
}
@RequestMapping("sub3")
public void  m3(Model model){
      //  model.addAttribute("s", List.of("두식","복석","지석"));
        model.addAttribute("list1",List.of("예산","도고","백석"));
        model.addAttribute("maplist1",List.of("지리산","한라산","백두산"));
        model.addAttribute("cities",List.of("NY","SF","FL","LA"));
}


@RequestMapping("sub4")
    public void  m4(Model model){
        var map = Map.of("son",7,"lee",19 ,"kim",30);
        model.addAttribute("map22",map);

        var map2 =Map.of("red" ,"빨강","blue","블루","black","검정" );
        model.addAttribute("color",map2);

        var map3= Map.of("seoul","서울","busan","부산");
        model.addAttribute("cityMap",map3);
    }

    @RequestMapping("sub5")
    public void  m5(Model model){
        var map1 = Map.of("phone1","iphone","phone2","galaxy");
        var map2 = Map.of("korea","seoul","us","ny");
        var map3 = Map.of("1st","hamburger","2nd","pizza");

        model.addAttribute("phone",map1);
        model.addAttribute("caps",map2);
        model.addAttribute("foods",map3);
    }
    @RequestMapping("sub6")
    public void  m6(Model model , Ex ex){
        model.addAttribute("attr",ex);
        model.addAttribute("attr3",new MyDto7());
    }

    @RequestMapping("sub7")
    public void m7(Model model){
        MyDto8 o1 =new MyDto8();
        o1.setFood("pizza");
        o1.setComputer("intel");
        o1.setBirthDate("2020-01-01");
        model.addAttribute("person1",o1);
    }
/*
    @RequestMapping("sub8")
    public  void  m8(Model model){
        MyDto9  m9 = new MyDto9();
        m9.setClassname("중앙 ");
        m9.setId("학원");
        m9.setFirstname("최");
        m9.setLastname("재희");
        m9.setPhonenumber("010514680004");
        model.addAttribute("student",m9);
    }

*/


}


