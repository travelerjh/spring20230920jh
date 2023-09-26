package com.example.spring20230902jh.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class MyDto11 {
    private String userId;
    private String userEmail;
    private LocalDate birthDate;
    private List<String> hobby;

}
