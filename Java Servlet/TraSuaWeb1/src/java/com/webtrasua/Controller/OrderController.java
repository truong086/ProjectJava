/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Controller;

import com.webtrasua.Service.IMPL.OrderService;
import com.webtrasua.Service.IOrderService;
import com.webtrasua.model.account;
import com.webtrasua.model.carts;

/**
 *
 * @author ASUS
 */
public class OrderController {
    private IOrderService daoService;
    public OrderController(){
        daoService = new OrderService();
    }
    public void insert(account ac, carts car) throws Exception {
        daoService.insert(ac, car);
    }
}
