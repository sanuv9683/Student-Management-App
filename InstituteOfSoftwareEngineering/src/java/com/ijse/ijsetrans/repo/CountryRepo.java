/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Country;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface CountryRepo {
    public boolean add(Country dto) throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Country dto) throws Exception;
    public Country search(int id) throws Exception;
    public Country searchByName(String name)throws Exception;
    public List<Country> getList() throws Exception;
    public List<Country> getListA(String query) throws Exception; 
    
}
