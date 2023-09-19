/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class DBHelper {
    private Connection conn;
    public Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/QuanLyQuanTraSua";
        String user = "root";
        String pass = "root";
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
    }
    
    public static void main(String[] args) {
        try{
            System.out.print(new DBHelper().getConnection());
            System.out.print("Kết nối thành công");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
