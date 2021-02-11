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
import peoplecert.entity.Orders;
import peoplecert.repository.OrdersRepo;

/**
 *
 * @author tzortziskapellas
 */
@Transactional
@Service
public class OrdersService {
    
    @Autowired
    private OrdersRepo ordersRepo;
    

    public List<Orders> getOrderss() {
        List<Orders> orders = ordersRepo.findall();
        return orders;
    }

    public void addOrders(Orders orders) {
        ordersRepo.save(orders);
    }

    public void deleteOrders(int id) {
        ordersRepo.delete(Orders.class, id);
    }

    public Orders getOrdersById(int ccode) {
        return ordersRepo.find(ccode);
    }

    public Orders updateOrders(Orders orders) {//orders argument contains the new data from the form
        return ordersRepo.save(orders);
    }
}
