/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Service.IMPL;

import com.webtrasua.DAO.IAccountDao;
import com.webtrasua.DAO.IMPL.AccountDao;
import com.webtrasua.Service.IAccountService;
import com.webtrasua.model.account;

/**
 *
 * @author ASUS
 */
public class AccountService implements IAccountService{
    private IAccountDao dao;
    public AccountService(){
        dao = new AccountDao();
    }
    @Override
    public account login(String user, String pass) throws Exception {
        return dao.login(user, pass);
    }

    @Override
    public account check(String user) throws Exception {
        return dao.check(user);
    }

    @Override
    public boolean insert(account accs) throws Exception {
        return dao.insert(accs);
    }
    
}
