package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class Demo1Application {

//    public static void main(String[] args) {
//        SpringApplication.run(Demo1Application.class, args);
//    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/springdb2";
        String userName = "root";
        String password = "111111";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from member");

        resultSet.next();
        String id = resultSet.getString("id");
        System.out.println(id);

        resultSet.close();
        statement.close();
        connection.close();
    }

}
