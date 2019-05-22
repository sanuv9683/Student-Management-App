/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Payment;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface PaymentService {
   public boolean addPayment(Payment dto) throws Exception;
    public boolean mergePayment(Payment dto) throws Exception;
    public boolean saveUpdatePayment(Payment dto)throws Exception;
    public boolean deletePayment(int id) throws Exception;
    public boolean updatePayment(Payment dto) throws Exception;
    public Payment searchPayment(int id) throws Exception;
    public List<Payment> getPaymentList() throws Exception; 
    public List<Payment> advancedPaymentSearch(String name) throws Exception; 
    public Payment searchPaymentForLogin(String email, String pass)throws Exception;
    public List<Payment> getPaymentListA(String query) throws Exception; 
    public void flushPayment()throws Exception;  
}
