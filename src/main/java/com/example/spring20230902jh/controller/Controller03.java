package com.example.spring20230902jh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main2")
public class Controller03 {

    //    prametername =  paraemetervalue
    // main2/sub1?address=seoul
    @RequestMapping("sub1")
    public void m1(WebRequest request){
        String address = request.getParameter("address");
        System.out.println("address = " + address);

        System.out.println("일하는중");
    }

    @RequestMapping("sub2")
    public void m2(WebRequest request){
        String name=request.getParameter("name");
        String address = request.getParameter("address");

        System.out.println("address = " + address);
        System.out.println("name = " + name);
    }


    @RequestMapping("sub3")
    public void m3(@RequestParam("name")String name ){

        System.out.println("name = " + name);
    }
    // naver.com/main2/sub4?name=son&address=eng
    @RequestMapping("sub4")
    public  void  m4(@RequestParam("name")String name ,@RequestParam("address") String address){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }


    //http://localhost:8080/main2/sub5?email=abc@gmail.com&gender=%EB%82%A8%EC%9E%90&number=01051468004
    @RequestMapping("sub5")
    public  void  m5(@RequestParam("email") String email , @RequestParam("gender") String gender ,@RequestParam("number") String number ){
        System.out.println("email = " + email);
        System.out.println("gender = " + gender);
        System.out.println("number = " + number);

    }

    @RequestMapping("sub6")
    public void  m6(@RequestParam("name")String name
    ,                @RequestParam("age")String age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        //age는 나중에  int 로 활용될수도 있다.
        Integer a= Integer.valueOf(age);
    }

    // /main2/sub7?name=son&age=70
    // /main2/sub7?name=son&age=사십 ( X )
    @RequestMapping("sub7")
    public  void  m7(@RequestParam("age")Integer age,
                     @RequestParam("name")String name){
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }


    //main2/sub8?address-seuol&married=false&age=66
    @RequestMapping("sub8")
    public void  m8(
            @RequestParam("address") String address,
            @RequestParam("married") Boolean marreid,
            @RequestParam("age") Integer age
    ){
        System.out.println("address = " + address);
        System.out.println("marreid = " + marreid);
        System.out.println("age = " + age);
    }

    @RequestMapping("sub9")
    public  void  m9(@RequestParam(value = "name",required = false)String name
                    ){
        System.out.println("name = " + name);
    }


    @RequestMapping("sub10")
    public void  m10(
            @RequestParam("address") String address,
            @RequestParam(value = "age",required = false) Integer age
    ){
        System.out.println("address = " + address);
        System.out.println("age = " + age);
    }


}
