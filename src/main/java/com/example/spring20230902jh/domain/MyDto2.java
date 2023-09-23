package com.example.spring20230902jh.domain;

public class MyDto2 {
    //name property (문자열)
    //address poroperty (문자열)
    //birthDay property(문자열)
    //signed property( 논리형)

    private  String name;
    private  String  address;
    private String brithday;
    private Boolean signed;

    @Override
    public String toString() {
        return "MyDto2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", brithday='" + brithday + '\'' +
                ", signed=" + signed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public Boolean getSigned() {
        return signed;
    }

    public void setSigned(Boolean signed) {
        this.signed = signed;
    }
}
