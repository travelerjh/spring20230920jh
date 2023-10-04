package com.example.spring20230902jh.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("main16")
public class Controller16 {

    @Autowired
    private ServletContext application;
//    서블릿 컨텍스트


    @GetMapping("sub1")
    public void  m1(Model model , HttpSession session){
        model.addAttribute("model","추석");
        session.setAttribute("session","강강술래");
        application.setAttribute("application","보름달");

        // 같은 이름이면 어떻게 꺼낼까?

        model.addAttribute("m","모델");
        session.setAttribute("m","세션");
        application.setAttribute("m","어플리케이션");

        //서버가 가지고 있는 객채
        // 모든 리퀘스트 , 모든 세션이 공유하는 객채

    }

    @GetMapping("sub2")
    public  void  m2(HttpSession session ){

        Object count = session.getAttribute("count");
        if (count==null){
            session.setAttribute("count",0);
        }else {
            Integer countInet = (Integer)count;
            session.setAttribute("count",++countInet);
        }


    }

@GetMapping("sub3")
public void  m3(Model model , HttpSession session){
        model.addAttribute("model", "보름달");
        session.setAttribute("session","송편");
    System.out.println("model = " + model);
    System.out.println("session = " + session);
    }

@GetMapping("sub4")
    public void  m4(Model model ,HttpSession session){
    Object model1 = model.getAttribute("model");
    Object session1 = session.getAttribute("session");

    System.out.println("session1 = " + session1);
    System.out.println("model1 = " + model1);
    }


@GetMapping("sub5")
    public String m5(){

        return "/main16/sub5";
}

@GetMapping("sub6")
    public String  m6(){

    //redirection    redirect:
    // 다른곳(location)으로 가 !! 다른 응답(response, 302 )

        return  "redirect:/main16/sub5";
}


@GetMapping("sub7")
    public String m7(){
        return "redirect:https://www.naver.com";
}


//http 는   요청 과 응답으로 나뉜다.
     //    requset  / response


    @GetMapping("sub8")
    public String  m8(String email){
        //이메일 정보를 받아서
        // 2번째 요청이 왔을때 전달을 원한다
        //요청주소에 데이타를 붙일 수 있다 .
        //1. 쿼리스트링 name=son&age=20

        return "redirect:/main16/sub9?aemail="+email;
    }

    @GetMapping("sub9")
    public void  m9(String aemail){
        System.out.println("aemail = " + aemail);
    }

    @GetMapping("sub10")
    public String method10(String name, HttpSession session) {
        String processed = name + " 처리 결과";
        session.setAttribute("processedValue", processed);

        return "redirect:/main16/sub11";
    }

    @GetMapping("sub11")
    public void method11(HttpSession session) {
        Object processedValue = session.getAttribute("processedValue");
        System.out.println("processedValue = " + processedValue);
    }


    @GetMapping("sub12")
    public  String m12(String address , RedirectAttributes rttr){
        String processed= address+"처리결과";
        rttr.addFlashAttribute("processedValue",processed);
        //addFlashAttribute 잠깐 사용하는 느낌
        return "redirect:/main16/sub13";
    }

    // rttr.addFlashAttribute 잠깐 사라졌다 없어지고 model 에 들어간다.
    @GetMapping("sub13")
    public void m13(Model model){
        Object pro = model.getAttribute("processedValue");
        System.out.println("pro = " + pro);
    }


    //첫 요청을 main16/sub14


    @GetMapping("sub14")
    public String method14(RedirectAttributes rttr) {
        // /main16/sub15 요청할 때
        // foodList 라는 attribute를 꺼낼 수 있게
        // 코드작성
        String[] arr= {"s","e","x","y"};
        rttr.addFlashAttribute("foodList", arr);
        return "redirect:/main16/sub15";
       }

    @GetMapping("sub15")
    public void method15() {

    }


    @GetMapping("sub16")
    public String method16(RedirectAttributes rttr) {
        rttr.addFlashAttribute("flash","모델에 붙음");
        rttr.addAttribute("addr1","쿼리스트링에 붙음");
        rttr.addAttribute("addr2","서울 신촌");

        return "redirect:/main16/sub17";
    }

    @GetMapping("sub17")
    public void method17() {
        System.out.println("m17");
    }



















}
