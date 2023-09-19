/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.DAO.IMPL;

import com.webtrasua.DAO.IAccountDao;
import com.webtrasua.DBHelper.DBHelper;
import com.webtrasua.model.account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class AccountDao implements IAccountDao{

    @Override
    public account login(String user, String pass) throws Exception {
        String sql = "select * from account where username = ? and password = ?";
        try{
            Connection conn = new DBHelper().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                return new account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public account check(String user) throws Exception {
        String sql = "select * from account where username = ?";
        try{
            Connection conn = new DBHelper().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                return new account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insert(account accs) throws Exception {
        String sql = "insert into account(username, password, isSell, isAdmin) values (?, ?, 0, 0)";
        try(
                Connection conn = new DBHelper().getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ){
            stmt.setString(1, accs.getUsername());
            stmt.setString(2, accs.getPassword());
            return stmt.executeUpdate() > 0;
            
        }
    }
    
}
