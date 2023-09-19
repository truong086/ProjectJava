/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.Service.IMPL;

import com.webtrasua.DAO.ICategoryDao;
import com.webtrasua.DAO.IMPL.CategoryDao;
import com.webtrasua.Service.ICategoryService;
import com.webtrasua.model.category;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class categoryService implements ICategoryService{

    private ICategoryDao dao;
    
    public categoryService(){
       dao = new CategoryDao();
    }
    
    @Override
    public boolean insert(category ca) throws Exception {
        return dao.insert(ca);
    }

    @Override
    public boolean edit(category ca) throws Exception {
         return dao.edit(ca);
    }

    @Override
    public boolean delete(String ca) throws Exception {
        return dao.delete(ca);
    }

    @Override
    public List<category> findAll() throws Exception {
        return dao.findAll();
    }

    @Override
    public category findOne(int id) throws Exception {
        return dao.findOne(id);
    }
    
}
