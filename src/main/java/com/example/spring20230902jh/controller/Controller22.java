package com.example.spring20230902jh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

@Controller
@RequestMapping("main22")
public class Controller22 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public  void  m1(Integer page) throws  Exception{
        String sql = """
                    select customerid  id 
                    , customername name 
                    from customers 
                    order by id
                    limit  ?,?;
                    """;


        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1,(page -1)*10);
        statement.setInt(2,10);
        System.out.println("statement = " + statement);
        
        ResultSet resultSet = statement.executeQuery();

        try (resultSet;connection;statement){
            System.out.println("고객 목록");
        while (resultSet.next()){
            String id= resultSet.getString("id");
            String name= resultSet.getString("name");
            System.out.println(id + " : " + name );
        }
        }
    }


    //페이지당 7 개씩 공급자 목록 조회
    // mian/sub2?p=3

    @GetMapping("sub2")
    public  void  m2(Integer p ,Model model) throws Exception {
        String sql = """
                select SupplierID id , SupplierName name ,Address  ,Country 
                from suppliers 
                order by  SupplierID 
                limit  ?, ?;
                 """;



        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
         statement.setInt(1,(p-1)*7);
         statement.setInt(2,7);
        System.out.println("statement = " + statement);

        ResultSet resultSet = statement.executeQuery();

        List<Map<String, String>> list = new ArrayList<>();
        try (connection;statement; resultSet){
            while (resultSet.next()){
                Map<String ,String> map= new HashMap<>();
                map.put("SupplierID" , resultSet.getString(1));
                map.put("SupplierName", resultSet.getString(2));
                map.put("Address",resultSet.getString(3));
                map.put("Country",resultSet.getString(4));
                list.add(map);
                System.out.println("map = " + map);


            }
        }

        // 전체 개시물 구하기

        String sql1 = """
                SELECT COUNT(*) 
                FROM suppliers
                """;
        Connection connection1 = dataSource.getConnection();
        Statement statement1 = connection1.createStatement();
        ResultSet resultSet1 = statement1.executeQuery(sql1);

        try (connection1; statement1; resultSet1) {
            if (resultSet1.next()) {
                int countAll = resultSet1.getInt(1);
                // 마지막 페이지 번호
                int lastPageNumber = ((countAll - 1) / 7) + 1;
                model.addAttribute("lastPageNumber", lastPageNumber);
            }
        }
        model.addAttribute("supplierList", list);
    }


//main22 /sub3 p=2
    //2페이지의 고객 목록을 jsp에 테이블 형식 (id, name ) 출력
    // page  번호로 링크 생성
    // 1페이지에 15개씩 생성

    /*
select count(*)
from customers;

     */

    @GetMapping("sub3")
    public void method3(@RequestParam(value = "p", defaultValue = "1") Integer page,
                        Model model) throws SQLException {
        String sql = """
                SELECT customerId id,
                       customerName name
                FROM customers
                ORDER BY id
                LIMIT ?, 5
                """;

        String sql1 = """
                SELECT COUNT(*) FROM customers
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, (page - 1) * 5);
        ResultSet resultSet = statement.executeQuery();

        Statement statement1 = connection.createStatement();
        ResultSet resultSet1 = statement1.executeQuery(sql1);

        int lastPageNumber = 1;
        try (connection; statement; statement1; resultSet; resultSet1) {
            if (resultSet1.next()) {
                int countAll = resultSet1.getInt(1);
                lastPageNumber = (countAll - 1) / 5 + 1;

                model.addAttribute("lastPageNumber", lastPageNumber);
            }

            List<Map<String, Object>> list = new ArrayList<>();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                list.add(Map.of("id", id, "name", name));
            }
            model.addAttribute("customerList", list);
        }

        model.addAttribute("currentPage", page);

        int leftPageNumber = (page - 1) / 5 * 5 + 1;
        int rightPageNumber = leftPageNumber + 4;
        int prevPageNumber = leftPageNumber - 5;
        int nextPageNumber = rightPageNumber + 1;

        rightPageNumber = Math.min(rightPageNumber, lastPageNumber);

        model.addAttribute("prevPageNumber", prevPageNumber);
        model.addAttribute("nextPageNumber", nextPageNumber);
        model.addAttribute("leftPageNumber", leftPageNumber);
        model.addAttribute("rightPageNumber", rightPageNumber);

    }



    /*
    select count(*)
    from customers;

 */


    //main22 /sub33 p=2
    //2페이지의 고객 목록을 jsp에 테이블 형식 (id, name ) 출력
    // page  번호로 링크 생성
    // 1페이지에 15개씩 생성
    @GetMapping("sub33")
    public void  m33(Model model , Integer nowpage) throws  Exception{
        String sql1 = """
                 SELECT customerId id,
                 customerName name
                 FROM customers
                 ORDER BY id
                 LIMIT ?, ?                             
                """;

        // 페이지의 끝을 아는 쿼리를 만들자

        String sql2= """
                select count(*) from customers
                """;
        // ? 를 해결하는 쿼리
        Connection connection1 = dataSource.getConnection();
        PreparedStatement statement1 = connection1.prepareStatement(sql1);
        statement1.setInt(1, ((nowpage-1)*5)  );
        statement1.setInt(2, 5);
        System.out.println("statement1 = " + statement1);
        ResultSet resultSet1 = statement1.executeQuery();

        // 결과를 담을 리스트를 만들자
        List<Map<String ,String>> list =new ArrayList<>();

        try (connection1;statement1;resultSet1){
            while ( resultSet1.next()){
                Map<String ,String >map = new HashMap<>();
                map.put("customerId",resultSet1.getString("id"));
                map.put("customerName", resultSet1.getString("name"));

                list.add(map);
            }
        }

        Connection connection2=dataSource.getConnection();
        Statement  statement2 =connection2.createStatement();
        ResultSet resultSet2 = statement2.executeQuery(sql2);
        try  (connection2;statement2;resultSet2){
            if(resultSet2.next()){
                int countall =  resultSet2.getInt(1);
                //91
                System.out.println("countall = " + countall);
                int lastpage = ((countall-1)/5)+1;
                System.out.println("lastpage = " + lastpage);

                Integer lp =  countall;

                model.addAttribute("lastpage",lastpage);
            }

        }

        /*
            이건 꼭 알고 가자  미래의 재희야
             이건 페이징 기법에서   시작점과 끝점을잡는거란다
             귀찮더라도 알고 가자

        int leftpage = (nowpage/7)*7 +1;
        int rightpage = leftpage+6;
        */

        int leftpage = (nowpage/5)*5 +1;
        int rightpage = leftpage+4;

        model.addAttribute("leftpage",leftpage);
        model.addAttribute("rightpage",rightpage);


        /*
        이건  <  ,  >   a 테그 활용하는거야
        */
        int  past = leftpage -5;
        int  next = rightpage +1;
        model.addAttribute("past",past);
        model.addAttribute("next",next);


        model.addAttribute("list",list);


    }










}
