package com.example.spring20230902jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;

@Controller
@RequestMapping("main18")
public class Controller18 {
    @GetMapping("sub1")
    public void m1(Model model) throws Exception {

        String url="jdbc:mariadb://localhost:3306/w3schools";
        String username="root";
        String password ="1234";

        String sql= """
        SELECT customerName 
        FROM customers 
        where CustomerID = 1;
""";

        //JDBC 핵심코드

        // 연결 객채가 생긴다.
        Connection connection = DriverManager.getConnection(url, username, password);
        //statament 가 있어야 쿼리를 실행할수 있따.
        Statement statement =connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        try(connection;statement) {
        try (resultSet){
        resultSet.next();
        String name = resultSet.getString(1);
        // 모델에 넣어서 포워드 했더니 jsp 에서 보여주더라
        model.addAttribute("cutomerName",name);

        }

        }





    }






}
