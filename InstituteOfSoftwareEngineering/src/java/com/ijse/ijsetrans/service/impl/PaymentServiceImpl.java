/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Payment;
import com.ijse.ijsetrans.repo.PaymentRepo;
import com.ijse.ijsetrans.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sanu Vithanage
 */
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{
    
    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public boolean addPayment(Payment dto) throws Exception {
        return paymentRepo.add(dto);
    }

    @Override
    public boolean mergePayment(Payment dto) throws Exception {
        return paymentRepo.merge(dto);
    }

    @Override
    public boolean saveUpdatePayment(Payment dto) throws Exception {
        return paymentRepo.saveUpdate(dto);
    }

    @Override
    public boolean deletePayment(int id) throws Exception {
        return paymentRepo.delete(id);
    }

    @Override
    public boolean updatePayment(Payment dto) throws Exception {
        return paymentRepo.update(dto);
    }

    @Override
    public Payment searchPayment(int id) throws Exception {
        return paymentRepo.search(id);
    }

    @Override
    public List<Payment> getPaymentList() throws Exception {
        return paymentRepo.getList();
    }

    @Override
    public List<Payment> advancedPaymentSearch(String name) throws Exception {
        return paymentRepo.advancedSearch(name);
    }

    @Override
    public Payment searchPaymentForLogin(String email, String pass) throws Exception {
        return paymentRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Payment> getPaymentListA(String query) throws Exception {
        return paymentRepo.getListA(query);
    }

    @Override
    public void flushPayment() throws Exception {
         paymentRepo.flush();
    }
    
}
