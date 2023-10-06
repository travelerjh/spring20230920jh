package com.example.spring20230902jh.controller;

import com.example.spring20230902jh.domain.MyDto15;
import com.example.spring20230902jh.domain.MyDto16;
import com.example.spring20230902jh.domain.MyDto77;
import com.example.spring20230902jh.domain.MyDto99;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main19")
public class Controller19 {
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


        String sql= """
                select * from  shippers
                """;

        Connection connection =dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Map<String,String>>list = new ArrayList<>();


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
        map.put("id",resultSet.getString(1));
        map.put("name",resultSet.getString(2));
        map.put("unit",resultSet.getString(3));
        map.put("price",resultSet.getString(4));

        list.add(map);

      }


    }
    model.addAttribute("list",list);

}



// 자바 BEAN 활용

    @GetMapping("sub6")
    public  void  m6(Model model) throws  Exception{
        String sql= """
                SELECT CustomerID  ,ContactName,Address,Country  FROM  customers
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto15> list= new ArrayList<>();

        try(connection; statement; resultSet) {

            while (resultSet.next()){
                MyDto15 dto =new MyDto15();
                dto.setId(resultSet.getString(1));
                dto.setName(resultSet.getString(2));
                dto.setAddress(resultSet.getString(3));
                dto.setCountry(resultSet.getString(4));
                list.add(dto);
            }
        }
        model.addAttribute("list",list);
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

    @GetMapping("sub8")
    public  void  m8(){
        //jsp 로 foward 만함
    }


    @GetMapping("sub9")
    public  String  m9(Integer id,Model model) throws  Exception{
        String sql = """
                select productid, productname, unit, price from products 
                where ProductID=
                """;
        sql+=id;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto16> list =new ArrayList<>();
        try(connection;statement;resultSet) {
            while(resultSet.next()){
            MyDto16 myDto16 = new MyDto16();
            myDto16.setId(resultSet.getString(1));
            myDto16.setName(resultSet.getString(2));
            myDto16.setUnit(resultSet.getString(3));
            myDto16.setPrice(resultSet.getString(4));

            list.add(myDto16);
            }
        }



        model.addAttribute("list", list);

            return "/main19/sub5";
    }



    @GetMapping("sub10")
    public void method10() {

    }

    @GetMapping("sub11")
    public String method11(Model model,Integer id)throws  Exception{
        // 쿼리 작성 (method6 참고)
        String sql = """
        select  CustomerID  ,ContactName,Address,Country 
        from customers
        where CustomerID = """;
                sql+=id;

        System.out.println("sql = " + sql);
        // 쿼리 실행
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto15> list = new ArrayList<>();

        try (connection;  resultSet;statement){
            while (resultSet.next()){
                MyDto15 myDto15 = new MyDto15();
                myDto15.setId(resultSet.getString(1));
                myDto15.setName(resultSet.getString(2));
                myDto15.setAddress(resultSet.getString(3));
                myDto15.setCountry(resultSet.getString(4));
                System.out.println("myDto15 = " + myDto15);
                list.add(myDto15);
            }
        }

        model.addAttribute("list",list );
        return "/main19/sub6";
    }




@GetMapping("sub12")
    public String m12(Model model ,String city) throws  Exception{
    String sql = """
        select  CustomerID  ,ContactName,Address,Country 
        from customers
WHERE Country = '""" + city + "'";

    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    List<MyDto15> list = new ArrayList<>();

    try (connection;  resultSet;statement){
        while (resultSet.next()){
            MyDto15 myDto15 = new MyDto15();
            myDto15.setId(resultSet.getString(1));
            myDto15.setName(resultSet.getString(2));
            myDto15.setAddress(resultSet.getString(3));
            myDto15.setCountry(resultSet.getString(4));
            System.out.println("myDto15 = " + myDto15);
            list.add(myDto15);
        }
    }
    model.addAttribute("list",list);

        return "/main19/sub6";
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

















@GetMapping("sub90")
public void m90(){
        //그냥 넘기는 기능
}
@GetMapping("sub91")
public void m91(String id, Model model) throws Exception{
        String sql = """
                select CustomerID, CustomerName,Address,City,Country from customers
                where CustomerID=
                """;
            sql+=id;

    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
    List<Map<String,String>> list = new ArrayList<>();

    try (connection;statement;resultSet) {
        while (resultSet.next()){
        Map<String ,String>map =new HashMap<>();
        map.put("id",resultSet.getString(1));
        map.put("name",resultSet.getString(2));
        map.put("address",resultSet.getString(3));
        map.put("city",resultSet.getString(4));
        map.put("country",resultSet.getString(5));
        list.add(map);
        }
    }
    model.addAttribute("list",list);

    }



    //

    @GetMapping("sub92")
    public void  m92(String country,Model model) throws  Exception{
        String sql= """
                select CustomerID, CustomerName,Address,City,Country 
                from customers
                where Country ='""";
        sql+=country+"'";



        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto99> list= new ArrayList<>();

        try (connection;statement;resultSet) {
         while (resultSet.next()){
             MyDto99 myDto99 = new MyDto99();
             myDto99.setId(resultSet.getString(1));
             myDto99.setName(resultSet.getString(2));
             myDto99.setAddress(resultSet.getString(3));
             myDto99.setCity(resultSet.getString(4));
             myDto99.setCountry(resultSet.getString(5));
             System.out.println("myDto99 = " + myDto99);
             list.add(myDto99);
         }
         model.addAttribute("list",list);
        }
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