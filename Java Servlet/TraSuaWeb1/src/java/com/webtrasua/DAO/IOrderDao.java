/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.DAO;

import com.webtrasua.model.account;
import com.webtrasua.model.carts;
import com.webtrasua.model.order;

/**
 *
 * @author ASUS
 */
public interface IOrderDao {
    public void insert(account ac, carts car) throws Exception;
}
