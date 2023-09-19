/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Controller;

import com.webtrasua.DAO.IMPL.ProductDao;
import com.webtrasua.DAO.IproductDao;
import com.webtrasua.Service.IMPL.productService;
import com.webtrasua.Service.IproductService;
import com.webtrasua.model.product;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ProductController {
    private IproductService dao;
    public ProductController(){
        dao = new productService();
    }
    public boolean insert(product pr) throws Exception {
        return dao.insert(pr);
    }

    public boolean edit(product pr) throws Exception {
        return dao.edit(pr);
    }

    public boolean delete(String pr) throws Exception {
        return dao.delete(pr);
    }

    public List<product> findAll() throws Exception {
        return dao.findAll();
    }
    public List<product> findOneCategory(String id) throws Exception {
        return dao.findOneCategory(id);
    }
    
    public product findOne(String id) throws Exception {
        return dao.findOne(id);
    }
    public List<product> Search(String name) throws Exception {
        return dao.Search(name);
    }
    
    public List<product> productNew() throws Exception {
        return dao.productNew();
    }
    public List<product> productMax() throws Exception {
        return dao.productMax();
    }
}
