package com.example.spring20230902jh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main23")
public class Controller23 {
    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void  m1(String  keyword) throws  Exception{
        String sql= """
                select * from products 
                where productname like  ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"%"+keyword+"%");
        ResultSet resultSet = statement.executeQuery();

        try (connection;statement;resultSet){
        while (resultSet.next()){
            String name =resultSet.getString("productname");
            System.out.println("name = " + name);
        }

        }

    }

    @GetMapping("sub2")
    public  void  m2(String k, Model model) throws  Exception{
        String sql = """
                select *
                from customers where  CustomerName like  ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"%"+k+"%");
        ResultSet resultSet = statement.executeQuery();


        List<String> list = new ArrayList<>();
        try (connection;statement;resultSet){
            while (resultSet.next()){
                String name = resultSet.getString("CustomerName");
                System.out.println("name = " + name);
                list.add(name);
            }
            model.addAttribute("list",list);
        }
    }


    @GetMapping("sub3")
    public void method3(@RequestParam(value = "st" ,defaultValue = "name1") String searchType,
                        @RequestParam(value = "k", defaultValue = "ed") String keyword,
                        Model model) throws SQLException {
        String sql = """
                SELECT * FROM customers
                WHERE
               
                """;

        if (searchType.equals("name1")) {
            sql += "customerName LIKE ?";
        } else if (searchType.equals("name2")) {
            sql += "contactName LIKE ?";
        }

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + keyword + "%");

        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                String customerName = resultSet.getString("customerName");
                String contactName = resultSet.getString("contactName");

                list.add(Map.of("customerName", customerName, "contactName", contactName));
            }
            model.addAttribute("searchType", searchType);
            model.addAttribute("keyword", keyword);
            model.addAttribute("customers", list);
        }

    }



        // jsp 만 보고 나머지 완성하기
        //
        @GetMapping("sub4")
        public  void  m4( @RequestParam(value = "t") String t ,
                          @RequestParam(value = "k" ,defaultValue = "") String k ,
                          Model model) throws Exception{

        String sql = """
                select *
                from employees
                where 
                     """;

        if(t.equals("lname")){
            sql+= "fristName like ?";
        }else  if (t.equals("fname")){
            sql+= "lastName like ?";
        }else  if( t.equals("note")){
            sql+= "Notes like ?";
        }

            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%"+k+"%");


            ResultSet resultSet = statement.executeQuery();

            List<Map<String,String>>list =new ArrayList<>();
            try(connection;statement;resultSet) {
                while(resultSet.next()){
                    Map<String,String> map = new HashMap<>();
                   map.put("lname",resultSet.getString("LastName"));
                   map.put("fname",resultSet.getString("FirstName"));
                   map.put("note",resultSet.getString("Notes"));
                   list.add(map);
                }
                model.addAttribute("t",t);
                model.addAttribute("k",k);
                model.addAttribute("list",list);

            }


        }


















}
