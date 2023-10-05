package com.example.spring20230902jh.controller;


import com.example.spring20230902jh.domain.MyDto15;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main20")
public class Controller20 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1() {

    }

    @GetMapping("sub2")
    public String method2(String id, Model model) throws SQLException {
        // 쿼리 작성 (method6 참고)
        String sql = """
                SELECT CustomerID, CustomerName, Address, Country
                FROM customers
                WHERE CustomerID = ?
                """;
        System.out.println("sql = " + sql);
        // 쿼리 실행
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        ResultSet resultSet = statement.executeQuery();

        List<MyDto15> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            // 실행 결과 처리 (method6 참고, MyDto15 사용)
            while (resultSet.next()) {
                MyDto15 dto = new MyDto15();
                dto.setId(resultSet.getString(1));
                dto.setName(resultSet.getString(2));
                dto.setAddress(resultSet.getString(3));
                dto.setCountry(resultSet.getString(4));

                list.add(dto);
            }
        }
        // 처리한 결과 model에 attribute로 넣고
        model.addAttribute("customerList", list);
        return "/main19/sub6";
    }


    @GetMapping("sub3")
    public  void m3(String id) throws  Exception{
    String sql = """
            select customerId, customerName ,country 
            FROM customers 
            WHERE customerId= ?
            """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        //  ?표를 체워넣는 코드     1번째에  어떤값이 들어갈지
    statement.setString(1,id);
    ResultSet resultSet = statement.executeQuery();
    try (connection;statement;resultSet){
           
        while (resultSet.next()){
            System.out.println("고객 정보");
            System.out.println("id = " + resultSet.getString(1));
            System.out.println("name = " + resultSet.getString(2));
        }
    }
    }


    // /main20/sub4?pid=5
    @GetMapping("sub4")
        public void m4(String pid) throws  Exception{
        String sql= """
                SELECT productId ,productName
                FROM products
                WHERE productId = ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1,pid);
        ResultSet resultSet = statement.executeQuery();

        try (connection;statement;resultSet){
            while (resultSet.next()){

                System.out.println("상품점보");
                System.out.println("상품번호 = " + resultSet.getInt(1));
                System.out.println("상품명 = " + resultSet.getString(2));

            }
        }
    }

    //문제

    @GetMapping("sub5")
    public  void  m5(String country) throws  Exception{

        String sql = """
            select customerId, customerName ,country 
            FROM customers 
            WHERE country= ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,country);
        ResultSet resultSet = statement.executeQuery();

        try( connection;statement;resultSet) {
            while (resultSet.next()){
                System.out.println("고객이름");
                System.out.println("고객아이디 = " + resultSet.getString(1));
                System.out.println("고객이름 = " + resultSet.getString(2));
                System.out.println("고객나라 = " + resultSet.getString(3));
            }
        }
    }

    @GetMapping("sub6")
    public  void  m6(String c1 , String c2 )throws  Exception{
        String sql= """
                select CustomerName ,country
                from customers
                where country =? or country=?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,c1);
            statement.setString(2,c2);
        
        ResultSet resultSet = statement.executeQuery();

        try (connection;statement;resultSet){
            while (resultSet.next()){
                System.out.println("고객 목록");
                System.out.println("resultSet.getString(1) = " + resultSet.getString(1));
                System.out.println("resultSet.getString(1) = " + resultSet.getString(2));
            }
        }
    }




//   /main20/sub9?country=spain&country=uk&country=mexico
    @GetMapping("sub9")
        public void method9(@RequestParam("country") List < String > countryList) throws SQLException {
            String questionMarks = "";
            for (int i = 0; i < countryList.size(); i++) {
                questionMarks += "?";
                if (i < countryList.size()-1) {
                    questionMarks += ", ";
                }
            }
            // 특정 국가에 속한 고객들 조회
            String sql = """
                SELECT *
                FROM customers
                WHERE country IN ("""
                         +
                         questionMarks
                         +
                         """
                         )
                         """;
//        System.out.println("sql = " + sql);
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            for (int i = 0; i < countryList.size(); i++) {
                statement.setString(i + 1, countryList.get(i));
            }
            ResultSet resultSet = statement.executeQuery();

            try (connection; statement; resultSet) {
                System.out.println("고객 목록");
                while (resultSet.next()) {
                    String name = resultSet.getString(2);
                    String country = resultSet.getString(7);

                    System.out.println(name + " : " + country);
                }
            }
        }


    @GetMapping("sub10")
    public void  m10(Model model) throws  Exception{
        // 공급자의 국가 목록 조회
        String sql = """
                    select distinct country 
                    from suppliers 
                        
                    """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();
        List<String> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {




                list.add(resultSet.getString(1));
            }
        }


        model.addAttribute("countryList",list);
    }






























    // 이건 다시 풀어 보자
    //
    // 개인적으로 좋합 문제
    //
    // 너무 좋은 문제
    @GetMapping("sub7")
    public void m7(){

    }

    @GetMapping("sub8")
    public  void m8(Integer min, Integer max , Model model)throws  Exception{
        String sql="""
                select *
                from products 
                where price > ? and price < ?;
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,min);
        statement.setInt(2,max);
        ResultSet resultSet = statement.executeQuery();

        System.out.println(min);
        System.out.println(max);


        List<Map<String,Object>> list = new ArrayList<>();

        try (connection;statement;resultSet){
            while (resultSet.next()){
                Map<String,Object> map= new HashMap<>();
                map.put("productid",resultSet.getInt(1));
                map.put("productName",resultSet.getString(2));
                map.put("price",resultSet.getInt(3));
                list.add(map);
            }
        }

        model.addAttribute("list",list);
    }
}



