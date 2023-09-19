/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Service.IMPL;

import com.webtrasua.DAO.IMPL.OrderDao;
import com.webtrasua.DAO.IOrderDao;
import com.webtrasua.Service.IOrderService;
import com.webtrasua.model.account;
import com.webtrasua.model.carts;

/**
 *
 * @author ASUS
 */
public class OrderService implements IOrderService{
    private IOrderDao dao;
    public OrderService(){
        dao = new OrderDao();
    }

    @Override
    public void insert(account ac, carts car) throws Exception {
        dao.insert(ac, car);
    }
    
}
