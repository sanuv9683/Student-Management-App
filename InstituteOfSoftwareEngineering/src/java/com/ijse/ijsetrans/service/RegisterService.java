/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Register;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface RegisterService {
     public boolean addRegister(Register dto) throws Exception;
    public boolean mergeRegister(Register dto) throws Exception;
    public boolean saveUpdateRegister(Register dto)throws Exception;
    public boolean deleteRegister(int id) throws Exception;
    public boolean updateRegister(Register dto) throws Exception;
    public Register searchRegister(int id) throws Exception;
    public List<Register> getRegisterList() throws Exception; 
    public List<Register> advancedRegisterSearch(String name) throws Exception; 
    public Register searchRegisterForLogin(String email, String pass)throws Exception;
    public List<Register> getRegisterListA(String query) throws Exception; 
    public void flushRegister()throws Exception;
}
