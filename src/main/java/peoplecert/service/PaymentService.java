/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peoplecert.entity.Payment;
import peoplecert.repository.PaymentRepo;

/**
 *
 * @author tzortziskapellas
 */
@Transactional
@Service
public class PaymentService {
    
    @Autowired
    private PaymentRepo paymentRepo;
    

    public List<Payment> getPayments() {
        List<Payment> payments = paymentRepo.findall();
        return payments;
    }

    public void addPayment(Payment payment) {
        paymentRepo.save(payment);
    }

    public void deletePayment(int id) {
        paymentRepo.delete(Payment.class, id);
    }

    public Payment getPaymentById(int ccode) {
        return paymentRepo.find(ccode);
    }

    public Payment updatePayment(Payment payment) {//payment argument contains the new data from the form
        return paymentRepo.save(payment);
    }
}
