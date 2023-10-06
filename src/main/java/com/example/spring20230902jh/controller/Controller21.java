package com.example.spring20230902jh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Controller
@RequestMapping("main21")
public class Controller21 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public  void  m1() throws  Exception{
        String sql = """
                select CustomerName  name ,country  con
                from customers 
                where CustomerID <=3
                
                """;
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        try (connection;statement;resultSet){

            System.out.println("고객 목록");
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String country = resultSet.getString("con");

                System.out.println(name +" : " + country);
            }
        }
    }



    @GetMapping("sub2")
    public  void  m2() throws  Exception{
        String sql = """
                select concat(lastname ,' ', firstname) as fullname,
                        birthdate as birth,
                        notes as `desc`
                        from employees 
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        try (resultSet;connection;statement){
            while (resultSet.next()){
                String fullname = resultSet.getString("fullname");
                String birthday = resultSet.getString("birth");
                String desc = resultSet.getString("desc");

                System.out.println(fullname + "   " + birthday +"   "+ desc);

            }
        }


    }
























}
