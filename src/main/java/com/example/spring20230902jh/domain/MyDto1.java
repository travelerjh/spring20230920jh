package com.example.spring20230902jh.domain;

public class MyDto1 {

    // name property가 소문자
    // homeAddress property
   //

    private String name ;


    private  String homeAddress;

    private  Boolean marrried;
    private  Boolean  ismarried;

    public Boolean getMarrried() {
        return marrried;
    }

    public void setMarrried(Boolean marrried) {
        this.marrried = marrried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
