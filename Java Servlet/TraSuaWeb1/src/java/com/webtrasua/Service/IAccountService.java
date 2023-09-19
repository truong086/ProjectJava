/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Service;

import com.webtrasua.model.account;

/**
 *
 * @author ASUS
 */
public interface IAccountService {
    public account login(String user, String pass) throws Exception;
    public account check(String user) throws Exception;
    public boolean insert(account accs) throws Exception;
}
