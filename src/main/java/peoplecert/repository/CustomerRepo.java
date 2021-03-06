/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import peoplecert.entity.Customer;

/**
 *
 * @author tzortziskapellas
 */
@Repository
public class CustomerRepo extends HibernateUtil<Customer> implements CrudInt<Customer>{

    @Override
    public Customer find(int id) {
        return super.find(Customer.class, id);
    }

    @Override
   public Customer save(Customer customer){
       return super.save(customer);
   }

    @Override
    public List<Customer> findall() {
        return super.findAll("Customer.findAll");
    }

    @Override
    public boolean delete(int id) {
        return super.delete(Customer.class, id);
    }
   
}
