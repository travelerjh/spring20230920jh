package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main5")
public class Controller05 {
    @RequestMapping(value = "sub1",params = {"name","age","address" } )
    public void  m1(String name ,Integer age ,String address  ){
        //값들을 객채의 필드
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("address = " + address);
        //컨트롤러가 서비스한테 넘겨준다 .
    }


    // main5/sub2?name=lee&age=30

    @RequestMapping("sub2")
    public void m2 (String name, Integer age){
         //객체에
        Person5 o1= new Person5();
        o1.setName(name);
        o1.setAge(age);
        System.out.println("o1.toString() = " + o1.toString());


        //service.action(o1);
    }

    @RequestMapping("sub3")
    public void m3(Person5 person5){
        System.out.println("person5 = " + person5);
    }


    @RequestMapping("sub4")
    public  void  m4(Student5 student5){
        System.out.println("student5 = " + student5);
    }

}

class  Student5 {
    private  String email;
    private  String info;
    private Integer age;
    private  Boolean married;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }
    @Override
    public String toString() {
        return "Student5{" +
                "email='" + email + '\'' +
                ", info='" + info + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}



















class Person5{
    String name;
    int age;

    @Override
    public String toString() {
        return "Person5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(Integer age) {

    }

    public void setName(String name) {
    }
}