package com.example.demo.bean;


import java.sql.Connection;
import java.sql.DriverManager;

public class DataLink {
    static public Connection getConn() {
        String serverName="com.mysql.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306/jdbc   ts?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String userName="root";
        String userPwd="a13618226982";
        try {
            Class.forName(serverName);
            Connection tmp = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("连接数据库....");
            return tmp;
        }
        catch(Exception e) {
            System.out.println("连接数据库失败....");
            System.out.println(e);
        }
        return null;
    }

}

