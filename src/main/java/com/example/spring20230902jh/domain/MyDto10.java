package com.example.spring20230902jh.domain;

import lombok.Data;

import java.util.List;

@Data
public class MyDto10 {
    private  String name;
    private Integer id;
    private List<String> foods;
    private List<String> cars;

}
