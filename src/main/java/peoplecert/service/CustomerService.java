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
    

    public List<Customer> getCustomers() {
        List<Customer> customers = customerRepo.findall();
        return customers;
    }

    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    public void deleteCustomer(int id) {
        customerRepo.delete(Customer.class, id);
    }

    public Customer getCustomerById(int ccode) {
        return customerRepo.find(ccode);
    }

    public Customer updateCustomer(Customer customer) {//customer argument contains the new data from the form
        return customerRepo.save(customer);
    }
}
