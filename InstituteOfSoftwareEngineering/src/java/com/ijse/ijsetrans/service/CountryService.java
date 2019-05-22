/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Country;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface CountryService {
    public boolean addCountry(Country dto) throws Exception;
    public boolean deleteCountry(int id) throws Exception;
    public boolean updateCountry(Country dto) throws Exception;
    public Country searchCountry(int id) throws Exception;
    public Country searchCountryByName(String name)throws Exception;
    public List<Country> getAllCountryList() throws Exception;
    public List<Country> getListForQuery(String query) throws Exception; 
}
