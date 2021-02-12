/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import peoplecert.entity.Payment;

/**
 *
 * @author tzortziskapellas
 */
@Repository
public class PaymentRepo extends HibernateUtil<Payment> implements CrudInt<Payment> {
    
    @Override
    public Payment find(int id) {
        return super.find(Payment.class, id);
    }
    
    @Override
    public List<Payment> findall() {
        return super.findAll("Payment.findAll");
    }

   
    
    @Override
    public Payment save(Payment payment) {
        return super.save(payment);
    }

    @Override
    public boolean delete(int id) {
        return super.delete(Payment.class, id);
    }
    
}
