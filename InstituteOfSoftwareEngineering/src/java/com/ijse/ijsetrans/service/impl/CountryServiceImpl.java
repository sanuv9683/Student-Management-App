/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Country;
import com.ijse.ijsetrans.repo.CountryRepo;
import com.ijse.ijsetrans.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sanu
 */
@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepo countryService;

    @Override
    public boolean addCountry(Country dto) throws Exception {
        return countryService.add(dto);
    }

    @Override
    public boolean deleteCountry(int id) throws Exception {
        return countryService.delete(id);
    }

    @Override
    public boolean updateCountry(Country dto) throws Exception {
        return countryService.update(dto);
    }

    @Override
    public Country searchCountry(int id) throws Exception {
        return countryService.search(id);
    }

    @Override
    public List<Country> getAllCountryList() throws Exception {
        return countryService.getList();
    }

    @Override
    public Country searchCountryByName(String name) throws Exception {
        return countryService.searchByName(name);
    }

    @Override
    public List<Country> getListForQuery(String query) throws Exception {
        return countryService.getListA(query);
    }

}
