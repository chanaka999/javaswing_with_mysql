/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.utils;

import java.sql.SQLException;

/**
 *
 * @author chanakasandeep
 */
public class Database {

    private static String url = "jdbc:mysql://localhost:3306/new"; 
    private static String username = "root"; 
    private static String password = "";
    
    private static java.sql.Connection conn;
    

    private Database() {}
    
    
    public static java.sql.Connection getConnection() throws SQLException {
        if(conn == null){
            conn = java.sql.DriverManager.getConnection(url, username, password);
        }
        
        return conn;
    }
    
    public static void terminalConnection() throws SQLException{
        if(conn != null){
            conn.close();
        }
    }

}
