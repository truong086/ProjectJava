/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Controller;

import com.webtrasua.Service.IAccountService;
import com.webtrasua.Service.IMPL.AccountService;
import com.webtrasua.model.account;

/**
 *
 * @author ASUS
 */
public class AccountController {
    private IAccountService dao;
    public AccountController(){
        dao = new AccountService();
    }
    
    public account login(String user, String pass) throws Exception {
        return dao.login(user, pass);
    }
    
    public account check(String user) throws Exception {
        return dao.check(user);
    }
    public boolean insert(account accs) throws Exception{
        return dao.insert(accs);
    }
}
