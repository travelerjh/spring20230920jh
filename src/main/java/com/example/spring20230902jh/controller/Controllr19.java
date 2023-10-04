package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.MyDto15;
import com.example.spring20230902jh.domain.MyDto16;
import com.example.spring20230902jh.domain.MyDto77;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main19")
public class Controllr19 {
/*
    String url="jdbc:mariadb://localhost:3306/w3schools";
    String username="root";
    String password ="1234";
  */
    // 아래꺼
    @Autowired
private DataSource  dataSource;

    @RequestMapping("sub1")
    public  String m1(Model model) throws Exception{

        String sql= """
        SELECT customerName 
        FROM customers 
        where CustomerID = 1;
   
                            """;

        Connection connection  = dataSource.getConnection();
        Statement statement= connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        //ResultSet 은 테이블로 넘겨주는 최종값

        try (connection;statement;resultSet) {

        resultSet.next();
        String name =resultSet.getString(1);

        model.addAttribute("cutomerName",name);

}

        return "/main18/sub1";
    }




    @GetMapping("sub2")
    public void m2() throws Exception {

        String sql= """
                select * from  shippers
                """;

        Connection connection =dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        boolean next = resultSet.next();
        resultSet.getString(1); // 1을 가져와라
        resultSet.getString(2); //
        resultSet.getString(3); //
        boolean next1 = resultSet.next();
        resultSet.getString(1); // 1을 가져와라
        resultSet.getString(2); //
        resultSet.getString(3); //
        boolean next2 = resultSet.next();
        resultSet.getString(1); // 1을 가져와라
        resultSet.getString(2); //
        resultSet.getString(3); //
        boolean next3 = resultSet.next();
        resultSet.getString(1); // 1을 가져와라
        resultSet.getString(2); //
        resultSet.getString(3); //

        System.out.println("next = " + next);
        System.out.println("next1 = " + next1);
        System.out.println("next2 = " + next2);
        System.out.println("next3 = " + next3);

    }




    @GetMapping("sub3")
    public  void  m3(Model model)throws Exception {
        List<Map<String,String>>list = new ArrayList<>();


        String sql= """
                select * from  shippers
                """;

        Connection connection =dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


try (connection;statement;resultSet){
    while(resultSet.next()){
        Map<String ,String >map =new HashMap<>();
        map.put("id",resultSet.getString(1));
        map.put("name",resultSet.getString(2));
        map.put("phone",resultSet.getString(3));
        list.add(map);
    }
}
model.addAttribute("shipper",list);
    }

@GetMapping("sub4")
    public  void  m4(Model model) throws  Exception{
        String sql= """
                SELECT CustomerID,CustomerName,City,Country  from customers
                """;
    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
    List<Map<String,String>> list =new ArrayList<>();
    try (connection;statement;resultSet) {
        while (resultSet.next()){
            Map<String,String> map= new HashMap<>();
            map.put("id",resultSet.getString(1));
            map.put("name",resultSet.getString(2));
            map.put("city",resultSet.getString(3));
            map.put("country",resultSet.getString(4));

            list.add(map);
        }

        model.addAttribute("list",list);
    }

}


@GetMapping("sub5")
    public void m5(Model model)throws Exception{
        String sql= """
                SELECT ProductID,ProductName,Unit,Price FROM products
                """;
    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    List<Map<String,Object>> list = new ArrayList<>();

    try(connection; statement; resultSet) {
        // 코드 작성
      while (resultSet.next()){
          Map<String,Object> map= new HashMap<>();
        map.put("ProductID",resultSet.getString(1));
        map.put("ProductName",resultSet.getString(2));
        map.put("Unit",resultSet.getString(3));
        map.put("Price",resultSet.getString(4));

        list.add(map);

      }


    }
    model.addAttribute("list",list);

}



// 자바 BEAN 활용

    @GetMapping("sub6")
    public  void  m6(Model model) throws  Exception{
        String sql= """
                SELECT Address,CustomerID,Country,CustomerName  FROM  customers
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto15> list= new ArrayList<>();

        try(connection; statement; resultSet) {

            while (resultSet.next()){
                MyDto15 dto =new MyDto15();
                dto.setId(resultSet.getInt(1));
                dto.setName(resultSet.getString(2));
                dto.setAddress(resultSet.getString(3));
                dto.setCountry(resultSet.getString(4));
                list.add(dto);
            }
        }
        model.addAttribute("customerList",list);
    }




    @GetMapping("sub7")
    public void method7(Model model) throws Exception {
        String sql = """
                SELECT ProductID, ProductName, Unit, Price
                FROM products
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto16> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {

                MyDto16 myDto16 = new MyDto16();
                myDto16.setId(resultSet.getString(1));
                myDto16.setName(resultSet.getString(2));
                myDto16.setUnit(resultSet.getString(3));
                myDto16.setPrice(resultSet.getString(4));

                list.add(myDto16);
            }
        }

        model.addAttribute("list",list);
    }


    // 이것만 할줄 안면됨
    //sub 88 //sub99



@GetMapping("sub88")
    public  void  m88(Model model) throws  Exception{
        String sql= """
                select SupplierName , SupplierID , Address ,City , PostalCode, Country,Phone from suppliers;
                """;
    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    List<Map<String ,String>> list = new ArrayList<>();

    try(connection; statement; resultSet) {
        while (resultSet.next()){
            Map<String ,String> map =new HashMap<>();
            map.put("name",resultSet.getString(1));
            map.put("id",resultSet.getString(2));
            map.put("address",resultSet.getString(3));
            map.put("city",resultSet.getString(4));
            map.put("postalcode",resultSet.getString(5));
            map.put("country",resultSet.getString(6));
            map.put("phone",resultSet.getString(7));

            list.add(map);
        }
    }
    model.addAttribute("list",list);
}



@GetMapping("sub99")
    public  void  m99(Model model) throws  Exception{
        String sql = """
                      select SupplierName , SupplierID , Address ,City from suppliers;
                    """;
    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    List<MyDto77> list= new ArrayList<>();

    try (connection;statement; resultSet){
        while(resultSet.next()){
            MyDto77 myDto = new MyDto77();

            myDto.setName(resultSet.getString(1));
            myDto.setId(resultSet.getString(2));
            myDto.setAddress(resultSet.getString(3));
            myDto.setCity(resultSet.getString(4));

            list.add(myDto);

        }
    }
    model.addAttribute("mo",list);

}













// DB에 값을 가져오는 방법은  MAP 에 넣는 방법과  javaBeam(DTO) 에 넣는 방법이 있따 .


}