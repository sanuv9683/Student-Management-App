/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Payment;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface PaymentRepo {
    public boolean add(Payment dto) throws Exception;
    public boolean merge(Payment dto) throws Exception;
    public boolean saveUpdate(Payment dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Payment dto) throws Exception;
    public Payment search(int id) throws Exception;
    public List<Payment> getList() throws Exception; 
    public List<Payment> advancedSearch(String name) throws Exception; 
    public Payment searchForLogin(String email, String pass)throws Exception;
    public List<Payment> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
