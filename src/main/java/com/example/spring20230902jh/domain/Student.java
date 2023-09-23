package com.example.spring20230902jh.domain;

public class Student {
    //email peroerty(읽기 쓰기 가능)
    //information property(읽기 쓰기 가능)

    //get 을 지우면 읽기 불
    private String eamil;
    private String  info;

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getInfomation() {
        return info;
    }

    public void setInfomation(String info) {
        this.info = info;
    }
}
