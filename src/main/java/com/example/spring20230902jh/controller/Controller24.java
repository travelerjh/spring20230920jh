package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.MyDto17Supplier;
import com.example.spring20230902jh.domain.MyDto18Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main24")
public class Controller24 {
   @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public  void  m1() throws  Exception{
        String sql = """
                insert into  products(ProductName, SupplierID, CategoryID, Unit, Price)
                values (?,?,?,?,?);
                    """;
            // 하나의 행을 넣고자함

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"돈까스");
        statement.setInt(2,3);
        statement.setInt(3,4);
        statement.setString(4,"한장");
        statement.setInt(5,500);

        //ResultSet resultSet = statement.executeQuery();
        // SELECT는   이거를 사용했지만

        //statement.executeUpdate();
        int i = statement.executeUpdate();

        if(i ==1 ){
            System.out.println("잘됨 = " + i);
        }else {
            System.out.println("문제 있음");
        }
    }



    @PostMapping("sub2")
    public  void  m2(MyDto17Supplier supplier)throws  Exception{
        String sql = """
                insert into suppliers ( SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
                values(?,?,?,?,?,?,?)
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,supplier.getSupplierName());
        statement.setString(2,supplier.getContactName());
        statement.setString(3,supplier.getAddress());
        statement.setString(4,supplier.getCity());
        statement.setString(5,supplier.getPostalCode());
        statement.setString(6,supplier.getCountry());
        statement.setString(7,supplier.getPhone());

        int i = statement.executeUpdate();

        if(i==1){
            System.out.println("성공");

        }else {
            System.out.println("실패");
        }
    }



    @GetMapping("sub5")
    public void  m5(MyDto18Employee myDto18Employee) throws  Exception{
        String  sql = """
                    insert into employees ( LastName, FirstName, BirthDate, Photo, Notes)
                     values (?,?,?,?,?)
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,myDto18Employee.getLastName());
        statement.setString(2,myDto18Employee.getFirstName());
        statement.setString(3,myDto18Employee.getBirthDate());
        //statement.setString(3,Timestamp.valueOf(employee.getBrithDate().atStar);

        statement.setString(4,myDto18Employee.getPhoto());
        statement.setString(5,myDto18Employee.getNotes());
        int i = statement.executeUpdate();
        if(i==1){
            System.out.println("성공" + i);
        }else {
            System.out.println("실패");
        }
    }


    @GetMapping("sub4")
    public void m4(){

    }























}
