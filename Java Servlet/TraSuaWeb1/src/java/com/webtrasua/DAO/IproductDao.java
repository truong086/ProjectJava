/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtrasua.DAO;

import com.webtrasua.model.product;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IproductDao {
    public boolean insert(product p) throws Exception;
    public boolean edit(product p) throws Exception;
    public boolean delete(String p) throws Exception;
    public List<product> findAll() throws Exception;
    public List<product> findOneCategory(String id) throws Exception;
    public product findOne(String id) throws Exception;
    public List<product> Search(String name) throws Exception;
    public List<product> productNew() throws Exception;
    public List<product> productMax() throws Exception;
}
