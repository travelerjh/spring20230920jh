package com.example.spring20230902jh.domain;

public class Person {

    //   name porperty ( 읽기 ,쓰기 )
    //    age porperty ( 읽기 ,쓰기 )
    //address porperty ( 읽기 ,쓰기 )


    private  String name;
    private  Integer age;

    private String address;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
