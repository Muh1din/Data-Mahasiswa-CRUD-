/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author din-actnow
 */
public class koneksi {
    private static HikariDataSource dataSource;
    
    static {
        HikariConfig config = new HikariConfig();
        // configurasi database
        config.setJdbcUrl("jdbc:mysql://localhost:3306/crud");
        config.setUsername("root");
        config.setPassword("");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        
        // pool config
        config.setMaximumPoolSize(5);
        config.setMinimumIdle(2);
        config.setIdleTimeout(60 * 30);
        config.setConnectionTimeout(60 * 1000);
        
        dataSource = new HikariDataSource(config);
    }
    
    public static Connection getConnection()throws SQLException{
        return dataSource.getConnection();
    }
    
    public static void closeConnection(){
        if(dataSource != null){
            dataSource.close();
        }
    }
    
//    // test koneksi manual
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/crud";
//        String userName = "root";
//        String password = "";
//        
//        try(Connection conn = DriverManager.getConnection(url,userName,password)){
//            System.out.println("koneksi berhasil");
//        }catch (SQLException e ){
//            System.out.println("koneksi gagal");
//        }
//    }
}
