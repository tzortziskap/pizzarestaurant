/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peoplecert.entity.Customer;
import peoplecert.repository.CustomerRepo;

/**
 *
 * @author tzortziskapellas
 */
@Transactional
@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepo customerRepo;
    
    public void addCustomer(Customer customer){
        customerRepo.save(customer);
    }
}
